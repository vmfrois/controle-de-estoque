package com.viniciusfrois.sistemacompra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfrois.sistemacompra.entities.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {

}
