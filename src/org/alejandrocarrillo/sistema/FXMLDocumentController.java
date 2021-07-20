
package org.alejandrocarrillo.sistema;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    float dato1, dato2, resultado;
       int op;
     
      
       @FXML private  TextField txtValores;
       @FXML private Button btnCero;
       @FXML private Button btnUno; 
       @FXML private Button btnDos;
       @FXML private Button btnTres;
       @FXML private Button btnCuatro;
       @FXML private Button btnCinco;
       @FXML private Button btnSeis;
       @FXML private Button btnSiete;
       @FXML private Button btnOcho;
       @FXML private Button btnNueve;
       @FXML private Button btnMasMenos;
       @FXML private Button btnSuma;
       @FXML private Button btnResta;
       @FXML private Button btnMulti;
       @FXML private Button btnDiv;
       @FXML private Button btnPorcentaje;
       @FXML private Button btnC;
       @FXML private Button btnCE;
       @FXML private Button btnIgual;
       @FXML private Button btnXalaY;
       @FXML private Button btnUnoX;
       @FXML private Button btnPunto;
   
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
            
        

         if(event.getSource() == btnCero)
           txtValores.setText(txtValores.getText()+"0");
          
       else if (event.getSource() == btnUno)
           txtValores.setText(txtValores.getText()+"1");
           
       else if (event.getSource() == btnDos)
           txtValores.setText(txtValores.getText()+"2");   
       
       
       else if (event.getSource() == btnTres)
           txtValores.setText(txtValores.getText()+"3");
       else if (event.getSource() == btnCuatro)
           txtValores.setText(txtValores.getText()+"4");
       else if (event.getSource() == btnCinco)
           txtValores.setText(txtValores.getText()+"5");
       else if (event.getSource() == btnSeis)
           txtValores.setText(txtValores.getText()+"6");
       else if (event.getSource() == btnSiete)
           txtValores.setText(txtValores.getText()+"7");
       else if (event.getSource() == btnOcho)
           txtValores.setText(txtValores.getText()+"8");
       else if (event.getSource() == btnNueve)
           txtValores.setText(txtValores.getText()+"9");
       
       
       
       
       else if (event.getSource() == btnPunto){
           if((txtValores.getText()).equals("") )
                txtValores.setText("0.");
           else
                txtValores.setText((txtValores.getText()+"."));
           btnPunto.setDisable(true);
       }
       else if(event.getSource()== btnSuma){
           dato1 += Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           btnPunto.setDisable(false);
           op = 1;
       }else if(event.getSource()== btnResta){
           if(op==2){
           dato1 = dato1-Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           }else {
               dato1 = Float.parseFloat(txtValores.getText());
                    txtValores.setText("");
                    btnPunto.setDisable(false);
                    op = 2;
           }
          
       }else if(event.getSource()== btnMulti){
           dato1 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           btnPunto.setDisable(false);
           op = 3;
           
       }else if(event.getSource()== btnDiv){
           dato1 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           btnPunto.setDisable(false);
           op = 4; 
           
       }else if (event.getSource()== btnMasMenos){
           dato1 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           resultado = dato1 * -1;
           txtValores.setText(String.valueOf(resultado));
           
       }else if (event.getSource()== btnUnoX){
           dato1 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           resultado = 1/(dato1);
           txtValores.setText(String.valueOf(resultado));
           
       }else if(event.getSource()== btnPorcentaje){
           dato2 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           resultado = (dato1 * dato2)/ 100;
           txtValores.setText(String.valueOf(resultado));

       }else if(event.getSource()== btnC){
           txtValores.setText("");
           btnPunto.setDisable(false);
            dato1 = 0;
            dato2 = 0;
            
       }else if(event.getSource()== btnCE){
           txtValores.setText("");
           btnPunto.setDisable(false);
           
       }else if(event.getSource()== btnXalaY){
           dato1 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           op = 5; 
       
       }else if(event.getSource()== btnIgual){
           dato2 = Float.parseFloat(txtValores.getText());
           txtValores.setText("");
           btnPunto.setDisable(false);
           

           switch(op){
               case 1:
                   resultado = dato1 + dato2;
                    txtValores.setText(String.valueOf(resultado));
               break;
               case 2:
                   resultado = dato1 - dato2;
                   txtValores.setText(String.valueOf(resultado));
               break;
               case 3:
                   resultado = dato1 * dato2;
                   txtValores.setText(String.valueOf(resultado));
               break;
               case 4:
                   resultado = dato1 / dato2;
                   txtValores.setText(String.valueOf(resultado));
               break;
               case 5:
                   resultado = 1;
                   for (int a = 1; a <= dato2; a++ )
                   resultado = resultado * dato1;
                   txtValores.setText(String.valueOf(resultado));
               break;
                
               
               
               
                   
           }
           
           
           
       } 
       
   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
