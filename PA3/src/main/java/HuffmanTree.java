/**
 * HuffmanTree.java
 *
 * This class is an implementation of Tree.java interface
 * You should implement all of the methods in the Tree interface.
 * If you need to add more methods, please add your own methods.
 */


public class HuffmanTree implements Tree{
    HuffmanTreeNode rootnode = null;
    
    public HuffmanTree(HuffmanTreeNode _rootnode){
		this.rootnode = _rootnode;
    }
    // implement Tree interface here
    // you can add main method for your unit testing

	@Override
	public void makeEmpty() {
		rootnode = null;
	}

	@Override
	public boolean isEmpty() {
		return rootnode == null;
	}

	@Override
	public TreeNode getRootItem() {
		return rootnode;
	}

	@Override
	public void setRootItem(TreeNode newRootItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attachLeft(TreeNode newLeft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attachRight(TreeNode newRight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attachLeftSubtree(Tree newLeft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attachRightSubtree(Tree newRight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TreeNode detachLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeNode detachRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tree detachLeftSubtree() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tree detachRightSubtree() {
		// TODO Auto-generated method stub
		return null;
	}

}