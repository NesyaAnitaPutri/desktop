package tugas;

import DB.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.tugas;

public class FXMLDocumentController {

    @FXML
    private TextField tfID;

    @FXML
    private TextField tfNama;

    @FXML
    private DatePicker dpTanggalProduksi;

    @FXML
    private RadioButton rdhitam;

    @FXML
    private ToggleGroup warna;

    @FXML
    private RadioButton rdmerah;

    @FXML
    private RadioButton rdabu;

    @FXML
    private TextField tfJumlah;

    @FXML
    private TextField tfHarga;
    
     @FXML
    private Button btnSave;
     
     @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
//        label.setText("Hello "+tfNama.getText());
        System.out.println(tfID.getText());
        System.out.println(tfNama.getText());
        System.out.println(dpTanggalProduksi.getValue().toString());
         System.out.println(tfJumlah.getText());
          System.out.println(tfHarga.getText());
           
        String warna="";
        if (rdhitam.isSelected())
           warna=rdhitam.getText();
        if (rdmerah.isSelected())
           warna=rdmerah.getText();
        if (rdabu.isSelected())
           warna=rdabu.getText();
        
        System.out.println(warna);
        
//        
        
        DBHandler dh = new DBHandler("MYSQL");
      
    }
    
   

    

}