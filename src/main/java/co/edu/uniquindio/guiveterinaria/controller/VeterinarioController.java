package co.edu.uniquindio.guiveterinaria.controller;

import co.edu.uniquindio.guiveterinaria.model.Empresa;
import co.edu.uniquindio.guiveterinaria.model.Veterinario;

import java.util.Collection;

public class VeterinarioController {

    Empresa empresa;

    public VeterinarioController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearVeterinario(Veterinario veterinario) {
        return empresa.agregarVeterinario(veterinario);
    }

    public Collection<Veterinario> obtenerListaVeterinarios() {
        return empresa.getVeterinarios();
    }

    public boolean eliminarVeterinario(String licencia) {
        return empresa.eliminarVeterinario(licencia);
    }
}
