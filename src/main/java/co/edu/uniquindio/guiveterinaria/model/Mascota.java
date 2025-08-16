package co.edu.uniquindio.guiveterinaria.model;

public class Mascota {
    private String nombre, especie, iDVeterinaria,raza, edad;

    public Mascota(String nombre, String especie, String iDVeterinaria, String raza, String edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.iDVeterinaria = iDVeterinaria;
        this.raza = raza;
        this.edad = edad;
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + iDVeterinaria + ")";
    }


}
