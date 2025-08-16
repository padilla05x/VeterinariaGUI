package co.edu.uniquindio.guiveterinaria.viewController;

import co.edu.uniquindio.guiveterinaria.App;
import co.edu.uniquindio.guiveterinaria.controller.ClienteController;
import co.edu.uniquindio.guiveterinaria.controller.ConsultaMedicaController;
import co.edu.uniquindio.guiveterinaria.model.*;
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

import java.util.HashMap;
import java.util.Map;

import static co.edu.uniquindio.guiveterinaria.App.empresa;

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
    private ComboBox<Mascota> cbMascota;

    @FXML
    private ComboBox<Cliente> cbPropietario;

    @FXML
    private ComboBox<Veterinario> cbVeterinario;

    @FXML
    private DatePicker elegirFecha;

    @FXML
    private TableColumn<ConsultaMedica, String> tbcDiagnostico;

    @FXML
    private TableColumn<ConsultaMedica, String> tbcFecha;

    @FXML
    private TableColumn<ConsultaMedica, String> tbcINumConsulta;

    @FXML
    private TableColumn<ConsultaMedica, String> tbcMascota;

    @FXML
    private TableColumn<ConsultaMedica, String> tbcPropietario;

    @FXML
    private TableColumn<ConsultaMedica, String> tbcVeterinario;

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

        // LLENAR COMBOBOX
        cbPropietario.setItems(empresa.getClientesObservable());
        cbVeterinario.setItems(empresa.getVeterinariosObservable());
        cbMascota.setItems(empresa.getMascotasObservable());
        consultaMedicaController = new ConsultaMedicaController(empresa);
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

        tbcFecha.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getFecha() != null
                        ? cellData.getValue().getFecha().toString()
                        : ""));

        tbcPropietario.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getClientePropietario() != null
                        ? cellData.getValue().getClientePropietario().getNombre()
                        : ""));

        tbcMascota.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getMascotaAtentida() != null
                        ? cellData.getValue().getMascotaAtentida().getNombre()
                        : ""));

        tbcVeterinario.setCellValueFactory(cellData ->
                new SimpleStringProperty(cellData.getValue().getVeterinario() != null
                        ? cellData.getValue().getVeterinario().getNombre()
                        : ""));
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
        return new ConsultaMedica(
                elegirFecha.getValue(),
                cbMascota.getValue(),
                cbPropietario.getValue(),
                cbVeterinario.getValue(),
                txtNumeroConsulta.getText(),
                txtDiagnostico.getText(),
                txtTratamiento.getText()
        );
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

