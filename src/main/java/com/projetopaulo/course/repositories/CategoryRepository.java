package com.projetopaulo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopaulo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
