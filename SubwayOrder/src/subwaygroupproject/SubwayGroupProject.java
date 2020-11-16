/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subwaygroupproject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Chase Dickerson
 */
public class SubwayGroupProject extends Application
{
    int error = 0;
    private TextArea textArea = new TextArea();
    private Button btnShow = new Button("Display Summary ");
    private String errorMessage = "";
    private String display = "";
    //Bread Size Radio Buttons
    private RadioButton rbSizeSix = new RadioButton();
    private RadioButton rbSizeTwelve = new RadioButton();
    
    //Bread Type Radio Buttons
    private RadioButton rbWhite = new RadioButton();
    private RadioButton rbWheat = new RadioButton();
    private RadioButton rbItalian = new RadioButton();
    
    //Meat Type Check Boxes and none choice Radio Button
    private CheckBox cbHam = new CheckBox();
    private CheckBox cbTurkey = new CheckBox();
    private CheckBox cbPepperoni = new CheckBox();
    private RadioButton rbNoMeat = new RadioButton();
    
    //Cheese Type Radio Buttons and none choice Radio Button
    private RadioButton rbAmerican = new RadioButton();
    private RadioButton rbSwiss = new RadioButton();
    private RadioButton rbPepperJack = new RadioButton();
    private RadioButton rbNoCheese = new RadioButton();
    
    //Veggie Type Check Boxes and none choice Radio Button
    private CheckBox cbLettuce = new CheckBox();
    private CheckBox cbTomatoes = new CheckBox();
    private CheckBox cbOlives = new CheckBox();
    private RadioButton rbNoVeggie = new RadioButton();
    
    //Sauce Type Check Boxes and none choice Radio Button
    private CheckBox cbRanch = new CheckBox();
    private CheckBox cbMayo = new CheckBox();
    private CheckBox cbChipotle = new CheckBox();
    private RadioButton rbNoSauce = new RadioButton();
    
    //Salt&Pepper Radio Buttons and none choice Radio Button
    private RadioButton rbSalt = new RadioButton();
    private RadioButton rbPepper = new RadioButton();
    private RadioButton rbNoSaltAndPepper = new RadioButton();
    

