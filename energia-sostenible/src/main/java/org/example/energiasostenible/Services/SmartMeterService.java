package org.example.energiasostenible.Services;


import org.springframework.stereotype.Service;

@Service
public class SmartMeterService {

    public String getCurrentConsumption() {
        // Simula la lectura del consumo energético en tiempo real
        return "Consumo actual: 5.2 kWh.";
    }

    public String provideConsumptionTips() {
        // Proporciona recomendaciones para ahorrar energía
        return "Recomendación: Apagar luces no esenciales y ajustar termostatos.";
    }
}
