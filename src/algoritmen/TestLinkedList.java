package algoritmen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {

	LinkedList<String> linkedlist; 
	
	@Before
	public void setUp() throws Exception {
		linkedlist = new LinkedList<String>("1");
	}
	

	@Test
	public void testFirst() {		
		assertEquals("1", linkedlist.first());
		assertEquals(1, linkedlist.size());
		assertEquals(false, linkedlist.isEmpty());
	}
	
	@Test
	public void testPrepend(){
		linkedlist.prepend("2");
		assertEquals("2", linkedlist.first());
		assertEquals(2, linkedlist.size());
	}

	@Test
	public void testEmptyList(){
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		assertEquals(0, linkedlist.size());
		assertEquals(true, linkedlist.isEmpty());
	}
	
	@Test
	public void testTail(){
		linkedlist.prepend("2");
		LinkedList<String> result = linkedlist.tail();
		assertEquals("1", result.first());
		assertEquals(1, result.size());
	}
	
	@Test
	public void testTailOfALinkedListWithOneElement(){
		LinkedList<String> result = linkedlist.tail();
		assertEquals(0, result.size());
		assertEquals(null, result.first());
		
	}
	
	@Test
	public void testLast(){
		assertEquals("1", linkedlist.last());
		linkedlist.prepend("2");
		assertEquals("1", linkedlist.last());
	}
	
	@Test
	public void testFind(){
		assertTrue(linkedlist.find("1"));
	}
	
	@Test
	public void testIterator(){
		linkedlist.prepend("A");
		StringBuffer buf = new StringBuffer();
		for(String s : linkedlist){
			buf.append(s);
		}
		assertEquals("A1", buf.toString());
	}
}
