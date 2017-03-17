package algoritmen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStackLL {
	private Stack<Integer> stackie;
	
	@Before
	public void setUp() throws Exception {
		stackie = new StackLL<Integer>();
	}

	@Test
	public void testIsEmpty() {
		assertEquals(true, stackie.isEmpty());
		stackie.push(1);
		assertEquals(false, stackie.isEmpty());
	}

	@Test
	public void testSize() {
		assertEquals(0, stackie.size());
		stackie.push(2);
		assertEquals(1, stackie.size());
	}

	@Test
	public void testPushAndPop() {
		stackie.push(1);
		assertEquals(new Integer(1), stackie.pop());
		
		stackie.push(2);
		stackie.push(3);
		
		assertEquals(new Integer(3), stackie.pop());
		assertEquals(new Integer(2), stackie.pop());
		assertEquals(0, stackie.size());
	}

	@Test
	public void testTop() {
		stackie.push(1);
		assertEquals(new Integer(1), stackie.top());
		assertEquals(1, stackie.size());
	}

	@Test(expected = StackEmptyException.class)
	public void testPopWhenEmpty(){
		stackie.pop();
	}
}
