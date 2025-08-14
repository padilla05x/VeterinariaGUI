package co.edu.uniquindio.guiveterinaria.viewController;

import co.edu.uniquindio.guiveterinaria.App;
import co.edu.uniquindio.guiveterinaria.controller.ClienteController;
import co.edu.uniquindio.guiveterinaria.controller.ConsultaMedicaController;
import co.edu.uniquindio.guiveterinaria.model.Cliente;
import co.edu.uniquindio.guiveterinaria.model.ConsultaMedica;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ConsultaMedicaViewController {

    ConsultaMedicaController consultaMedicaController;
    ObservableList<ConsultaMedica> listConsultaMedicas = FXCollections.observableArrayList();
    ConsultaMedica selectedConsultaMedica;

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
    private TableColumn<ConsultaMedica, String> tbcDiagnostico;

    @FXML
    private TableColumn<?, ?> tbcFecha;

    @FXML
    private TableColumn<ConsultaMedica, String> tbcINumConsulta;

    @FXML
    private TableColumn<?, ?> tbcMascota;

    @FXML
    private TableColumn<?, ?> tbcPropietario;

    @FXML
    private TableColumn<?, ?> tbcVeterinario;

    @FXML
    private TableColumn<ConsultaMedica, String> tbcTratamiento;

    @FXML
    private TableView<ConsultaMedica> tblListConsultaMedicas;

    @FXML
    private TextField txtDiagnostico;

    @FXML
    private TextField txtNumeroConsulta;

    @FXML
    private TextField txtTratamiento;

    @FXML
    void onAgregarConsulta(ActionEvent event) {
        agregarConsultaMedica();
    }

    @FXML
    void onEliminar(ActionEvent event) {
        eliminarConsultaMedica();
    }

    @FXML
    void onRegresar(ActionEvent event) {
        app.openViewPrincipal();
    }


    private App app;

    @FXML
    void initialize() {
        this.app=app;
        consultaMedicaController = new ConsultaMedicaController(app.empresa);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerConsultaMedicas();

        // Limpiar la tabla
        tblListConsultaMedicas.getItems().clear();

        // Agregar los elementos a la tabla
        tblListConsultaMedicas.setItems(listConsultaMedicas);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbcINumConsulta.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroConsulta()));
        tbcDiagnostico.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDiagnostico()));
        tbcTratamiento.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTratamientoAplicado()));

        // FALTAN EL RESTO QUE NO SE COMO PONERLOS (FECHA, PROPIETARIO Y MASCOTA)
    }

    private void obtenerConsultaMedicas() {
        listConsultaMedicas.addAll(consultaMedicaController.obtenerListaConsultaMedicas());
    }

    private void listenerSelection() {
        tblListConsultaMedicas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedConsultaMedica = newSelection;
            mostrarInformacionConsultaMedica(selectedConsultaMedica);
        });
    }

    private void mostrarInformacionConsultaMedica(ConsultaMedica consultaMedica) {
        if (consultaMedica != null) {
            txtNumeroConsulta.setText(consultaMedica.getNumeroConsulta());
            txtDiagnostico.setText(consultaMedica.getDiagnostico());
            txtTratamiento.setText(consultaMedica.getTratamientoAplicado());
        }
    }

    private void agregarConsultaMedica() {
        ConsultaMedica consultaMedica = buildConsultaMedica();
        if (consultaMedicaController.crearConsultaMedica(consultaMedica)) {
            listConsultaMedicas.add(consultaMedica);
            limpiarCamposConsultaMedica();
        }
    }

    private ConsultaMedica buildConsultaMedica() {
        ConsultaMedica consultaMedica = new ConsultaMedica(txtNumeroConsulta.getText(), txtTratamiento.getText(), txtDiagnostico.getText());
        return consultaMedica;
    }

    private void eliminarConsultaMedica() {
        if (consultaMedicaController.eliminarConsultaMedica(txtNumeroConsulta.getText())) {
            listConsultaMedicas.remove(selectedConsultaMedica);
            limpiarCamposConsultaMedica();
            limpiarSeleccion();
        }
    }

    private void limpiarSeleccion() {
        tblListConsultaMedicas.getSelectionModel().clearSelection();
        limpiarCamposConsultaMedica();
    }

    private void limpiarCamposConsultaMedica() {
        txtNumeroConsulta.clear();
        txtTratamiento.clear();
        txtDiagnostico.clear();
    }

    public void setApp(App app) {
        this.app = app;
    }
}

