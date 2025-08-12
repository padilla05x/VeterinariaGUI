package co.edu.uniquindio.guiveterinaria.viewController;


import co.edu.uniquindio.guiveterinaria.App;
import co.edu.uniquindio.guiveterinaria.controller.MascotaController;
import co.edu.uniquindio.guiveterinaria.model.Mascota;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MascotaViewController {

    MascotaController mascotaController;
    ObservableList<Mascota> listMascotas = FXCollections.observableArrayList();
    Mascota selectedMascota;

    @FXML
    private Button btbAgregarMascota;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Mascota, String> tbcEspecie;

    @FXML
    private TableColumn<Mascota, String> tbcIDVet;

    @FXML
    private TableColumn<Mascota, String> tbcNombre;

    @FXML
    private TableColumn<Mascota, String> tbcEdad;

    @FXML
    private TableColumn<Mascota, String> tbcRaza;

    @FXML
    private TableView<Mascota> tblListMascota;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtIDVeterinaria;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRaza;

    @FXML
    private TextField txtEdad;

    private App app;

    @FXML
    void onAgregarMascota() {
        agregarMascota();
    }

    @FXML
    void onEliminar() {
        eliminarMascota();
    }

    @FXML
    void onRegresar() {
        app.openViewPrincipal();
    }

    @FXML
    void initialize() {
        this.app=app;
        mascotaController = new MascotaController(app.empresa);
        initView();
    }

    private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerMascotas();

        // Limpiar la tabla
        tblListMascota.getItems().clear();

        // Agregar los elementos a la tabla
        tblListMascota.setItems(listMascotas);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbcIDVet.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIDVeterinaria()));
        tbcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        tbcEspecie.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEspecie()));
        tbcRaza.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRaza()));
        tbcEdad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEdad()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerMascotas() {
        listMascotas.addAll(mascotaController.obtenerListaMascotas());
    }

    private void listenerSelection() {
        tblListMascota.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedMascota = newSelection;
            mostrarInformacionMascota(selectedMascota);
        });
    }

    private void mostrarInformacionMascota(Mascota mascota) {
        if (mascota != null) {
            txtIDVeterinaria.setText(mascota.getIDVeterinaria());
            txtNombre.setText(mascota.getNombre());
            txtEspecie.setText(mascota.getEspecie());
            txtEdad.setText(mascota.getEdad());
            txtRaza.setText(mascota.getRaza());
        }
    }

    private void agregarMascota() {
        Mascota mascota = buildMascota();
        if (mascotaController.crearMascota(mascota)) {
            listMascotas.add(mascota);
            limpiarCamposMascota();
        }
    }

    private Mascota buildMascota() {
        Mascota mascota = new Mascota(txtIDVeterinaria.getText(), txtNombre.getText(), txtEspecie.getText(), txtEdad.getText(), txtRaza.getText());
        return mascota;
    }

    private void eliminarMascota() {
        if (mascotaController.eliminarMascota(txtIDVeterinaria.getText())) {
            listMascotas.remove(selectedMascota);
            limpiarCamposMascota();
            limpiarSeleccion();
        }
    }

    private void limpiarSeleccion() {
        tblListMascota.getSelectionModel().clearSelection();
        limpiarCamposMascota();
    }

    private void limpiarCamposMascota() {
        txtIDVeterinaria.clear();
        txtNombre.clear();
        txtEspecie.clear();
        txtEdad.clear();
        txtRaza.clear();
    }

    public void setApp(App app) {
        this.app = app;
    }

}
