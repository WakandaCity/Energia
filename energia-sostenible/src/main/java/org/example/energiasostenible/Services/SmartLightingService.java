package org.example.energiasostenible.Services;


import org.springframework.stereotype.Service;

@Service
public class SmartLightingService {

    public String adjustStreetLighting(int movementDetected) {
        if (movementDetected > 0) {
            return "Ajustando luces a niveles altos por presencia de personas o vehículos.";
        }
        return "Reduciendo la iluminación por baja presencia.";
    }

    public String monitorEnergySavings() {
        // Simula el monitoreo del ahorro energético de la iluminación
        return "Monitoreo de ahorro de energía en iluminación pública.";
    }
}
