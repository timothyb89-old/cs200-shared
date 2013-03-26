/**
 *  TreeNode.java
 *
 *  interface for a node of a binary tree structure
 *
 *  CS200 Algorithms and Data Structures 
 *  Colorado State University
 *  Spring 2013
 *
 */
interface TreeNode extends Comparable <TreeNode> {

    /** attaches a right child to this node */
    void attachRight(TreeNode newRightNode);


    /** attaches a left child to this node */
    void attachLeft(TreeNode newLeftNode);


    /** detaches the left child and returns the detached node */
    TreeNode detachLeft();


    /** detaches the right child and returns the detached node */
    TreeNode detachRight();


    /** returns the right child of thid node */
    TreeNode getRight();


    /** returns the left child of this node */
    TreeNode getLeft();

}

