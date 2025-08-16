package co.edu.uniquindio.guiveterinaria.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase que representa una empresa veterinaria.
 * Contiene la información de clientes, mascotas, consultas médicas y veterinarios,
 * además de los métodos para gestionarlos (agregar, eliminar, actualizar, verificar).
 */
public class Empresa {

    private String nombre;
    private Collection<Cliente> clientes;
    private Collection<Mascota> mascotas;
    private Collection<ConsultaMedica> consultaMedicas;
    private Collection<Veterinario> veterinarios;

    /**
     * Constructor para la clase Empresa.
     * Inicializa las colecciones vacías para administrar clientes, mascotas,
     * consultas médicas y veterinarios.
     *
     * @param nombre nombre de la empresa
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        clientes = new LinkedList<>();
        mascotas = new LinkedList<>();
        consultaMedicas = new LinkedList<>();
        veterinarios = new LinkedList<>();
    }

    // ------------------- GETTERS Y SETTERS -------------------

    /**
     * Obtiene el nombre de la empresa.
     *
     * @return nombre de la empresa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la empresa.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la colección de clientes.
     *
     * @return lista de clientes
     */
    public Collection<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Devuelve la lista de clientes como ObservableList (para interfaces gráficas).
     *
     * @return lista observable de clientes
     */
    public ObservableList<Cliente> getClientesObservable() {
        return FXCollections.observableArrayList(clientes);
    }

    /**
     * Asigna la colección de clientes.
     *
     * @param clientes nueva colección de clientes
     */
    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Obtiene la colección de mascotas.
     *
     * @return lista de mascotas
     */
    public Collection<Mascota> getMascotas() {
        return mascotas;
    }

    /**
     * Devuelve la lista de mascotas como ObservableList (para interfaces gráficas).
     *
     * @return lista observable de mascotas
     */
    public ObservableList<Mascota> getMascotasObservable() {
        return FXCollections.observableArrayList(mascotas);
    }

    /**
     * Asigna la colección de mascotas.
     *
     * @param mascotas nueva colección de mascotas
     */
    public void setMascotas(Collection<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * Obtiene la colección de consultas médicas.
     *
     * @return lista de consultas médicas
     */
    public Collection<ConsultaMedica> getConsultaMedicas() {
        return consultaMedicas;
    }

    /**
     * Asigna la colección de consultas médicas.
     *
     * @param consultaMedicas nueva colección de consultas
     */
    public void setConsultaMedicas(Collection<ConsultaMedica> consultaMedicas) {
        this.consultaMedicas = consultaMedicas;
    }

    /**
     * Obtiene la colección de veterinarios.
     *
     * @return lista de veterinarios
     */
    public Collection<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    /**
     * Devuelve la lista de veterinarios como ObservableList (para interfaces gráficas).
     *
     * @return lista observable de veterinarios
     */
    public ObservableList<Veterinario> getVeterinariosObservable() {
        return FXCollections.observableArrayList(veterinarios);
    }

    /**
     * Asigna la colección de veterinarios.
     *
     * @param veterinarios nueva colección de veterinarios
     */
    public void setVeterinarios(Collection<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    // ------------------- MÉTODOS DE AGREGAR -------------------

    /**
     * Agrega un cliente si no existe previamente.
     *
     * @param cliente cliente a agregar
     * @return true si fue agregado, false si ya existía
     */
    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())) {
            clientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }

    /**
     * Agrega una mascota si no existe previamente.
     *
     * @param mascota mascota a agregar
     * @return true si fue agregada, false si ya existía
     */
    public boolean agregarMascota(Mascota mascota) {
        boolean centinela = false;
        if (!verificarMascota(mascota.getIDVeterinaria())) {
            mascotas.add(mascota);
            centinela = true;
        }
        return centinela;
    }

