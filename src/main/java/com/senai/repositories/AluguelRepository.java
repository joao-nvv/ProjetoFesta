package com.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.domain.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {

}
