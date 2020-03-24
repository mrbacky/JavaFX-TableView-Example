/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableviewexample;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author schemabuoi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView<Person> tblPersons;
    @FXML
    private TableColumn<Person, Integer> colPersonId;
    @FXML
    private TableColumn<Person, String> colPersonName;
    
    private ObservableList<Person> personsList = FXCollections.observableArrayList();
    
    
    
    @FXML
    private TableView<PersonSimple> tblPersonsSimple;
    @FXML
    private TableColumn<PersonSimple, Integer> colPersonSimpleId;
    @FXML
    private TableColumn<PersonSimple, String> colPersonSimpleName;
    
    private ObservableList<PersonSimple> personSimpleList = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //INITIALIZE PERSON TABLE VIEW
        personsList.add(new Person(1, "Greg"));
        personsList.add(new Person(2, "Chili"));
        personsList.add(new Person(3, "Nadia"));
        
        colPersonId.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());  
        colPersonName.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        
        tblPersons.setItems(personsList);
        
        //INITIALIZE PERSON SIMPLE TABLE VIEW
        personSimpleList.add(new PersonSimple(1, "Greg"));
        personSimpleList.add(new PersonSimple(2, "Chili"));
        personSimpleList.add(new PersonSimple(3, "Nadia"));
        
        colPersonSimpleId.setCellValueFactory(new PropertyValueFactory("id"));
        colPersonSimpleName.setCellValueFactory(new PropertyValueFactory("name"));
        
        tblPersonsSimple.setItems(personSimpleList);
    }    

    @FXML
    private void changePersons(ActionEvent event) {
        personsList.get(0).setName("David");
        
        personSimpleList.get(0).setName("David");
    }
    
}
