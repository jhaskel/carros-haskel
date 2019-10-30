package com.carros.api.classes;

import com.carros.api.carros.Carro;
import com.carros.api.carros.CarroDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.BitSet;
import java.util.Collection;
import java.util.List;

interface ClasseRepository extends JpaRepository<Classe, Long> {


    List<Classe> findByTipo(String tipo);
}
