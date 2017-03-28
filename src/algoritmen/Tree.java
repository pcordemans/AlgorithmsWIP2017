package algoritmen;

import java.util.ArrayList;

/**
 * Generic Tree class
 *
 * @param <T> type parameter
 */
public class Tree<T> {
	TreeNode root;
	
	/**
	 * Constructs a tree with only a single element at root
	 * @param element
	 */
	public Tree(T element){
		root = new TreeNode(element);
	}
	
	/**
	 * 
	 * @return the root element
	 */
	public Position<T> getRoot(){
		return root;
	}
	
	private TreeNode validate(Position<T> pos)throws IllegalArgumentException{
		if(!(pos instanceof Tree.TreeNode)) throw new IllegalArgumentException("Invalid position");
		TreeNode node = (TreeNode) pos;
		return node;
	}
	
	private class TreeNode implements Position<T>{
		private TreeNode parent;
		private T element;
		private ArrayList<Position<T>> children;
		
		public TreeNode(T element) {
			this.element = element;
			children = new ArrayList<Position<T>>();
			parent = null;
		}
		
		public T get(){
			return element;
		}

		@Override
		public ArrayList<Position<T>> children() {
			return children;
		}

		@Override
		public Position<T> parent() {
			return parent;
		}
	}
}
