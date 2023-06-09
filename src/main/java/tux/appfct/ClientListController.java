package tux.appfct;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import tux.appfct.entities.Person;

import java.net.URL;
import java.time.Instant;
import java.util.ResourceBundle;

public class ClientListController implements Initializable {

    @FXML
    private TableView<Person> tableViewPerson;

    @FXML
    private TableColumn<Person, Integer> tableColumnId;

    @FXML
    private TableColumn<Person, String> tableColumnName;

    @FXML
    private TableColumn<Person, Instant> tableColumnBirthday;

    @FXML
    private TableColumn<Person, Character> tableColumnGender;

    @FXML
    private TableColumn<Person, String> tableColumnAddress;

    @FXML
    private TableColumn<Person, String> tableColumnPerson;


    @FXML
    private Button btNew;

    @FXML
    public void onBtNewAction() {
        System.out.println("onBtNewAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeNodes();
    }

    private void initializeNodes() {
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableColumnBirthday.setCellValueFactory(new PropertyValueFactory<>("birthday"));
        tableColumnGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        tableColumnAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        tableColumnPerson.setCellValueFactory(new PropertyValueFactory<>("person"));

        Stage stage = (Stage) MainApplication.getMainScene().getWindow();
        tableViewPerson.prefHeightProperty().bind(stage.heightProperty());
    }
}