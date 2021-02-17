package com.viniciusfrois.sbmongo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfrois.sbmongo.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
