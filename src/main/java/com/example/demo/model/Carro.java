package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

@Entity
public class Carro extends Veiculo {
    @Max(value = 4)
    private int numeroPortas;
    @Max(value = 20)
    @NotNull
    private String tipoCombustivel;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
