package co.edu.uniquindio.guiveterinaria.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultaMedica {
//    LocalDate fecha;
//    Mascota mascotaAtentida;
//    Cliente clientePropietario;
//    Veterinario veterinario;
    String numeroConsulta, diagnostico, tratamientoAplicado;

    public ConsultaMedica(String numeroConsulta, String diagnostico, String tratamientoAplicado){
        this.numeroConsulta = numeroConsulta;
//        this.fecha = fecha;
//        this.mascotaAtentida = mascotaAtentida;
//        this.clientePropietario = clientePropietario;
        this.diagnostico = diagnostico;
        this.tratamientoAplicado = tratamientoAplicado;
    }



    public String getNumeroConsulta() {
        return numeroConsulta;
    }

    public void setNumeroConsulta(String numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    public String getDiagnostico(){
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico){
        this.diagnostico = diagnostico;
    }

    public String getTratamientoAplicado(){
        return tratamientoAplicado;
    }

    public void setTratamientoAplicado(String tratamientoAplicado){
        this.tratamientoAplicado = tratamientoAplicado;
    }


}
