package be.vives.oop.javafx.scene_switching;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ApplicationController implements Initializable {
    
    @FXML private Label username;
    private String name = "";

    public ApplicationController(String name) {
        // Here we cannot change the GUI components yet !! Not loaded yet !!
        // This would fail !!
        // this.username.setText(name);

        // So we need to save in attribute and change the GUI
        // from the initialize method
        this.name = name;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Here we can change the GUI
        this.username.setText(name);
    }    
}
