package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

@Entity
public class Moto extends Veiculo {
    private int cilindradas;
    private String tipoPartida;

    public Moto() {
    }

    public Moto(String marca, String modelo, int ano, int cilindradas, String tipoPartida) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.tipoPartida = tipoPartida;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }
}

