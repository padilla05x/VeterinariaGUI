package co.edu.uniquindio.guiveterinaria.model;

/**
 * Clase que representa un cliente dentro del sistema de la veterinaria.
 * Contiene información básica como cédula, nombre, teléfono y dirección.
 */
public class Cliente {
    private String cedula, nombre, telefono, direccion;

    /**
     * Constructor para la clase Cliente.
     * Permite inicializar un objeto cliente con los datos básicos.
     *
     * @param cedula    número de identificación del cliente
     * @param nombre    nombre completo del cliente
     * @param telefono  número de teléfono del cliente
     * @param direccion dirección de residencia del cliente
     */
    public Cliente(String cedula, String nombre, String telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene la cédula del cliente.
     *
     * @return cédula del cliente
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Modifica la cédula del cliente.
     *
     * @param cedula nueva cédula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del cliente.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono del cliente.
     *
     * @return teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el teléfono del cliente.
     *
     * @param telefono nuevo teléfono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Modifica la dirección del cliente.
     *
     * @param direccion nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Retorna una representación en cadena del cliente,
     * mostrando el nombre y la cédula.
     *
     * @return representación del cliente en formato "Nombre (Cédula)"
     */
    @Override
    public String toString() {
        return nombre + " (" + cedula + ")";
    }
}
