package co.edu.uniquindio.guiveterinaria.model;

public class Mascota {
    private String nombre, especie, iDVeterinaria;

    public Mascota(String nombre, String especie, String iDVeterinaria) {
        this.nombre = nombre;
        this.especie = especie;
        this.iDVeterinaria = iDVeterinaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getIDVeterinaria() {
        return iDVeterinaria;
    }

    public void setiDVeterinaria(String iDVeterinaria) {
        this.iDVeterinaria = iDVeterinaria;
    }
}
