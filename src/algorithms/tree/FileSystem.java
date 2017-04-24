package algorithms.tree;

import java.util.ArrayList;

public class FileSystem {
	private Tree<FSElement> fs = new Tree<FSElement>(new Directory("/"));
	private Position<FSElement> currentDirectory = fs.getRoot();
	
	//TODO what if directory already exists?
	//TODO what to return? eg. path of directory created
	public void mkdir(String name){
		fs.addChild(currentDirectory, new Directory(name));		
	}
	
	//TODO current path
	
	//TODO ls / dir
	public ArrayList<FSElement> dir(){
		ArrayList<FSElement> list = new ArrayList<FSElement>();
		for(Position<FSElement> pos : currentDirectory.children()){
			list.add(pos.get());
		}
		return list;
	}
}
