package tux.appfct;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private MenuItem menuItemClient;

    @FXML
    private MenuItem menuItemPersonal;

    @FXML
    private MenuItem menuSobre;

    @FXML
    public void  onMenuItemClientAction(){
        System.out.println("onMenuItemClientAction");
    }

    @FXML
    public void  onMenuItemPersonalAction(){
        System.out.println("onMenuItemPersonalAction");
    }

    @FXML
    public void  onMenuItemSobreAction(){
        System.out.println("onMenuItemSobreAction");
    }
    @Override
    public void initialize(URL uri, ResourceBundle rb) {
    }
}