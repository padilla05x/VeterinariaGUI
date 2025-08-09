package co.edu.uniquindio.guiveterinaria.viewController;

import co.edu.uniquindio.guiveterinaria.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ConsultaMedicaViewController {

    @FXML
    private Button btbAgregarConsulta;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnRegresar;

    @FXML
    private ComboBox<?> cbMascota;

    @FXML
    private ComboBox<?> cbPropietario;

    @FXML
    private DatePicker elegirFecha;

    @FXML
    private TableColumn<?, ?> tbcDiagnostico;

    @FXML
    private TableColumn<?, ?> tbcFecha;

    @FXML
    private TableColumn<?, ?> tbcINumConsulta;

    @FXML
    private TableColumn<?, ?> tbcMascota;

    @FXML
    private TableColumn<?, ?> tbcPropietario;

    @FXML
    private TableColumn<?, ?> tbcTratamiento;

    @FXML
    private TableView<?> tblListConsultas;

    @FXML
    private TextField txtDiagnostico;

    @FXML
    private TextField txtNumeroConsulta;

    @FXML
    private TextField txtTratamiento;

    @FXML
    void onAgregarConsulta(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML
    void onRegresar(ActionEvent event) {

    }

    public void setApp(App app) {
    }
}

