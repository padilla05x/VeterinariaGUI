package co.edu.uniquindio.guiveterinaria.controller;


import co.edu.uniquindio.guiveterinaria.model.Empresa;
import co.edu.uniquindio.guiveterinaria.model.Mascota;

import java.util.Collection;

public class MascotaController {

    Empresa empresa;

    public MascotaController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearMascota(Mascota mascota) {
        return empresa.agregarMascota(mascota);
    }

    public Collection<Mascota> obtenerListaMascotas() {
        return empresa.getMascotas();
    }

    public boolean eliminarMascota(String iDVeterinaria) {
        return empresa.eliminarMascota(iDVeterinaria);
    }
}