    @Override
    public void start(Stage primaryStage)
    {   
        //Create UI
        GridPane gridPane = new GridPane();
        
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        
        //Create Bread size radio buttons
        gridPane.add(new Label("Choose the size of Bread: "), 0, 0);
        ToggleGroup tgBreadSize = new ToggleGroup();
        rbSizeSix.setToggleGroup(tgBreadSize);
        rbSizeTwelve.setToggleGroup(tgBreadSize);
        gridPane.add(new Label("6 in."), 3, 0);
        gridPane.add(rbSizeSix, 4, 0);
        gridPane.add(new Label("12 in."), 6, 0);
        gridPane.add(rbSizeTwelve, 7, 0);
        
        //Create Bread type radio buttons
        gridPane.add(new Label("Choose type of Bread:"), 0, 1);
        ToggleGroup tgBreadType = new ToggleGroup();
        rbWhite.setToggleGroup(tgBreadType);
        rbWheat.setToggleGroup(tgBreadType);
        rbItalian.setToggleGroup(tgBreadType);
        gridPane.add(new Label("White"), 3, 1);
        gridPane.add(rbWhite, 4, 1);
        gridPane.add(new Label("Wheat"), 6, 1);
        gridPane.add(rbWheat, 7, 1);
        gridPane.add(new Label("Italian"), 9, 1);
        gridPane.add(rbItalian, 10, 1);
        
        //Create Meat type check boxes
        ToggleGroup tgNoMeat = new ToggleGroup();
        rbNoMeat.setToggleGroup(tgNoMeat);
        gridPane.add(new Label("Pick your Meats: "), 0, 2);
        gridPane.add(new Label("Ham"), 3, 2);
        gridPane.add(cbHam, 4, 2);
        gridPane.add(new Label("Turkey"), 6, 2);
        gridPane.add(cbTurkey, 7, 2);
        gridPane.add(new Label("Pepperoni"), 9, 2);
        gridPane.add(cbPepperoni, 10, 2);
        gridPane.add(new Label("No Meat"), 12, 2);
        gridPane.add(rbNoMeat, 13, 2);
        
        //Create Cheese type radio buttons
        gridPane.add(new Label("Pick your Cheese: "), 0, 3);
        ToggleGroup tgCheese = new ToggleGroup();
        rbAmerican.setToggleGroup(tgCheese);
        rbSwiss.setToggleGroup(tgCheese);
        rbPepperJack.setToggleGroup(tgCheese);
        rbNoCheese.setToggleGroup(tgCheese);
        gridPane.add(new Label("American"), 3, 3);
        gridPane.add(rbAmerican, 4, 3);
        gridPane.add(new Label("Swiss"), 6, 3);
        gridPane.add(rbSwiss, 7, 3);
        gridPane.add(new Label("PepperJack"), 9, 3);
        gridPane.add(rbPepperJack, 10, 3);
        gridPane.add(new Label("No Cheese"), 12, 3);
        gridPane.add(rbNoCheese, 13, 3);
        
        //Create Veggie type check boxes
        ToggleGroup tgNoVeggies = new ToggleGroup();
        rbNoVeggie.setToggleGroup(tgNoVeggies);
        gridPane.add(new Label("Pick your Veggies: "), 0, 4);
        gridPane.add(new Label("Lettuce"), 3, 4);
        gridPane.add(cbLettuce, 4, 4);
        gridPane.add(new Label("Tomatoes"), 6, 4);
        gridPane.add(cbTomatoes, 7, 4);
        gridPane.add(new Label("Olives"), 9, 4);
        gridPane.add(cbOlives, 10, 4);
        gridPane.add(new Label("No Veggies"), 12, 4);
        gridPane.add(rbNoVeggie, 13, 4);
        
        //Create Sauce type check boxes
        ToggleGroup tgNoSauce = new ToggleGroup();
        rbNoSauce.setToggleGroup(tgNoSauce);
        gridPane.add(new Label("Pick your Sauces: "), 0, 5);
        gridPane.add(new Label("Ranch"), 3, 5);
        gridPane.add(cbRanch, 4, 5);
        gridPane.add(new Label("Mayo"), 6, 5);
        gridPane.add(cbMayo, 7, 5);
        gridPane.add(new Label("Chipotle"), 9, 5);
        gridPane.add(cbChipotle, 10, 5);
        gridPane.add(new Label("No Sauce"), 12, 5);
        gridPane.add(rbNoSauce, 13, 5);
        
        //Create Salt and Pepper radio buttons
        gridPane.add(new Label("Do you want salt or pepper: "), 0, 6);
        ToggleGroup tgSaltAndPepper = new ToggleGroup();
        rbSalt.setToggleGroup(tgSaltAndPepper);
        rbPepper.setToggleGroup(tgSaltAndPepper);
        rbNoSaltAndPepper.setToggleGroup(tgSaltAndPepper);
        gridPane.add(new Label("Salt"), 3, 6);
        gridPane.add(rbSalt, 4, 6);
        gridPane.add(new Label("Pepper"), 6, 6);
        gridPane.add(rbPepper, 7, 6);
        gridPane.add(new Label("No Salt or Pepper"), 9, 6);
        gridPane.add(rbNoSaltAndPepper, 10, 6);
        
        gridPane.add(btnShow, 0, 12);
        
        gridPane.add(textArea, 15, 15);
        
        
        VBox vBox = new VBox(20);
        vBox.setAlignment(Pos.TOP_LEFT);
        gridPane.add(vBox, 0, 0);
        
        //Create a scene and place it on the stage
        Scene scene = new Scene(gridPane, 1000, 400);
        primaryStage.setTitle("OrderSystem");
        primaryStage.setScene(scene);
        primaryStage.show();        
        btnShow.setOnAction(event -> {
            processOutput();
        });
    }
    
