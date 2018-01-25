package com.peixoto.ramais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peixoto.ramais.model.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Integer>{

}
