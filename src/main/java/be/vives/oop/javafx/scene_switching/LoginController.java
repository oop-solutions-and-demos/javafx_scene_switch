package be.vives.oop.javafx.scene_switching;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {
    
    @FXML private TextField username;
    
    @FXML
    private void loadApplicationScene(ActionEvent event) {
        System.out.println("Loading Application Controller");
        String name = username.getText();
        System.out.println("User entered name = " + name);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
