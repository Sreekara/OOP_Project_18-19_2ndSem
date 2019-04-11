package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;

public class Controller
{
    @FXML
    private Label label;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private AnchorPane User_login;

    @FXML
    private AnchorPane main_page;

    public void pressbutton(ActionEvent event)
    {
        if(username.getText().equals("user"))
        {
            if(password.getText().equals("pass"))
            {
                User_login.setVisible(false);
                main_page.setVisible(true);
                label.setText("Access Granted");
                label.setTextFill(GREEN);
                username.setText("");
                password.setText("");
            }
            else
            {
                label.setTextFill(RED);
                label.setText("Username or Password entered is Incorrect");
                password.setText("");
            }
        }
        else
        {
            label.setTextFill(RED);
            label.setText("Username or Password entered is Incorrect");
            password.setText("");
        }
    }
}
