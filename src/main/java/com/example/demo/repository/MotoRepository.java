package com.example.demo.repository;
import com.example.demo.model.Carro;
import com.example.demo.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotoRepository extends JpaRepository<Moto, Long> {
    List<Moto> findByAno(int ano);

}
