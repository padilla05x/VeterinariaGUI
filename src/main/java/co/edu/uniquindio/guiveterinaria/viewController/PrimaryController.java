package co.edu.uniquindio.guiveterinaria.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.guiveterinaria.App;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {
    @FXML
    private ResourceBundle resources;

    App app;
    @FXML
    private URL location;

    @FXML
    private Button primaryButton;

    @FXML
    private Button primaryButton1;

    @FXML
    void onOpenCrudCliente() {
        app.openCrudCliente();
    }

    @FXML
    void onOpenCrudMascota() {
        app.openCrudMascota();
    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {

    }
}

