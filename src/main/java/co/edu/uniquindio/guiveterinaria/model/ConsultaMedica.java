package co.edu.uniquindio.guiveterinaria.model;

import java.time.LocalDate;

/**
 * Clase que representa una consulta médica realizada en la veterinaria.
 * Contiene información de la fecha, la mascota atendida, el cliente propietario,
 * el veterinario que la realizó, y detalles como número de consulta, diagnóstico
 * y tratamiento aplicado.
 */
public class ConsultaMedica {

    private String numeroConsulta;
    private String diagnostico;
    private String tratamientoAplicado;
    private LocalDate fecha;
    private Mascota mascotaAtentida;
    private Cliente clientePropietario;
    private Veterinario veterinario;

    /**
     * Constructor para la clase ConsultaMedica.
     * Permite inicializar un objeto con toda la información necesaria
     * de una consulta realizada.
     *
     * @param fecha               fecha en la que se realiza la consulta
     * @param mascota             mascota atendida en la consulta
     * @param clientePropietario  dueño de la mascota
     * @param veterinario         veterinario encargado de la consulta
     * @param numeroConsulta      identificador de la consulta
     * @param diagnostico         diagnóstico realizado al paciente
     * @param tratamientoAplicado tratamiento recomendado o aplicado
     */
    public ConsultaMedica(LocalDate fecha, Mascota mascota, Cliente clientePropietario,
                          Veterinario veterinario, String numeroConsulta,
                          String diagnostico, String tratamientoAplicado) {
        this.fecha = fecha;
        this.mascotaAtentida = mascota;
        this.clientePropietario = clientePropietario;
        this.veterinario = veterinario;
        this.numeroConsulta = numeroConsulta;
        this.diagnostico = diagnostico;
        this.tratamientoAplicado = tratamientoAplicado;
    }

    /**
     * Obtiene el número de la consulta.
     *
     * @return número de consulta
     */
    public String getNumeroConsulta() {
        return numeroConsulta;
    }

    /**
     * Modifica el número de la consulta.
     *
     * @param numeroConsulta nuevo número de consulta
     */
    public void setNumeroConsulta(String numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }

    /**
     * Obtiene el diagnóstico realizado en la consulta.
     *
     * @return diagnóstico
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Modifica el diagnóstico realizado en la consulta.
     *
     * @param diagnostico nuevo diagnóstico
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * Obtiene el tratamiento aplicado al paciente.
     *
     * @return tratamiento aplicado
     */
    public String getTratamientoAplicado() {
        return tratamientoAplicado;
    }

    /**
     * Modifica el tratamiento aplicado al paciente.
     *
     * @param tratamientoAplicado nuevo tratamiento
     */
    public void setTratamientoAplicado(String tratamientoAplicado) {
        this.tratamientoAplicado = tratamientoAplicado;
    }

    /**
     * Obtiene la fecha de la consulta.
     *
     * @return fecha de la consulta
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Modifica la fecha de la consulta.
     *
     * @param fecha nueva fecha de la consulta
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la mascota atendida en la consulta.
     *
     * @return mascota atendida
     */
    public Mascota getMascotaAtentida() {
        return mascotaAtentida;
    }

    /**
     * Modifica la mascota atendida en la consulta.
     *
     * @param mascotaAtentida nueva mascota atendida
     */
    public void setMascotaAtentida(Mascota mascotaAtentida) {
        this.mascotaAtentida = mascotaAtentida;
    }

    /**
     * Obtiene el cliente propietario de la mascota.
     *
     * @return cliente propietario
     */
    public Cliente getClientePropietario() {
        return clientePropietario;
    }

    /**
     * Modifica el cliente propietario de la mascota.
     *
     * @param clientePropietario nuevo cliente propietario
     */
    public void setClientePropietario(Cliente clientePropietario) {
        this.clientePropietario = clientePropietario;
    }

    /**
     * Obtiene el veterinario encargado de la consulta.
     *
     * @return veterinario
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * Modifica el veterinario encargado de la consulta.
     *
     * @param veterinario nuevo veterinario
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
