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
	
	@Test
	public void testCD(){
		FileSystem myFS = new FileSystem();
		myFS.mkdir("user");
		myFS.cd("user");
		myFS.mkdir("name");
		myFS.createFile("test", 5);
		myFS.cd("name");
		ArrayList<FSElement> result = new ArrayList<FSElement>();
		assertEquals(result, myFS.dir());
		
		myFS.cd("..");
		result.add(new Directory("name"));
		result.add(new File("test", 5));
		assertEquals(result, myFS.dir());
	}
}
