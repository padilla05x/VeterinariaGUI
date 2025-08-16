package co.edu.uniquindio.guiveterinaria.model;

/**
 * Clase que representa una mascota registrada en la veterinaria.
 * Contiene información básica como nombre, especie, identificador en la veterinaria,
 * raza y edad.
 */
public class Mascota {

    private String nombre;
    private String especie;
    private String iDVeterinaria;
    private String raza;
    private String edad;

    /**
     * Constructor para la clase Mascota.
     * Permite inicializar una mascota con sus datos básicos.
     *
     * @param nombre         nombre de la mascota
     * @param especie        especie a la que pertenece (perro, gato, etc.)
     * @param iDVeterinaria  identificador único en la veterinaria
     * @param raza           raza de la mascota
     * @param edad           edad de la mascota
     */
    public Mascota(String nombre, String especie, String iDVeterinaria, String raza, String edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.iDVeterinaria = iDVeterinaria;
        this.raza = raza;
        this.edad = edad;
    }

    /**
     * Obtiene el nombre de la mascota.
     *
     * @return nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la mascota.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la especie de la mascota.
     *
     * @return especie de la mascota
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Modifica la especie de la mascota.
     *
     * @param especie nueva especie
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtiene el identificador veterinario de la mascota.
     *
     * @return ID de la mascota en la veterinaria
     */
    public String getIDVeterinaria() {
        return iDVeterinaria;
    }

    /**
     * Modifica el identificador veterinario de la mascota.
     *
     * @param iDVeterinaria nuevo ID
     */
    public void setIDVeterinaria(String iDVeterinaria) {
        this.iDVeterinaria = iDVeterinaria;
    }

    /**
     * Obtiene la raza de la mascota.
     *
     * @return raza de la mascota
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Modifica la raza de la mascota.
     *
     * @param raza nueva raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Obtiene la edad de la mascota.
     *
     * @return edad de la mascota
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Modifica la edad de la mascota.
     *
     * @param edad nueva edad
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * Retorna una representación en cadena de la mascota,
     * mostrando su nombre y el identificador veterinario.
     *
     * @return representación de la mascota en formato "Nombre (ID)"
     */
    @Override
    public String toString() {
        return nombre + " (" + iDVeterinaria + ")";
    }
}
