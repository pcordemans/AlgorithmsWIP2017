package algorithms.tree;

/**
 * Represents a File System Element, either a File or a Directory
 */
abstract class FSElement {
	
	protected int size;
	protected String name;
	
	/**
	 * 
	 * @return the size
	 */
	public int getSize(){
		return size;
	}
	
	/**
	 * 
	 * @return its name
	 */
	public String getName(){
		return name;
	}
	
	@Override
	public boolean equals(Object that){
		if(that instanceof FSElement){
			FSElement other = (FSElement) that;
			return(this.getName().equals(other.getName()) && this.getSize() == other.getSize());
		}
		else return false;
	}
	
	@Override
	public int hashCode(){
		return 41 * name.hashCode() + 41 * size;
	}
	
}
