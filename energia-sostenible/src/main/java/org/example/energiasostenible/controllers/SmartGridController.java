package org.example.energiasostenible.controllers;



import org.example.energiasostenible.Services.SmartGridServices;
import org.example.energiasostenible.model.SmartGrid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/smartgrid")
public class SmartGridController {

    private final SmartGridServices service;

    public SmartGridController(SmartGridServices service) {
        this.service = service;
    }

    @GetMapping
    public List<SmartGrid> obtenerTodo() {
        return service.obtenerTodo();
    }

    @PutMapping("/{id}/actualizar")
    public String actualizarEnergia(
            @PathVariable Long id,
            @RequestParam double energiaConsumida,
            @RequestParam double energiaGenerada) {
        service.actualizarEnergia(id, energiaConsumida, energiaGenerada);
        return "Datos de energía actualizados correctamente.";
    }
}
