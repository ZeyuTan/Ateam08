/**
 * 
 */
package application;

import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
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


public class Main extends Application {
    private List<String> args;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 500;
    private static final String APP_TITLE = "Social Network";

    private BorderPane root = new BorderPane();
    public VBox signUpBox = new VBox();
    public VBox twoInputBox = new VBox();
    public VBox centerBox = new VBox();
    public VBox bottomBox = new VBox();
    public MenuBar menuBar = new MenuBar();
    private String centerUser;
    
    private VBox addPerson = new VBox();
    private VBox removePerson = new VBox();
    private VBox addRelation = new VBox();
    private VBox removeRelation = new VBox();

    /*
     * method to setup signUpBox
     */
    public void setUpSignUpBox() {
        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Label l1 = new Label("Username");
        hb1.getChildren().addAll(l1, tf1);
        Button bt = new Button("Sign Up");
        signUpBox.getChildren().addAll(hb1, hb2, bt);
    }

    /*
     * method to setup twoinputBox
     */
    public void setUpTwoInputBox() {
        HBox hb1 = new HBox();
        HBox hb2 = new HBox();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Label l1 = new Label("Info");
        Label l2 = new Label("Info");
        hb1.getChildren().addAll(l1, tf1);
        hb2.getChildren().addAll(l2, tf2);
        Button bt = new Button("Done");
        twoInputBox.getChildren().addAll(hb1, hb2, bt);
    }

    /*
     * method to setup centerbox
     */
    public void setUpCenterBox() {
        centerBox.setAlignment(Pos.CENTER);
        centerBox.getChildren().addAll(new Label("(Social Network Graph)"));
    }

    /*
     * method to setup bottom box
     */
    public void setUpBottomBox() {
        HBox hb = new HBox();
        
        Button showAll = new Button("Show All");
        Button addP = new Button("Add Person");
        Button removeP = new Button("Remove Person");
        Button addR = new Button("Add Friendship");
        Button removeR = new Button("Remove Friendship");

        addPerson.getChildren().addAll(new TextField(), addP);
        removePerson.getChildren().addAll(new TextField(), removeP);
        addRelation.getChildren().addAll(new TextField(), new TextField(), addR);
        removeRelation.getChildren().addAll(new TextField(), new TextField(), removeR);

        addPerson.setVisible(false);
        removePerson.setVisible(false);
        addRelation.setVisible(false);
        removeRelation.setVisible(false);
        
        addP.setOnAction((ActionEvent e) -> {
            addPerson.setVisible(false);
        });
        removeP.setOnAction((ActionEvent e) -> {
            removePerson.setVisible(false);
        });
        addR.setOnAction((ActionEvent e) -> {
            addRelation.setVisible(false);
        });
        removeR.setOnAction((ActionEvent e) -> {
            removeRelation.setVisible(false);
        });

        hb.getChildren().addAll(addPerson, removePerson, addRelation, removeRelation);
        bottomBox.getChildren().addAll(hb);
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
        Menu view = new Menu("View");
        MenuItem view1 = new MenuItem("Show All");

        view1.setOnAction((ActionEvent e) -> {

        });
        action1.setOnAction((ActionEvent e) -> {
            addPerson.setVisible(true);
        });
        action2.setOnAction((ActionEvent e) -> {
            removePerson.setVisible(true);
        });
        action3.setOnAction((ActionEvent e) -> {
            addRelation.setVisible(true);
        });
        action4.setOnAction((ActionEvent e) -> {
            removeRelation.setVisible(true);
        });

        file.getItems().addAll(file1, file2);
        action.getItems().addAll(action1, action2, action3, action4);
        view.getItems().addAll(view1);

        menuBar.getMenus().addAll(file, action, view);
    }


    /*
     * method to draw a graph
     */
    private void drawGraph(Graph graph) {
        
    }

    /*
     * method to draw Node
     */
    // private void drawNode(Graph graph,String name, double x, double y) {
    //
    // }

    /*
     * method to draw edge
     */
    // private void drawEdge(Graph graph,double x1, double x2, double y1, double y2) {
    //
    // }
    //
    /*
     * method to get name by xy coordinate
     */
    // private void getNameFromCoordinate(double x, double y) {
    //
    // }

    /*
     * method to set the user the mouse clicked
     */
    private void setSelectedUser(String str) {
        centerUser = str;
    }

    public void start(Stage primaryStage) {
        args = this.getParameters().getRaw();
        setUpSignUpBox();
        setUpTwoInputBox();
        setUpMenuBox();
        setUpCenterBox();
        setUpBottomBox();
        root.setTop(menuBar);
        root.setRight(signUpBox);
        root.setCenter(centerBox);
        root.setBottom(bottomBox);
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
