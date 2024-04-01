package com.example.demo.service;

import com.example.demo.model.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoService <T extends Veiculo>{
    List<T> listar ();
    T criar (T t);

    T atualizar(T t, Long id);

    boolean deletar(Long id);

    Optional<T> buscarPorID(Long id);

    int qtdVeiculos();
}
