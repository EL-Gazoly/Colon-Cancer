package coloncancer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

 
public class ManagerController implements Initializable {

    public void homepageButton2(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        Parent homepageParent = null;
        homepageParent = FXMLLoader.load((getClass().getResource("Homepage.fxml")));
        Scene homepageScene = new Scene(homepageParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
     }
   
    @FXML
    private Label label;
    
    
    public void displayAccuracy(){
    
ManagerFunction mg = new ManagerFunction();

String str = mg.accuracy();
label.setText(str + "%");
System.out.println(str + "%");
//System.out.println(df.format(mg.accuracy())+"%");

    }
    
    
    
    
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
