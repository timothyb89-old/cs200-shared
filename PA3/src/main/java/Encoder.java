/**
 *
 *   Encoder takes user's input string and conver it to a bit sequence encoded by
 *   Huffman coding algorithm
 *
 *  Encoding process includes multiple steps:
 *  1. Create a frequency table with first two columns: charactor and frequency
 *  2. Create a Huffman tree based on the frequency table
 *  3. Create a list of code based on the Huffman tree created in the step 2.
 *     And store codes in the frequency table
 *  4. Encode user's input string based on the code in the frequency table
 *
 */


public class Encoder {
    private HuffmanTree ht;
    private String inputStr;
    private HuffmanFrequencyTable hft;


    // Constructor
    public Encoder(String _inputStr){
		this.inputStr = _inputStr;
		// Next line will build a Huffman Frequency Table for the inputStr
		this.hft = new HuffmanFrequencyTable(inputStr); 
		// Next line will build a Huffman Tree for the inputStr based on hft
		this.buildTree();
		// Next line will build a list of the Huffman codes based on the ht
		this.buildCode((HuffmanTreeNode)(ht.getRootItem()), "");
    }


    // Returns the HuffmanFrequencTable Object: This will be used for the grading
    public HuffmanFrequencyTable getFreqTable(){
		return hft;
    }

    // Returns the HuffmanTree Object: This will be used for decoding 
    public HuffmanTree getHuffmanTree(){
		return ht;
    }


    // Returns a bit sequence string encoded by Huffman Coding algorithm
    // NOTE: please save your bit sequence as a String
    // For example if your result contains 5 bits of 11000
    // store it as "11000". PA3 DOES NOT require bit operations.
    public String encodeString(){
		// add your code here
    }

    // builds a Huffman Tree with the global variable inputStr based on the 
    // Huffman Frequency Table hft (global)
    private void buildTree(){
		// add your code here
    }
    
    // builds a list of the Huffman codes based on ht 
    private void buildCode(HuffmanTreeNode root, String code){
		// add your code here
    }
    	




      
}

