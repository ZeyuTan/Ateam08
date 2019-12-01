/**
 * 
 */
package application;

import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author lishuji998
 *
 */
public class Main extends Application {
	// store any command-line arguments that were entered.
		// NOTE: this.getParameters().getRaw() will get these also
		private List<String> args;

		private static final int WINDOW_WIDTH = 400;
		private static final int WINDOW_HEIGHT = 400;
		private static final String APP_TITLE = "aTeam8 NB!!";
		
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// save args example
		args = this.getParameters().getRaw();
		
	}
	
	/*
	 * method to setup signUpBox
	 */
	private void setUpSignUpBox() {
		
	}
	
	/*
	 * method to setup twoinputBox
	 */
	private void setUpTwoInputBox() {
		
	}
	
	/*
	 * method to setup centerbox
	 */
	private void setUpCenterBox() {
		
	}
	
	/*
	 * method to setup bottom box
	 */
	private void setUpBottomBox() {
		
	}
	
	/*
	 * method to setup menu box
	 */
	private void setUpMenuBox() {
		
	}
	
	/*
	 * method to draw a graph
	 */
	private void drawGraph(Graph graph) {
		
	}
	
	/*
	 * method to draw Node
	 */
	private void drawNode(Graph graph,String name, double x, double y) {
		
	}
	
	/*
	 * method to draw edge
	 */
	private void drawEdge(Graph graph,double x1, double x2, double y1, double y2) {
		
	}
	
	/*
	 * method to get name by xy coordinate
	 */
	private void getNameFromCoordinate(double x, double y) {
		
	}
	
	/*method
	 * to set the user the mouse clicked
	 */
	private void setSelectedUser(String str) {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
