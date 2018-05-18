/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fliesystemlast;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hagarmohamad75
 */
public class MyFilesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackTOMyFiles(ActionEvent event )throws IOException {
         Parent home_page = FXMLLoader.load(getClass().getResource("Folders.fxml"));
        Scene home_page_scene=new Scene(home_page);
        Stage appStage= (Stage)((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(home_page_scene);
        appStage.show();
        
        
    }

    @FXML
    private void BackDir(ActionEvent event) throws IOException{
         Parent home_page = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene home_page_scene=new Scene(home_page);
        Stage appStage= (Stage)((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(home_page_scene);
        appStage.show();
        
    }

    @FXML
    private void OpenTextEditor(ActionEvent event) throws IOException{
         Parent home_page = FXMLLoader.load(getClass().getResource("TextEditor.fxml"));
        Scene home_page_scene=new Scene(home_page);
        Stage appStage= (Stage)((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(home_page_scene);
        appStage.show();
    }
    
}
