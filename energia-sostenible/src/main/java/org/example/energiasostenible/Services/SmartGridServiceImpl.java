package org.example.energiasostenible.Services;

import org.example.energiasostenible.Repository.SmartGridRepository;
import org.example.energiasostenible.model.SmartGrid;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SmartGridServiceImpl implements SmartGridServices {

    private final SmartGridRepository repository;

    public SmartGridServiceImpl(SmartGridRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SmartGrid> obtenerTodo() {
        return repository.findAll();
    }

    @Override
    public void actualizarEnergia(Long id, double energiaConsumida, double energiaGenerada) {
        SmartGrid smartGrid = repository.findById(id).orElseThrow(() -> new RuntimeException("Smart Grid no encontrado"));
        smartGrid.setEnergiaConsumida(energiaConsumida);
        smartGrid.setEnergiaGenerada(energiaGenerada);
        repository.save(smartGrid);
    }
}
