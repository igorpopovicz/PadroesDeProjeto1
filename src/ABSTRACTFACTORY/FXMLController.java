package ABSTRACTFACTORY;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author guirgo
 */
public class FXMLController implements Initializable {
    
    @FXML
    private ComboBox<String> cbMarca;
    @FXML
    private ComboBox<String> cbModelo;
    @FXML
    private Button btAlugar;
    @FXML
    private ComboBox<String> cbCor;
    @FXML
    private TableView<Alugado> tblTabela;
    
    
    private TableColumn<Alugado, String> clnCor = new TableColumn<Alugado, String>("Cor");

    @FXML
    private TableColumn<Alugado, String> clnMarca = new TableColumn<Alugado, String>("Marca");;

    
    private TableColumn<Alugado, String> clnModelo = new TableColumn<Alugado, String>("Modelo");;
    
    ObservableList<Alugado> carrosAlugados = FXCollections.observableArrayList(
            new Alugado("Volkswagen", "Gol", "Azul"),
            new Alugado("Renault", "Kwid", "Roxo")
    );
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       String[] itemsMarca = {"Renault", "VolksWagen"};
       cbMarca.getItems().addAll(itemsMarca);
       
       String[] itemsModelo = {"SUV", "Common"};
       cbModelo.getItems().addAll(itemsModelo);
       
       String[] itemsCor = {"Preto", "Branco", "Prata", "Vermelho", "Roxo", "Azul", "Amarelo"};
       cbCor.getItems().addAll(itemsCor);
       
       cbMarca.setOnAction(event -> {
           String data = cbMarca.getSelectionModel().getSelectedItem();
     
       });
       
       cbModelo.setOnAction(event -> {
           String data = cbModelo.getSelectionModel().getSelectedItem();
 
       });
       
       clnCor.setCellValueFactory(new PropertyValueFactory<Alugado, String>("Cor"));
       clnModelo.setCellValueFactory(new PropertyValueFactory<Alugado, String>("Modelo"));
       clnMarca.setCellValueFactory(new PropertyValueFactory<Alugado, String>("Marca"));
       
       clnModelo.setPrefWidth(107);
       clnCor.setPrefWidth(107);
       
       carrosAlugados.add(new Alugado("Ford", "Fiesta", "Preto"));
       
       tblTabela.getColumns().add(clnModelo);
       tblTabela.getColumns().add(clnCor);
       
       tblTabela.setItems(carrosAlugados);
       
    }
    
    @FXML
    void alugarAction(ActionEvent event) {
        
    }

}
