package com.senai.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.domain.Aluguel;
import com.senai.repositories.AluguelRepository;

@Service
public class AluguelService {

	@Autowired
	private AluguelRepository repo;

	public Aluguel findById(Integer id) {
		Optional<Aluguel> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public List<Aluguel> findAll() {
		return repo.findAll();
	}

	public Aluguel insert(Aluguel obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Aluguel update(Aluguel obj) {
		return repo.save(obj);
	}

	public void delete(Integer id) {
		findById(id);
		repo.deleteById(id);
	}

}
