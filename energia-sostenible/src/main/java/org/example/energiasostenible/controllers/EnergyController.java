package org.example.energiasostenible.controllers;



import org.example.energiasostenible.Services.RenewableEnergyService;
import org.example.energiasostenible.Services.SmartGridService;
import org.example.energiasostenible.Services.SmartLightingService;
import org.example.energiasostenible.Services.SmartMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnergyController {

    @Autowired
    private SmartGridService smartGridService;

    @Autowired
    private SmartLightingService smartLightingService;

    @Autowired
    private RenewableEnergyService renewableEnergyService;

    @Autowired
    private SmartMeterService smartMeterService;

    @GetMapping("/monitor-energy")
    public String monitorEnergy() {
        return smartGridService.monitorEnergyConsumption();
    }

    @GetMapping("/optimize-energy")
    public String optimizeEnergy() {
        return smartGridService.optimizeEnergyUsage();
    }

    @GetMapping("/integrate-renewables")
    public String integrateRenewables() {
        return renewableEnergyService.integrateSolarPower() + " " + renewableEnergyService.integrateWindPower();
    }

    @GetMapping("/adjust-lighting")
    public String adjustLighting(int movementDetected) {
        return smartLightingService.adjustStreetLighting(movementDetected);
    }

    @GetMapping("/current-consumption")
    public String currentConsumption() {
        return smartMeterService.getCurrentConsumption();
    }
}
