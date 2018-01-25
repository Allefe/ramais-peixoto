package com.peixoto.ramais.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peixoto.ramais.model.Filial;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Integer>{

}
