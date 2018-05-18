/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fliesystemlast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author hagarmohamad75
 */
public class TextEditorController implements Initializable {

    @FXML
TextArea txt;
    @FXML
    private void Quit(ActionEvent event) throws IOException{
    
       Parent home_page = FXMLLoader.load(getClass().getResource("MyFiles.fxml"));
        Scene home_page_scene=new Scene(home_page);
        Stage appStage= (Stage)((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(home_page_scene);
        appStage.show();
        
    
    }  @FXML
    private void New(ActionEvent event){
     txt.setText(" ");
    
    }
    @FXML
    private void Save(ActionEvent event) throws FileNotFoundException{
        JFileChooser chooser=new JFileChooser();
        int chooserValue =chooser.showSaveDialog(chooser);
         if(chooserValue==JFileChooser.APPROVE_OPTION){
             PrintWriter fout=new PrintWriter(chooser.getSelectedFile());
             fout.print(txt.getText());
             fout.close();
         }
    }
    @FXML
    private void open(ActionEvent event){
    JFileChooser chooser=new JFileChooser();
   int chooseValue=chooser.showOpenDialog(chooser);
   if(chooseValue==JFileChooser.APPROVE_OPTION){
   try { Scanner fin=new Scanner(chooser.getSelectedFile());
       String Buffer="";
       while(fin.hasNext()){
           Buffer+=fin.nextLine()+"\n";
       }
       txt.setText(Buffer);
       
   }
   catch(Exception e){
       JOptionPane.showMessageDialog(chooser, "File Not Found!!");
   }
   }
    
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
