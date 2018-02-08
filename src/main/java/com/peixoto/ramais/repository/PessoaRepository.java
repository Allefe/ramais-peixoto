package com.peixoto.ramais.repository;

import com.peixoto.ramais.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
