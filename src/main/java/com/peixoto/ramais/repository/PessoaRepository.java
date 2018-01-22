package com.peixoto.ramais.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peixoto.ramais.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, String> {

}
