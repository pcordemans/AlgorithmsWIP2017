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
	private int size;
	
	/**
	 * Constructor for a linked list with one element
	 * 
	 * @param element
	 */
	public LinkedList(T element){
		head = new Node(element);
		size = 1;
	}
	
	/**
	 * Prepends the element to the linked list
	 * 
	 * @param element
	 */
	public void prepend(T element){
		Node newNode = new Node(element, head);
		head = newNode;
		size++;
	}
	
	/**
	 *  
	 * @return the head of the list
	 */
	public T first(){
		return head.get();
	}
	
	/**
	 * 
	 * @return the number of elements in the linked list
	 */
	public int size(){
		return size;
	}
	
	/**
	 * 
	 * @return true if empty, false if the linked list contains elements
	 */
	public boolean isEmpty(){
		return size == 0;
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
