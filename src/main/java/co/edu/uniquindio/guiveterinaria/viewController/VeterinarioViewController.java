package co.edu.uniquindio.guiveterinaria.viewController;

import co.edu.uniquindio.guiveterinaria.App;
import co.edu.uniquindio.guiveterinaria.controller.VeterinarioController;
import co.edu.uniquindio.guiveterinaria.model.Veterinario;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VeterinarioViewController {

    VeterinarioController veterinarioController;
    ObservableList<Veterinario> listVeterinarios = FXCollections.observableArrayList();
    Veterinario selectedVeterinario;

    App app;

    @FXML
    private Button btbAgregarVeterinario;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Veterinario, String> tbcNombre;

    @FXML
    private TableColumn<Veterinario, String> tbcEspecialidad;

    @FXML
    private TableColumn<Veterinario, String> tbcLicencia;

    @FXML
    private TableView<Veterinario> tblListVeterinarios;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtEspecialidad;

    @FXML
    private TextField txtLicencia;

    @FXML
    void onAgregarVeterinario() {
        agregarVeterinario();
    }

    @FXML
    void onEliminar() {
        eliminarVeterinario();
    }

    @FXML
    void onRegresar() {
        app.openViewPrincipal();
    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void initialize() {
        this.app=app;
        veterinarioController = new VeterinarioController(app.empresa);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerVeterinarios();

        // Limpiar la tabla
        tblListVeterinarios.getItems().clear();

        // Agregar los elementos a la tabla
        tblListVeterinarios.setItems(listVeterinarios);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbcEspecialidad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEspecialidad()));
        tbcLicencia.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getLicencia()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerVeterinarios() {
        listVeterinarios.addAll(veterinarioController.obtenerListaVeterinarios());
    }

    private void listenerSelection() {
        tblListVeterinarios.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVeterinario = newSelection;
            mostrarInformacionVeterinario(selectedVeterinario);
        });
    }

    private void mostrarInformacionVeterinario(Veterinario veterinario) {
        if (veterinario != null) {
            txtNombre.setText(veterinario.getNombre());
            txtEspecialidad.setText(veterinario.getEspecialidad());
            txtLicencia.setText(veterinario.getLicencia());
        }
    }

    private void agregarVeterinario() {
        Veterinario veterinario = buildVeterinario();
        if (veterinarioController.crearVeterinario(veterinario)) {
            listVeterinarios.add(veterinario);
            limpiarCamposVeterinario();
        }
    }

    private Veterinario buildVeterinario() {
        Veterinario veterinario = new Veterinario(txtNombre.getText(), txtEspecialidad.getText(), txtLicencia.getText());
        return veterinario;
    }

    private void eliminarVeterinario() {
        if (veterinarioController.eliminarVeterinario(txtLicencia.getText())) {
            listVeterinarios.remove(selectedVeterinario);
            limpiarCamposVeterinario();
            limpiarSeleccion();
        }
    }

    private void limpiarSeleccion() {
        tblListVeterinarios.getSelectionModel().clearSelection();
        limpiarCamposVeterinario();
    }

    private void limpiarCamposVeterinario() {
        txtNombre.clear();
        txtEspecialidad.clear();
        txtLicencia.clear();
    }

}
