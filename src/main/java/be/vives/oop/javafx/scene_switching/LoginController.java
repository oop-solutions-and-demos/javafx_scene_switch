package be.vives.oop.javafx.scene_switching;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;

public class LoginController implements Initializable {

  @FXML
  private TextField username;

  @FXML
  private void loadApplicationScene(ActionEvent event) throws IOException {
        System.out.println("Loading Application Controller");
        String name = username.getText();
        System.out.println("User entered name = " + name);

        // Need stage to change scenes
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ApplicationScene.fxml"));

        ApplicationController controller = new ApplicationController(name);   // Pass username to controller
        loader.setController(controller);
        Parent root = loader.load();
        Scene appScene = new Scene(root);

        stage.hide(); //optional
        stage.setScene(appScene);
        stage.show();   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
