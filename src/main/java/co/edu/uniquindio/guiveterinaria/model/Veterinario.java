package co.edu.uniquindio.guiveterinaria.model;

/**
 * Clase que representa a un veterinario dentro del sistema de la veterinaria.
 * Contiene la información básica como nombre, especialidad y número de licencia.
 */
public class Veterinario {
    private String nombre, especialidad, licencia;

    /**
     * Constructor para la clase Veterinario.
     * Permite crear un veterinario con nombre, especialidad y licencia.
     *
     * @param nombre Nombre del veterinario.
     * @param especialidad Especialidad del veterinario.
     * @param licencia Número de licencia profesional del veterinario.
     */
    public Veterinario(String nombre, String especialidad, String licencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.licencia = licencia;
    }

    /**
     * Getter para el nombre del veterinario.
     * @return Nombre del veterinario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para el nombre del veterinario.
     * @param nombre Nombre a asignar al veterinario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para la especialidad del veterinario.
     * @return Especialidad del veterinario.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Setter para la especialidad del veterinario.
     * @param especialidad Especialidad a asignar al veterinario.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Getter para la licencia del veterinario.
     * @return Licencia del veterinario.
     */
    public String getLicencia() {
        return licencia;
    }

    /**
     * Setter para la licencia del veterinario.
     * @param licencia Licencia a asignar al veterinario.
     */
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    /**
     * Representación en cadena del veterinario.
     * @return Cadena con el nombre y licencia del veterinario.
     */
    @Override
    public String toString() {
        return nombre + " (" + licencia + ")";
    }
}