package co.edu.uniquindio.guiveterinaria.model;

import java.util.Collection;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private Collection<Cliente> clientes;
    private Collection<Mascota> mascotas;
    private Collection<ConsultaMedica> consultaMedicas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        clientes = new LinkedList<>();
        mascotas = new LinkedList<>();
        consultaMedicas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public Collection<Mascota> getMascotas() {
        return mascotas;
    }

    public Collection<ConsultaMedica> getConsultaMedicas() {
        return consultaMedicas;
    }

    public void setConsultaMedicas(Collection<ConsultaMedica> consultaMedicas) {
        this.consultaMedicas = consultaMedicas;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setMascotas(Collection<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())) {
            clientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }

    public boolean agregarMascota(Mascota mascota) {
        boolean centinela = false;
        if (!verificarMascota(mascota.getIDVeterinaria())) {
            mascotas.add(mascota);
            centinela = true;
        }
        return centinela;
    }

    public boolean agregarConsultaMedica(ConsultaMedica consultaMedica) {
        boolean centinela = false;
        if (!verificarConsultaMedica(consultaMedica.getNumeroConsulta())) {
            consultaMedicas.add(consultaMedica);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean eliminarMascota(String iDVeterinaria) {
        boolean centinela = false;
        for (Mascota mascota : mascotas) {
            if (mascota.getIDVeterinaria().equals(iDVeterinaria)) {
                mascotas.remove(mascota);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean eliminarConsultaMedica(String numeroConsulta) {
        boolean centinela = false;
        for (ConsultaMedica consultaMedica : consultaMedicas) {
            if (consultaMedica.getNumeroConsulta().equals(numeroConsulta)) {
                consultaMedicas.remove(consultaMedica);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setCedula(actualizado.getCedula());
                cliente.setNombre(actualizado.getNombre());
                cliente.setTelefono(actualizado.getTelefono());
                cliente.setDireccion(actualizado.getDireccion());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean verificarMascota(String iDVeterinaria) {
        boolean centinela = false;
        for (Mascota mascota : mascotas) {
            if (mascota.getIDVeterinaria().equals(iDVeterinaria)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean verificarConsultaMedica(String numeroConsulta) {
        boolean centinela = false;
        for (ConsultaMedica consultaMedica : consultaMedicas) {
            if (consultaMedica.getNumeroConsulta().equals(numeroConsulta)) {
                centinela = true;
            }
        }
        return centinela;
    }

}

