package com.peixoto.ramais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peixoto.ramais.model.Funcao;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Integer>{

}
