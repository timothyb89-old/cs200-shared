
/**
 * HuffmanTreeNode.java
 *
 * This class is an implementation of TreeNode.java interface You should
 * implement all of the methods in the Tree interface. If you need to add more
 * methods, please add your own methods. Since this node will store a java
 * character and frequencies for creating a list of Huffman code, you can add
 * member methods related to the functionality.
 */
public class HuffmanTreeNode implements TreeNode {

	/**
	 * add your member properties here
	 */
	private TableItem item;
	private TreeNode left, right;
	
	/**
	 * All characters in this tree node, used for display and tree searching
	 */
	private String allChars;

	/**
	 * Constructs a new leaf node containing a TableItem. For parent nodes,
	 * use {@link HuffmanTreeNode(TreeNode, TreeNode)}
	 * @param item the data for this node
	 */
	public HuffmanTreeNode(TableItem item) {
		this.item = item;
		
		// a name to display while debugging
		allChars = String.valueOf(item.getInputChar());
	}
	
	/**
	 * Constructs a new leaf node containing child items. This creates a sort
	 * of meta-item that contains combined weights of all children
	 * @param left the left node
	 * @param right the right node
	 */
	public HuffmanTreeNode(HuffmanTreeNode left, HuffmanTreeNode right) {
		this.left = left;
		this.right = right;
		
		// create the allChars string containing all characters within this
		// subtree.
		// this will be ordered naturally during table generation
		allChars = "";
		if (left != null) {
			allChars += left.getAllChars();
		}
		
		if (right != null) {
			allChars += right.getAllChars();
		}
	}

	/**
	 * @return true if this item is a leaf node, which implicitly contains a
	 *     character and weight
	 */
	public boolean isLeafNode() {
		return item != null;
	}

	public String getAllChars() {
		return allChars;
	}
	
	/**
	 * add your implementation of the TreeNode interface here
	 */
	@Override
	public int compareTo(TreeNode other) {
		// so TreeNode doesn't expose the value
		// and we aren't allowed to modify the interface
		// so ... good practices get to be thrown out the window
		if (other instanceof HuffmanTreeNode) {
			HuffmanTreeNode hft = (HuffmanTreeNode) other;
			return getWeight() - hft.getWeight();
		} else {
			return 0;
		}
	}

	@Override
	public void attachRight(TreeNode newRightNode) {
		this.right = newRightNode;
	}

	@Override
	public void attachLeft(TreeNode newLeftNode) {
		this.left = newLeftNode;
	}

	@Override
	public TreeNode detachLeft() {
		TreeNode r = this.left;
		this.left = null;
		return r;
	}

	@Override
	public TreeNode detachRight() {
		TreeNode r = this.right;
		this.right = null;
		return r;
	}

	@Override
	public TreeNode getRight() {
		return this.right;
	}

	@Override
	public TreeNode getLeft() {
		return this.left;
	}

	/**
	 * For the Huffman coding algorithm, you can add getters for Frequency and
	 * Character Also, you can add a method telling whether this node is a leaf
	 * node.
	 */
	public char getLetter() {
		return item.getInputChar();
	}

	public int getFreq() {
		return item.getFreq();
	}
	
	/**
	 * Gets the weight of this tree node, including all children. The weight
	 * is the combined frequencies of this node and all of its children.
	 * @return the weight of this node
	 */
	public int getWeight() {
		int ret = 0;
		
		if (item != null) {
			ret += item.getFreq();
		}
		
		if (left != null) {
			ret += ((HuffmanTreeNode) left).getWeight();
		}
		
		if (right != null) {
			ret += ((HuffmanTreeNode) right).getWeight();
		}
		
		return ret;
	}

	/**
	 * Generates a name for this node for use while exporting to dot
	 * @return a name for this node
	 */
	public String dotName() {
		return String.valueOf(allChars) + "\\n" + getWeight();
	}

	/**
	 * Formats this node as a dot string.
	 *
	 * @return a dot string for this node
	 */
	public String dotString() {
		StringBuilder b = new StringBuilder();

		if (left != null && left instanceof HuffmanTreeNode) {
			HuffmanTreeNode hLeft = (HuffmanTreeNode) left;
			b.append("\"");
			b.append(dotName());
			b.append("\" -> \"");
			b.append(hLeft.dotName());
			b.append("\";\n");
			b.append(hLeft.dotString());
		}

		if (right != null && right instanceof HuffmanTreeNode) {
			HuffmanTreeNode hRight = (HuffmanTreeNode) right;
			b.append("\"");
			b.append(dotName());
			b.append("\" -> \"");
			b.append(hRight.dotName());
			b.append("\";\n");
			b.append(hRight.dotString());
		}

		return b.toString();
	}
}