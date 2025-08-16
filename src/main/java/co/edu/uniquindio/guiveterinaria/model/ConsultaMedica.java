package co.edu.uniquindio.guiveterinaria.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultaMedica {
    LocalDate fecha;
    Mascota mascotaAtentida;
    Cliente clientePropietario;
    Veterinario veterinario;
    String numeroConsulta, diagnostico, tratamientoAplicado;

    public ConsultaMedica(LocalDate fecha, Mascota mascota, Cliente clientePropietario, Veterinario veterinario, String numeroConsulta, String diagnostico, String tratamientoAplicado ) {
        this.fecha = fecha;
        this.mascotaAtentida = mascota;
        this.clientePropietario = clientePropietario;
        this.veterinario = veterinario;
        this.numeroConsulta = numeroConsulta;
        this.diagnostico = diagnostico;
        this.tratamientoAplicado = tratamientoAplicado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mascota getMascotaAtentida() {
        return mascotaAtentida;
    }

    public void setMascotaAtentida(Mascota mascotaAtentida) {
        this.mascotaAtentida = mascotaAtentida;
    }

    public Cliente getClientePropietario() {
        return clientePropietario;
    }

    public void setClientePropietario(Cliente clientePropietario) {
        this.clientePropietario = clientePropietario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getNumeroConsulta() {
        return numeroConsulta;
    }

    public void setNumeroConsulta(String numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public  String getTratamientoAplicado() {
        return tratamientoAplicado;
    }

    public void setTratamientoAplicado(String tratamientoAplicado) {
        this.tratamientoAplicado = tratamientoAplicado;
    }
}
