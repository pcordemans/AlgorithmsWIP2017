package algoritmen;

/**
 * Represents a File System Element, either a File or a Directory
 */
public interface FSElement {
	
	/**
	 * 
	 * @return the size
	 */
	public int getSize();
	
	/**
	 * 
	 * @return its name
	 */
	public String getName();
}
