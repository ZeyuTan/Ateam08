package application;

import java.io.File;
import java.util.List;

/**
 * Defines methods required for social network visualization
 */
public interface SocialNetworkADT {

	// comment
	boolean addFriends(String user, String friend);
	
	// comment
	boolean removeFriends(String user, String friend);
	
	// comment
	boolean addUser(String user);
	
	// comment
	boolean removeUser(String user);
	
	// comment 
	Set<Person> getFriends(String user);
	
	// comment 
	Set<Person> getMutualFriends(String user1, String user2);
	
	// comment 
	List<Person> getShortestPath(String user1, String user2);
	
	// comment 
	Set<Graph> getConnectedComponents();
	
	// comment 
	void loadFromFile(File fileName);
	
	// comment 
	void saveToFile(File fileName);
}
