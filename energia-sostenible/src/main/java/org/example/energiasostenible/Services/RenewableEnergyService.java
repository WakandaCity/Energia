package org.example.energiasostenible.Services;


import org.springframework.stereotype.Service;

@Service
public class RenewableEnergyService {

    public String integrateSolarPower() {
        // Simula la integración de paneles solares
        return "Paneles solares integrados con éxito en la infraestructura urbana.";
    }

    public String integrateWindPower() {
        // Simula la integración de energía eólica
        return "Energía eólica integrada correctamente en la red de energía urbana.";
    }
}
