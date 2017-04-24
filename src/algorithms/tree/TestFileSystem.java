package algorithms.tree;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestFileSystem {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testMkdir() {
		FileSystem myFS = new FileSystem();
		myFS.mkdir("user");
		ArrayList<FSElement> result = new ArrayList<FSElement>();
		result.add(new Directory("user"));
		assertEquals(result, myFS.dir());
	}
}
