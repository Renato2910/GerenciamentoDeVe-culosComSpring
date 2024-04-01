package com.example.demo.controller;

import com.example.demo.model.Carro;
import com.example.demo.model.Moto;
import com.example.demo.model.Veiculo;
import com.example.demo.service.CarroService;
import com.example.demo.service.MotoService;
import com.example.demo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/motos")

public class MotoController {
    @Autowired
    private MotoService motoService;

    @GetMapping
    public List<Moto> listarMotos() {
        return motoService.listar();
    }

    @PostMapping
    public Moto criarMoto(@RequestBody Moto moto) {
        return motoService.criar(moto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarMoto(@RequestBody Moto moto, @PathVariable Long id) {
        if (motoService.atualizar(moto, id) == null) {
            String mensagem = "O id informado não existe";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);

        } else {
            return ResponseEntity.ok(moto);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        if (motoService.deletar(id)) {
            String mensagem = "O id " + id + " foi removido com sucesso.";
            return ResponseEntity.status(HttpStatus.OK).body(mensagem);
        } else {
            String mensagem = "O id informado não existe";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
    }

    @GetMapping("/{id}")
    public Optional<Moto> buscarPorId(@PathVariable Long id) {
        return motoService.buscarPorID(id);
    }

    @GetMapping("/qtdVeiculos")
    public int qtdVeiculos() {
        return motoService.qtdVeiculos();
    }

    @GetMapping("/busca-por-ano/{ano}")
    public List<Moto> buscarPorAno(@PathVariable int ano){
        return motoService.buscarPorAno(ano);
    }
}