package com.viniciusfrois.sistemacompra.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusfrois.sistemacompra.entities.Provider;
import com.viniciusfrois.sistemacompra.repositories.ProviderRepository;

@Service
public class ProviderService {
	
	@Autowired
	private ProviderRepository repository;
	
	public List<Provider> findAll(){
		return repository.findAll();
	}

	public Provider findById(Long id) {
		Optional<Provider> obj = repository.findById(id);
		return obj.get();
	}

}
