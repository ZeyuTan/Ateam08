/**
 * 
 */
package application;

import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * @author samue
 *
 */
public class Main extends Application {
    private List<String> args;
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 300;
    private static final String APP_TITLE = "Social Network";
    BorderPane root = new BorderPane();

    
    VBox signUpBox = new VBox();
    VBox twoInputBox = new VBox();
    MenuBar menuBar = new MenuBar();  
    
    /*
     * method to setup signUpBox
     */
    public void setUpSignUpBox() {
        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        TextField tf1 = new TextField ();
        TextField tf2 = new TextField ();
        Label l1 = new Label("Username");
        Label l2 = new Label("Password");
        hb1.getChildren().addAll(l1, tf1);
        hb2.getChildren().addAll(l2,tf2);
        Button bt = new Button("Sign Up");
        signUpBox.getChildren().addAll(hb1, hb2, bt);
    }
    
    /*
     * method to setup twoinputBox
     */
    public void setUpTwoInputBox() {
        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        TextField tf1 = new TextField ();
        TextField tf2 = new TextField ();
        Label l1 = new Label("Info");
        Label l2 = new Label("Info");
        hb1.getChildren().addAll(l1, tf1);
        hb2.getChildren().addAll(l2,tf2);
        Button bt = new Button("Done");
        twoInputBox.getChildren().addAll(hb1, hb2, bt);
    }
    
    /*
     * method to setup centerbox
     */
    public void setUpCenterBox() {
        root.setCenter(new Label("(Social Network Graph)"));
    }
    
    /*
     * method to setup bottom box
     */
    public void setUpBottomBox() {
        root.setBottom(new Label("(Bottom part content)"));
    }
    
    /*
     * method to setup menu box
     */
    public void setUpMenuBox() {
        Menu file = new Menu("File");
        MenuItem file1 = new MenuItem("Load");
        MenuItem file2 = new MenuItem("Save");
        Menu action = new Menu("Action");
        MenuItem action1 = new MenuItem("Add Person");
        MenuItem action2 = new MenuItem("Remove Person");
        MenuItem action3 = new MenuItem("Add Relationship");
        MenuItem action4 = new MenuItem("Remove Relationship");
        file.getItems().addAll(file1, file2);
        action.getItems().addAll(action1, action2, action3, action4);
        menuBar.getMenus().addAll(file, action);
    }


    /*
     * method to draw a graph
     */
//    private void drawGraph(Graph graph) {
//        
//    }
    
    /*
     * method to draw Node
     */
//    private void drawNode(Graph graph,String name, double x, double y) {
//        
//    }
    
    /*
     * method to draw edge
     */
//    private void drawEdge(Graph graph,double x1, double x2, double y1, double y2) {
//        
//    }
//    
    /*
     * method to get name by xy coordinate
     */
//    private void getNameFromCoordinate(double x, double y) {
//        
//    }
    
    /*method
     * to set the user the mouse clicked
     */
//    private void setSelectedUser(String str) {
//        
//    }
    public void start(Stage primaryStage) {
        args = this.getParameters().getRaw();
        setUpSignUpBox();
        setUpTwoInputBox();
        setUpMenuBox();
        root.setLeft(menuBar);
        root.setRight(signUpBox);
        setUpCenterBox();
        setUpBottomBox();
        Scene mainScene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        primaryStage.setTitle(APP_TITLE);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    

    // Add the stuff and set the primary stage
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }

}
