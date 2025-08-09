package co.edu.uniquindio.guiveterinaria.model;

import java.time.LocalDateTime;

public class ConsultaMedica {
    int numeroConsulta;
    LocalDateTime fecha;
    Mascota mascotaAtentida;
    Cliente clientePropietario;
    String diagnostico, tratamientoAplicado;

    public ConsultaMedica(int numeroConsulta,LocalDateTime fecha, Mascota mascotaAtentida, Cliente clientePropietario,String diagnostico, String tratamientoAplicado){
        this.numeroConsulta = numeroConsulta;
        this.fecha = fecha;
        this.mascotaAtentida = mascotaAtentida;
        this.clientePropietario = clientePropietario;
        this.diagnostico = diagnostico;
        this.tratamientoAplicado = tratamientoAplicado;
    }

    public int getNumeroConsulta() {
        return numeroConsulta;
    }

    public void setNumeroConsulta(int numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }

    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }

    public Mascota getMascotaAtentida(){
        return mascotaAtentida;
    }

    public void setMascotaAtentida(Mascota mascota){
        this.mascotaAtentida = mascota;
    }

    public Cliente getClientePropietario(){
        return clientePropietario;
    }

    public void setClientePropietario(Cliente clientePropietario){
        this.clientePropietario = clientePropietario;
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