    /**
     * Agrega una consulta médica si no existe previamente.
     *
     * @param consultaMedica consulta médica a agregar
     * @return true si fue agregada, false si ya existía
     */
    public boolean agregarConsultaMedica(ConsultaMedica consultaMedica) {
        boolean centinela = false;
        if (!verificarConsultaMedica(consultaMedica.getNumeroConsulta())) {
            consultaMedicas.add(consultaMedica);
            centinela = true;
        }
        return centinela;
    }

    /**
     * Agrega un veterinario si no existe previamente.
     *
     * @param veterinario veterinario a agregar
     * @return true si fue agregado, false si ya existía
     */
    public boolean agregarVeterinario(Veterinario veterinario) {
        boolean centinela = false;
        if (!verificarVeterinario(veterinario.getLicencia())) {
            veterinarios.add(veterinario);
            centinela = true;
        }
        return centinela;
    }

    // ------------------- MÉTODOS DE ELIMINAR -------------------

    /**
     * Elimina un cliente según su cédula.
     *
     * @param cedula cédula del cliente a eliminar
     * @return true si se eliminó, false si no existía
     */
    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Elimina una mascota según su ID de veterinaria.
     *
     * @param iDVeterinaria identificador de la mascota
     * @return true si se eliminó, false si no existía
     */
    public boolean eliminarMascota(String iDVeterinaria) {
        boolean centinela = false;
        for (Mascota mascota : mascotas) {
            if (mascota.getIDVeterinaria().equals(iDVeterinaria)) {
                mascotas.remove(mascota);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Elimina una consulta médica según su número.
     *
     * @param numeroConsulta número de consulta
     * @return true si se eliminó, false si no existía
     */
    public boolean eliminarConsultaMedica(String numeroConsulta) {
        boolean centinela = false;
        for (ConsultaMedica consultaMedica : consultaMedicas) {
            if (consultaMedica.getNumeroConsulta().equals(numeroConsulta)) {
                consultaMedicas.remove(consultaMedica);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Elimina un veterinario según su licencia.
     *
     * @param licencia número de licencia
     * @return true si se eliminó, false si no existía
     */
    public boolean eliminarVeterinario(String licencia) {
        boolean centinela = false;
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.getLicencia().equals(licencia)) {
                veterinarios.remove(veterinario);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    // ------------------- MÉTODOS DE ACTUALIZAR -------------------

    /**
     * Actualiza los datos de un cliente a partir de su cédula.
     *
     * @param cedula      cédula del cliente a actualizar
     * @param actualizado objeto con los datos actualizados
     * @return true si se actualizó, false si no existía
     */
    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setCedula(actualizado.getCedula());
                cliente.setNombre(actualizado.getNombre());
                cliente.setTelefono(actualizado.getTelefono());
                cliente.setDireccion(actualizado.getDireccion());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    // ------------------- MÉTODOS DE VERIFICAR -------------------

    /**
     * Verifica si existe un cliente con la cédula dada.
     *
     * @param cedula cédula a verificar
     * @return true si existe, false si no
     */
    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Verifica si existe una mascota con el ID dado.
     *
     * @param iDVeterinaria identificador de la mascota
     * @return true si existe, false si no
     */
    public boolean verificarMascota(String iDVeterinaria) {
        boolean centinela = false;
        for (Mascota mascota : mascotas) {
            if (mascota.getIDVeterinaria().equals(iDVeterinaria)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Verifica si existe una consulta médica con el número dado.
     *
     * @param numeroConsulta número de la consulta
     * @return true si existe, false si no
     */
    public boolean verificarConsultaMedica(String numeroConsulta) {
        boolean centinela = false;
        for (ConsultaMedica consultaMedica : consultaMedicas) {
            if (consultaMedica.getNumeroConsulta().equals(numeroConsulta)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Verifica si existe un veterinario con la licencia dada.
     *
     * @param licencia número de licencia
     * @return true si existe, false si no
     */
    public boolean verificarVeterinario(String licencia) {
        boolean centinela = false;
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.getLicencia().equals(licencia)) {
                centinela = true;
            }
        }
        return centinela;
    }
}