package org.example.energiasostenible.model;


import jakarta.persistence.*;


@Entity
public class SmartGrid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ubicacion;

    @Column(nullable = false)
    private double energiaConsumida; // kWh

    @Column(nullable = false)
    private double energiaGenerada; // kWh

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getEnergiaConsumida() {
        return energiaConsumida;
    }

    public void setEnergiaConsumida(double energiaConsumida) {
        this.energiaConsumida = energiaConsumida;
    }

    public double getEnergiaGenerada() {
        return energiaGenerada;
    }

    public void setEnergiaGenerada(double energiaGenerada) {
        this.energiaGenerada = energiaGenerada;
    }
}
