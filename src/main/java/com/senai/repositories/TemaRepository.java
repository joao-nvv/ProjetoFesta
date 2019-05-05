package com.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.domain.Tema;
@Repository
public interface TemaRepository extends JpaRepository<Tema, Integer> {

}
