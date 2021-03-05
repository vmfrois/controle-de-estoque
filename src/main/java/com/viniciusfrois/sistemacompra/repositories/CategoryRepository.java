package com.viniciusfrois.sistemacompra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfrois.sistemacompra.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
