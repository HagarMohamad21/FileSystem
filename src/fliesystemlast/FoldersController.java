    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fliesystemlast;

import java.awt.Image;
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
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author hagarmohamad75
 */
public class FoldersController implements Initializable {
    @FXML
    Button NewFolderButton,NewFolderButton2;
    @FXML
    ImageView NewFolder1,NewFolder2;
   @FXML
    

    private void Back(ActionEvent event) throws IOException {
      
        Parent home_page = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene home_page_scene=new Scene(home_page);
        Stage appStage= (Stage)((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(home_page_scene);
        appStage.show();
        
    }
    @FXML
    private void OpenMyFiles(ActionEvent event) throws IOException { 
        
    Parent home_page = FXMLLoader.load(getClass().getResource("MyFiles.fxml"));
        Scene home_page_scene=new Scene(home_page);
        Stage appStage= (Stage)((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setTitle("Files");
        appStage.setScene(home_page_scene);
        appStage.show();
        
    }
    @FXML
     int i=0;
    @FXML
    private void CreateNewFolder(ActionEvent event) throws IOException{
       
        if(i>0){
            NewFolder2.setVisible(true);
            NewFolderButton2.setVisible(true);
        }
        NewFolder1.setVisible(true);
        NewFolderButton.setVisible(true);
   i=1;
    }
      
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
