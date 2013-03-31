
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;


/**
 *
 * Encoder takes user's input string and conver it to a bit sequence encoded by
 * Huffman coding algorithm
 *
 * Encoding process includes multiple steps: 1. Create a frequency table with
 * first two columns: charactor and frequency 2. Create a Huffman tree based on
 * the frequency table 3. Create a list of code based on the Huffman tree
 * created in the step 2. And store codes in the frequency table 4. Encode
 * user's input string based on the code in the frequency table
 *
 */
public class Encoder {

	private HuffmanTree ht;
	private String input;
	private HuffmanFrequencyTable freqTable;
	
	private Map<Character, String> dictionary;

	// Constructor
	public Encoder(String input) {
		this.input = input;
		
		// Next line will build a Huffman Frequency Table for the inputStr
		this.freqTable = new HuffmanFrequencyTable(input);
		
		// Next line will build a Huffman Tree for the inputStr based on hft
		this.buildTree();
		
		this.buildDictionary();
	}

	// Returns the HuffmanFrequencTable Object: This will be used for the grading
	public HuffmanFrequencyTable getFreqTable() {
		return freqTable;
	}

	// Returns the HuffmanTree Object: This will be used for decoding 
	public HuffmanTree getHuffmanTree() {
		return ht;
	}

	// builds a Huffman Tree with the global variable inputStr based on the 
	// Huffman Frequency Table hft (global)
	private void buildTree() {
		// create a new priority queue
		PriorityQueue<HuffmanTreeNode> queue = new PriorityQueue<HuffmanTreeNode>();
		
		// add new nodes, they'll be sorted automatically
		for (TableItem item : freqTable.getTable()) {
			queue.add(new HuffmanTreeNode(item));
		}
		
		// build up the tree: decreases from left (greatest) to right (smallest)
		while (queue.size() > 1) {
			// get the smallest (head) element
			HuffmanTreeNode right = queue.poll();
			
			// get the second smallest element
			HuffmanTreeNode left = queue.poll();
			
			// note: left,right order is reversed because left is greatest and
			// we pulled the smallest element from the queue first
			
			HuffmanTreeNode combined = new HuffmanTreeNode(left, right);
			
			// reinsert the combined node
			queue.add(combined);
		}
		
		HuffmanTreeNode root = queue.poll();
		ht = new HuffmanTree(root);
	}
	
	/**
	 * Builds the dictionary for mapping chars to their encoded binary strings
	 */
	private void buildDictionary() {
		dictionary = new HashMap<Character, String>();
		
		dict("", (HuffmanTreeNode) ht.getRootItem());
		
		// update the codes in TableItem
		// we don't use them but the test code does
		for (Entry<Character, String> e : dictionary.entrySet()) {
			freqTable.getItem(e.getKey()).setCode(e.getValue());
		}
	}
	
	private void dict(String path, HuffmanTreeNode node) {
		if (node.isLeafNode()) {
			dictionary.put(node.getLetter(), path);
			return;
		}
		
		if (node.getLeft() != null) {
			dict(path + "0", (HuffmanTreeNode) node.getLeft());
		}
		
		if (node.getRight() != null) {
			dict(path + "1", (HuffmanTreeNode) node.getRight());
		}
	}
	
	// Returns a bit sequence string encoded by Huffman Coding algorithm
	// NOTE: please save your bit sequence as a String
	// For example if your result contains 5 bits of 11000
	// store it as "11000". PA3 DOES NOT require bit operations.
	public String encodeString() {
		StringBuilder ret = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			ret.append(dictionary.get(c));
			//ret.append(" "); // TODO: REMOVE THIS, DEBUGGING ONLY
		}
		
		return ret.toString();
	}
	
	public static void main(String[] args) {
		String str = "hello world";
		
		Encoder encoder = new Encoder(str);
		HuffmanTree tree = encoder.getHuffmanTree();
		System.out.println(tree.exportDot());
		
		String encoded = encoder.encodeString();
		System.out.println("\n\nEncoded: " + encoded);
		
		String decoded = new Decoder(tree, encoded).decode();
		System.out.println("Decoded: " + decoded);
		
		int originalBits = str.length() * 8;
		int encodedBits = encoded.length();
		double saved = 100 * ((double) encodedBits / (double) originalBits);
		
		System.out.printf("Bits: %d (unencoded), %d (encoded), %.3f%% ratio.\n",
				originalBits, encodedBits, saved);
		System.out.println("Equal? " + (str.equals(decoded)));
	}
	
}
