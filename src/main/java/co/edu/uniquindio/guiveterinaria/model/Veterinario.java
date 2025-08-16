package co.edu.uniquindio.guiveterinaria.model;

public class Veterinario {
    private String nombre, especialidad, licencia;

    public Veterinario(String nombre, String especialidad, String licencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return nombre + " (" + licencia + ")";
    }
}
