/*
 * Kelly Nguyen
 * CMSC 140
 * Professor Monshi
 * Due Date 3/6/23
 * Lab 2
 * 
 */


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	Button helloButton;
	Button howdyButton;
	Button chineseButton;
	Button clearButton;
	Button exitButton;
	
	Label myLabel;
	java.awt.TextField myTextField;
	Hbox hbox1;
	Hbox hbox2;

	
	
	
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager myDataManager;     
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	public FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		helloButton = new Button("Hello");
		howdyButton = new Button("Howdy");
		chineseButton = new Button("Chinese");
		clearButton = new Button("Clear");
		exitButton = new Button("Exit");
		
	
		Label myLabel = new Label("Feedback");
		
		myTextField = new TextField();    
		
		hbox1 = new Hbox();
		hbox2 = new Hbox();
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		myDataManager = new DataManager();
		
		Hbox.setMargin(helloButton,10,10,10,10);
		Hbox.setMargin(howdyButton,10,10,10,10);
		Hbox.setMargin(chineseButton,10,10,10,10);
		Hbox.setMargin(clearButton,10,10,10,10);
		Hbox.setMargin(exitButton,10,10,10,10);
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		
		hBox1.getChildren().addAll(helloButton,howdyButton,chineseButton,chineseButton,exitButton);
		hBox2.getChildren().addAll(myLabel, myTextField); 
		
		getChildren().addAll(hBox1, hBox2);
		
		helloButton.setOnAction(new ButtonHandler());
		howdyButton.setOnAction(new ButtonHandler());
		chineseButton.setOnAction(new ButtonHandler());
		clearButton.setOnAction(new ButtonHandler());
		exitButton.setOnAction(new ButtonHandler());
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	class ButtonHandler implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent event)
		{
			
			if(event.getTarget() == helloButton)
			{
				myTextField.setText(myDataManager.getHello());
			}
			
			
			else if(event.getTarget() == howdyButton)
			{
				myTextField.setText(myDataManager.getHowdy());
			}
			
			else if (event.getTarget() == chineseButton)
			{
				myTextField.setText(myDataManager.getChinese());
			}
			
			
			else if (event.getTarget()==clearButton)
			{
				myTextField.setText("");
			}
			
			
			else if (event.getTarget()==exitButton)
			{
				Platform.exit();
				System.exit(0);
			}
		}
		
		
	}
	
}
	
