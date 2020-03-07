package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;
import java.util.Random;

public class Controller {

    @FXML
    private Text actiontarget;
    @FXML
    private Text text;
    @FXML
    private TextArea textField;
    @FXML
    private void handleSendButton(ActionEvent event)
    {
        System.out.println("You clicked me!!");
        actiontarget.setText("This is the answer to your question");
        Random rand = new Random();
        int answer = rand.nextInt(5);
        switch(answer)
        {
            case 0:
                actiontarget.setText("Yes!!");
                break;
            case 1:
                actiontarget.setText("No!!");
                break;
            case 2:
                actiontarget.setText("I am not too sure");
                break;
            case 3:
                actiontarget.setText("Very unlikely but possible!");
                break;
            default:
                actiontarget.setText("That is an invalid question.");
                break;
        }
        text.setText("Please ask another question");
        textField.setText("");
    }
}