    public void processOutput()
    {       
        String breadSize = checkBreadSize();
        String breadType = checkBreadType();
        String meat = checkMeat();
        String cheese = checkCheeseType();
        String veggies  = checkVeggies();
        String sauce  = checkSauce();
        String sp = checkSaltAndPepper();
        
        display = breadSize + breadType + meat + "\n" + cheese + "\n" + veggies + "\n" + sauce + "\n" + sp;
        textArea.setText(display);
    }
    
    public String checkBreadSize()
    {
        if (rbSizeSix.isSelected())
        {
            return "Bread size: 12 inches\n";
        }
        else if (rbSizeTwelve.isSelected())
        {
            return "Bread size: 6 inches\n";
        }
        else
        {
            return "Please select a bread size.\n";
        }
    }
    
    public String checkBreadType()
    {
        if (rbWhite.isSelected())
        {
            return "Bread type: White\n";
        }
        if (rbWheat.isSelected())
        {
            return "Bread type: Wheat\n";
        }
        if (rbItalian.isSelected())
        {
            return "Bread type: Italian\n";
        }
        else
        {
            return "Please select a bread type.\n";
        }
    }
    
    public String checkMeat()
    {
        display = "Meats: ";
        if(cbHam.isSelected())
        {
            display += "Ham ";
        }
        if (cbTurkey.isSelected())
        {
            display += "Turkey ";
        }
        if (cbPepperoni.isSelected())
        {
            display += "Pepporoni ";
        }
        if (rbNoMeat.isSelected())
        {
            cbHam.setSelected(false);
            cbTurkey.setSelected(false);
            cbPepperoni.setSelected(false);
            return "No Meat\n";
        }
        
        return display;
    }
    
    public String checkCheeseType()
    {
        if (rbAmerican.isSelected())
        {
            return "Cheese type: Amercian\n";
        }
        else if (rbSwiss.isSelected())
        {
            return "Cheese type: Swiss\n";
        }
        else if (rbPepperJack.isSelected())
        {
            return "Cheese type: Pepper Jack\n";
        }
        if (rbNoCheese.isSelected())
        {
            rbAmerican.setSelected(false);
            rbSwiss.setSelected(false);
            rbPepperJack.setSelected(false);
            return "No Cheese\n";
        }
        
        return "";
    }
    
    public String checkVeggies()
    {        
        display = "Veggies: ";
        if(cbLettuce.isSelected())
        {
            display += "Lettuce ";
        }
        if (cbTomatoes.isSelected())
        {
            display += "Tomatoes ";
        }
        if (cbOlives.isSelected())
        {
            display += "Olives ";
        }
        else
        {
            display += "No Veggies";
        }
        
        return display;
    }
    
    public String checkSauce()
    {
        int numOfSauce = 0;
        display = "Sauces: ";
        if(cbRanch.isSelected())
        {
            display += "Ranch ";
            numOfSauce++;
        }
        else if (cbMayo.isSelected())
        {
            display += "Mayo ";
            numOfSauce++;
        }
        else if (cbChipotle.isSelected())
        {
            display += "Chipolte ";
            numOfSauce++;
        }
        else
        {
            display += "No Sauce";
        }
        
        if (numOfSauce == 3)
        {
            display = "Error: Only have one sauce. \n";
        }
        
        return display;
    }
    
    public String checkSaltAndPepper()
    {
        if (rbSalt.isSelected())
        {
            return "Just Salt";
        }
        else if (rbPepper.isSelected())
        {
            return "Just Pepper";
        }
        if (rbNoSaltAndPepper.isSelected())
        {
            return "None";
        }
        return "";
    }
    
    
    
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
    
}
