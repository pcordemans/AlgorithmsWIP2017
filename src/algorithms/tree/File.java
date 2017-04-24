package algorithms.tree;

/**
 * Represents a File in the FileSystem
 */
public class File extends FSElement {
	
	/**
	 * Constructs a File with a given name and size
	 * @param name
	 * @param size
	 */
	public File(String name, int size){
		super.size = size;
		super.name = name;
	}
}
