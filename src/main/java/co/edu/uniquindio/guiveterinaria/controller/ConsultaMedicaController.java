package co.edu.uniquindio.guiveterinaria.controller;

import co.edu.uniquindio.guiveterinaria.model.ConsultaMedica;
import co.edu.uniquindio.guiveterinaria.model.Empresa;
import co.edu.uniquindio.guiveterinaria.model.Mascota;

import java.util.Collection;

public class ConsultaMedicaController {

    Empresa empresa;

    public ConsultaMedicaController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearConsultaMedica(ConsultaMedica consultaMedica) {
        return empresa.agregarConsultaMedica(consultaMedica);
    }

    public Collection<ConsultaMedica> obtenerListaConsultaMedicas() {
        return empresa.getConsultaMedicas();
    }

    public boolean eliminarConsultaMedica(String numeroConsulta) {
        return empresa.eliminarConsultaMedica(numeroConsulta);
    }
}
