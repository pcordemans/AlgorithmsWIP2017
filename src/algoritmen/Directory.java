package algoritmen;

/**
 * 
 * Directory contains directories and files 
 *
 */
public class Directory implements FSElement {

	private int size;
	private String name;
	
	/**
	 * Constructs an empty directory with a given name
	 * @param name
	 */
	public Directory(String name){
		this.name = name;
		size = 1;
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
