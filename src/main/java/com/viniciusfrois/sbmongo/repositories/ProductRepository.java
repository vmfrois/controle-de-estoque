package com.viniciusfrois.sbmongo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfrois.sbmongo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
