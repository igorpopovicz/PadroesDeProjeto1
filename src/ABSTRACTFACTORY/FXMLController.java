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

import ABSTRACTFACTORY.factorys.*;
import ABSTRACTFACTORY.cars.Car;

/**
 * FXML Controller class
 *
 * @author guirgo
 */
public class FXMLController implements Initializable {    

    private String cbMarcaData;
    private String cbModeloData;
    private String cbCorData;

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

        private TableColumn<Alugado, String> clnNome = new TableColumn<Alugado, String>("Nome");
    
    private TableColumn<Alugado, String> clnCor = new TableColumn<Alugado, String>("Cor");
    
    private TableColumn<Alugado, String> clnFuelC = new TableColumn<Alugado, String>("Fuel Capacity");

    private TableColumn<Alugado, String> clnHorsePower = new TableColumn<Alugado, String>("Horse Power");
    
    ObservableList<Alugado> carrosAlugados = FXCollections.observableArrayList();
    
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
           cbMarcaData = cbMarca.getSelectionModel().getSelectedItem();
           
     
       });
       
       cbModelo.setOnAction(event -> {
           cbModeloData = cbModelo.getSelectionModel().getSelectedItem();
           
 
       });

       cbCor.setOnAction(event -> {
           cbCorData = cbCor.getSelectionModel().getSelectedItem();
 
       });
       
       clnCor.setCellValueFactory(new PropertyValueFactory<Alugado, String>("cor"));
       clnFuelC.setCellValueFactory(new PropertyValueFactory<Alugado, String>("FC"));
       clnNome.setCellValueFactory(new PropertyValueFactory<Alugado, String>("nome"));
       clnHorsePower.setCellValueFactory(new PropertyValueFactory<Alugado, String>("HP"));
       
       clnNome.setPrefWidth(50);
       clnHorsePower.setPrefWidth(105);
       clnFuelC.setPrefWidth(105);
       clnCor.setPrefWidth(60);
       
       
       tblTabela.getColumns().add(clnNome);
       tblTabela.getColumns().add(clnHorsePower);
       tblTabela.getColumns().add(clnFuelC);
       tblTabela.getColumns().add(clnCor);
       

    }
    
    @FXML
    void alugarAction(ActionEvent event) {
        Customer customerOne = new Customer(cbModeloData, cbMarcaData);
        Factory factory = getCarFactory(customerOne);
        Car carOne = factory.create(customerOne.getGradeRequest(), cbCorData);

        carrosAlugados.add(new Alugado(carOne.getCarName(), carOne.getHorsePower(), carOne.getFuelCapacity(), carOne.getColor()));
        carOne.getCarName();

        tblTabela.setItems(carrosAlugados);
    }

    private static Factory getCarFactory(Customer customer) {
        if(customer.getCompany() == "Renault") {
            return new RenaultFactory();
        }
        if(customer.getCompany() == "VolksWagen") {
            return new VolkswagenFactory();
        }
        return null;
    }

}
