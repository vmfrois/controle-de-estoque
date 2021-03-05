package com.viniciusfrois.sistemacompra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfrois.sistemacompra.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
