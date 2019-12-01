package application;

import java.io.File;
import java.util.List;

/**
 * Defines methods required for social network visualization
 */
public interface SocialNetworkADT {


	boolean addFriends(String user,String friend);

	boolean removeFriends(String user,String friend);

	boolean addUser(String user);
	
	boolean removeUser(String user);
	
	Set<Person> getFriends(String user);
	
	Set<Person> getMutualFriends(String user1, String user2);
	
	List<Person> getShortestPath(String user1, String user2);
	
	Set<Graph> getConnectedComponents();
	
	void loadFromFile(File fileName);
	
	void saveToFile(File fileName);
}
