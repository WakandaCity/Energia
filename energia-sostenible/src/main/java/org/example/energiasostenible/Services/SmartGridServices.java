package org.example.energiasostenible.Services;


import org.example.energiasostenible.model.SmartGrid;

import java.util.List;

public interface SmartGridServices {
    List<SmartGrid> obtenerTodo();
    void actualizarEnergia(Long id, double energiaConsumida, double energiaGenerada);
}
