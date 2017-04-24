package algoritmen;

/**
 * 
 * Directory contains directories and files 
 *
 */
public class Directory extends FSElement {
	
	/**
	 * Constructs an empty directory with a given name
	 * @param name
	 */
	public Directory(String name){
		super.name = name;
		size = 1;
	}	
	
	@Override
	public String toString(){
		return "Directory: "+ name + " size: " + size;
	}
}
