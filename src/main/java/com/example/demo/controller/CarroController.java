package com.example.demo.controller;

import com.example.demo.model.Carro;
import com.example.demo.model.Veiculo;
import com.example.demo.service.CarroService;
import com.example.demo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public List<Carro> listar() {
        return carroService.listar();
    }

    @PostMapping
    public Carro criar(@RequestBody Carro carro) {

        return carroService.criar(carro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@RequestBody Carro carro, @PathVariable Long id) {

        if(carroService.atualizar(carro, id) == null) {
            String mensagem = "O id informado não existe";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        } else {
            return ResponseEntity.ok(carro);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        if (carroService.deletar(id)) {
            String mensagem = "O id " + id + " foi removido com sucesso.";
            return ResponseEntity.status(HttpStatus.OK).body(mensagem);
        } else {
            String mensagem = "O id informado não existe";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensagem);
        }
    }
    @GetMapping("/{id}")
    public Optional<Carro> buscarPorId(@PathVariable Long id) {
        return carroService.buscarPorID(id);
    }

    @GetMapping("/qtdVeiculos")
    public int qtdVeiculos(){
        return carroService.qtdVeiculos();
    }

    @GetMapping("/busca-por-modelo/{modelo}")
    public List<Carro> buscarPorModelo(@PathVariable String modelo){
        return carroService.buscarPorModelo(modelo);
    }
}

