package com.projetopaulo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopaulo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
