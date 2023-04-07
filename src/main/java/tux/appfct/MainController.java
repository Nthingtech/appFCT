package tux.appfct;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private MenuItem menuItemClient;

    @FXML
    private MenuItem menuItemPersonal;

    @FXML
    private MenuItem menuItemTraining;

    @FXML
    private MenuItem menuSobre;

    @FXML
    public void  onMenuItemClientAction() {
        System.out.println("onMenuItemClientAction");
    }

    @FXML
    public void  onMenuItemPersonalAction() {
        loadView("PersonalList.fxml");
    }

    @FXML
    public void  onMenuItemPrescriptionAction() {
        System.out.println("onMenuItemPrescriptionAction");
    }

    @FXML
    public void  onMenuItemSobreAction() {
        loadView("Sobre.fxml");
    }
    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }

    private void  loadView(String absolutName) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutName));
            VBox newVbox = loader.load();

            Scene mainScene = MainApplication.getMainScene();
            VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            Node mainMenu = mainVbox.getChildren().get(0);
            mainVbox.getChildren().clear();
            mainVbox.getChildren().add(mainMenu);
            mainVbox.getChildren().addAll(newVbox.getChildren());
        }
        catch (IOException e) {
            Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}