
/**
 * HuffmanTree.java
 *
 * This class is an implementation of Tree.java interface You should implement
 * all of the methods in the Tree interface. If you need to add more methods,
 * please add your own methods.
 */
public class HuffmanTree implements Tree {

	private TreeNode rootNode = null;

	public HuffmanTree(TreeNode rootNode) {
		this.rootNode = rootNode;
	}
	
	// implement Tree interface here
	// you can add main method for your unit testing

	@Override
	public void makeEmpty() {
		rootNode = null;
	}

	@Override
	public boolean isEmpty() {
		return rootNode == null;
	}

	@Override
	public TreeNode getRootItem() {
		return rootNode;
	}

	@Override
	public void setRootItem(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

	@Override
	public void attachLeft(TreeNode newLeft) {
		rootNode.attachLeft(newLeft);
	}

	@Override
	public void attachRight(TreeNode newRight) {
		rootNode.attachRight(newRight);
	}

	@Override
	public void attachLeftSubtree(Tree newLeft) {
		// "best guess" implementation, not 100% clear what these methods should
		// actually do
		rootNode.attachLeft(newLeft.getRootItem());
	}

	@Override
	public void attachRightSubtree(Tree newRight) {
		rootNode.attachRight(newRight.getRootItem());
	}

	@Override
	public TreeNode detachLeft() {
		return rootNode.detachLeft();
	}

	@Override
	public TreeNode detachRight() {
		return rootNode.detachRight();
	}

	@Override
	public Tree detachLeftSubtree() {
		// this doesn't really make sense, but oh well
		return new HuffmanTree(rootNode.detachLeft());
	}

	@Override
	public Tree detachRightSubtree() {
		return new HuffmanTree(rootNode.detachRight());
	}
	
	/**
	 * Calculates the total weight for this tree. The weight is the combined
	 * frequency of all of the child nodes.
	 * @return the weight of this tree
	 */
	public int getWeight() {
		return ((HuffmanTreeNode) rootNode).getWeight();
	}

	/**
	 * Exports this tree to a dot string. Using the `dot` utility from GraphViz,
	 * the output of this method can be used to generate a graphical
	 * representation of this tree.
	 * @return a dot string
	 */
	public String exportDot() {
		StringBuilder b = new StringBuilder();

		b.append("digraph HuffmanTree {\n");
		
		if (rootNode instanceof HuffmanTreeNode) {
			HuffmanTreeNode node = (HuffmanTreeNode) rootNode;
			b.append(node.dotString());
		}
		
		b.append("}");
		
		return b.toString();
	}
	
}