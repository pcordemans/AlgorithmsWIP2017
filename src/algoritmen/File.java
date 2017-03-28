package algoritmen;

/**
 * Represents a File in the FileSystem
 */
public class File implements FSElement {

	private int size;
	private String name;
	
	/**
	 * Constructs a File with a given name and size
	 * @param name
	 * @param size
	 */
	public File(String name, int size){
		this.size = size;
		this.name = name;
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String getName() {
		return name;
	}

}
