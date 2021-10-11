package com.example.m2springRest_Test;

public class Car {

    private Long id;
    private String fabricante;
    private String model;

    public Car() {
    }

    public Car(Long id, String fabricante, String model) {
        this.id = id;
        this.fabricante = fabricante;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
