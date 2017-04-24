package algorithms.tree;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Represents a simple file system with directories and files organised in a
 * tree
 * 
 */
public class FileSystem {
	private Tree<FSElement> fs = new Tree<FSElement>(new Directory("/"));
	private Position<FSElement> currentDirectory = fs.getRoot();

	/**
	 * Creates a new directory
	 * 
	 * @param name
	 *            of the directory
	 */
	public void mkdir(String name) {
		fs.addChild(currentDirectory, new Directory(name));
	}

	/**
	 * Creates a new file
	 * 
	 * @param name
	 *            of the file
	 * @param size
	 *            of the file
	 */
	public void createFile(String name, int size) {
		fs.addChild(currentDirectory, new File(name, size));
	}

	/**
	 * Changes the current directory
	 * 
	 * @param directory
	 *            name to select use '..' to go up a level
	 */
	public void cd(String directory) {
		if (directory == ".." && !currentDirectory.equals(fs.getRoot())) {
			currentDirectory = currentDirectory.parent();
		} else {
			Optional<Position<FSElement>> found = findSubDir(currentDirectory, directory);
			if (found.isPresent()) {
				currentDirectory = found.get();
			}
		}
	}

	private Optional<Position<FSElement>> findSubDir(Position<FSElement> dir, String name) {
		for (Position<FSElement> pos : dir.children()) {
			if (pos.get() instanceof Directory && pos.get().getName().equals(name))
				return Optional.of(pos);
		}
		return Optional.empty();
	}

	/**
	 * @return overview of the current directory
	 */
	public ArrayList<FSElement> dir() {
		ArrayList<FSElement> list = new ArrayList<FSElement>();
		for (Position<FSElement> pos : currentDirectory.children()) {
			list.add(pos.get());
		}
		return list;
	}
	
	/**
	 * 
	 * @return the size of the current directory (includes the size of the current directory)
	 */
	public int size(){
		//TODO calculate the size of the current directory (includes all subfolders)
		return 0;
	}
}
