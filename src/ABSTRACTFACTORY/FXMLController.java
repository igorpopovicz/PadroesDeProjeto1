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
import javafx.scene.control.MenuItem;
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
    private TableView<Car> tblTabela;
    @FXML
    private MenuItem removerMenu;

    private TableColumn<Car, String> clnNome = new TableColumn<Car, String>("Nome");
    
    private TableColumn<Car, String> clnCor = new TableColumn<Car, String>("Cor");
    
    private TableColumn<Car, Integer> clnFuelC = new TableColumn<Car, Integer>("Fuel Capacity");

    private TableColumn<Car, Integer> clnHorsePower = new TableColumn<Car, Integer>("Horse Power");
    
    ObservableList<Car> carrosAlugados = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       String[] itemsMarca = {"Renault", "VolksWagen", "Chevrolet", "Nissan"};
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
       
       clnCor.setCellValueFactory(new PropertyValueFactory<Car, String>("color"));
       clnFuelC.setCellValueFactory(new PropertyValueFactory<Car, Integer>("fuelCapacity"));
       clnNome.setCellValueFactory(new PropertyValueFactory<Car, String>("name"));
       clnHorsePower.setCellValueFactory(new PropertyValueFactory<Car, Integer>("horsePower"));
       
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
    void remover(ActionEvent event) {
        carrosAlugados.remove(tblTabela.getSelectionModel().getSelectedItem());
    }
    
    @FXML
    void alugarAction(ActionEvent event) {
        Customer customerOne = new Customer(cbModeloData, cbMarcaData);
        Factory factory = getCarFactory(customerOne);
        Car carOne = factory.create(customerOne.getGradeRequest(), cbCorData);

        carrosAlugados.add(carOne);

        tblTabela.setItems(carrosAlugados);
    }

    private static Factory getCarFactory(Customer customer) {
        if(customer.getCompany() == "Renault") {
            return new RenaultFactory();
        }
        if(customer.getCompany() == "VolksWagen") {
            return new VolkswagenFactory();
        }
        if(customer.getCompany() == "Chevrolet") {
            return new ChevroletFactory();
        }
        if(customer.getCompany() == "Nissan") {
            return new NissanFactory();
        }
        return null;
    }

}
