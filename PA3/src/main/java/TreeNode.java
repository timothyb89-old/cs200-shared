
/**
 * TreeNode.java
 *
 * interface for a node of a binary tree structure
 *
 * CS200 Algorithms and Data Structures Colorado State University Spring 2013
 *
 */
public interface TreeNode extends Comparable<TreeNode> {

	/**
	 * attaches a right child to this node
	 */
	public void attachRight(TreeNode newRightNode);

	/**
	 * attaches a left child to this node
	 */
	public void attachLeft(TreeNode newLeftNode);

	/**
	 * detaches the left child and returns the detached node
	 */
	public TreeNode detachLeft();

	/**
	 * detaches the right child and returns the detached node
	 */
	public TreeNode detachRight();

	/**
	 * returns the right child of thid node
	 */
	public TreeNode getRight();

	/**
	 * returns the left child of this node
	 */
	public TreeNode getLeft();
	
}
