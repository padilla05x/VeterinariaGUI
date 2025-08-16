package co.edu.uniquindio.guiveterinaria;

import co.edu.uniquindio.guiveterinaria.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    private Empresa empresa;
    private Cliente cliente1;
    private Mascota mascota1;
    private ConsultaMedica consulta1;
    private Veterinario vet1;

    @BeforeEach
    void setUp() {
        empresa = new Empresa("Mi Veterinaria");
        cliente1 = new Cliente("123", "Brandon", "3001234567", "Calle Falsa 123");
        mascota1 = new Mascota("Firulais", "Perro", "M001", "Labrador", "3");
        consulta1 = new ConsultaMedica("C001", "Gripe", "Reposo");
        vet1 = new Veterinario("Dr. López", "Canino", "V001");
    }

    @Test
    void testAgregarCliente() {
        
    }

}
