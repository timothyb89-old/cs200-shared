/**
 *  Tree.java
 *
 *  interface for a binary tree structure
 *
 *  CS200 Algorithms and Data Structures 
 *  Colorado State University
 *  Spring 2013
 *
 */

public interface Tree{
    /** makes this tree empty */
    void makeEmpty();

    /** returns true if this tree is empty otherwise false*/
    boolean isEmpty();

    /** returns root of this tree*/
    TreeNode getRootItem();

    /** sets the root item */
    void setRootItem(TreeNode newRootItem);

    /** attaches a node to the root item as a left child */
    void attachLeft(TreeNode newLeft);

    /** attaches a node to the root item as a right child */ 
    void attachRight(TreeNode newRight);

    /** attaches a subtree to the root item as a left subtree */
    void attachLeftSubtree(Tree newLeft);

    /** attaches a subtree to the root item as a right subtree */
    void attachRightSubtree(Tree newRight);

    /** detaches the left child node, and returns the detached node */
    TreeNode detachLeft();

    /** detaches the right child node, and returns the detached node */
    TreeNode detachRight();

    /** detaches the left child subtree, and returns the detached subtree */
    Tree detachLeftSubtree();

    /** detaches the right child subtree, and returns the detached subtree */
    Tree detachRightSubtree();
	
}