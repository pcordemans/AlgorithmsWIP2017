package algoritmen;

/**
 * 
 * @author P. Cordemans
 *
 * Singly linked list
 *
 * @param <T> type of the parameter
 */
public class LinkedList<T> {
	private Node head;
	
	/**
	 * Constructor for a linked list with one element
	 * 
	 * @param element
	 */
	public LinkedList(T element){
		head = new Node(element);
	}
	
	/**
	 * Prepends the element to the linked list
	 * 
	 * @param element
	 */
	public void prepend(T element){
		Node newNode = new Node(element, head);
		head = newNode;
	}
	
	/**
	 *  
	 * @return the head of the list
	 */
	public T first(){
		return head.get();
	}
	
	private class Node{
		private T element;
		private Node next;
		
		public Node(T element){
			this(element, null);
		}
		
		public Node(T element, Node next){
			this.element = element;
			this.next = next;
		}
		
		public T get(){
			return element;
		}
	}
}
