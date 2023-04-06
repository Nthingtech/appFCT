package tux.appfct;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import tux.appfct.entities.Personal;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonalListController implements Initializable {

    @FXML
    private TableView<Personal> tableViewPersonal;

    @FXML
    private TableColumn<Personal, Integer> tableColumnId;

    @FXML
    private TableColumn<Personal, String> tableColumnName;

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

        Stage stage = (Stage) MainApplication.getMainScene().getWindow();
        tableViewPersonal.prefHeightProperty().bind(stage.heightProperty());
    }
}
