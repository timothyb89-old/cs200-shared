/**
 * HuffmanTreeNode.java
 *
 * This class is an implementation of TreeNode.java interface
 * You should implement all of the methods in the Tree interface.
 * If you need to add more methods, please add your own methods.
 * Since this node will store a java character and frequencies 
 * for creating a list of Huffman code, you can add member
 * methods related to the functionality.
 */


public class HuffmanTreeNode implements TreeNode {


    /** add your member properties here*/

	private char letter;
	private int freq;
	private TreeNode left,right;

	/** add your constructor here */
	public HuffmanTreeNode(TableItem t){
		this.letter = t.getInputChar();
		this.freq = t.getFreq();
	}

    /** add your implementation of the TreeNode interface here */

	@Override
	public int compareTo(TreeNode arg0) {
		// TODO Auto-generated method stub
		return 0;
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

    /** For the Huffman coding algorithm, you can add getters for Frequency and Character
     Also, you can add a method telling whether this node is a leaf node. 
    */ 
	
    public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}


    /** add your additional methods here */
   


}