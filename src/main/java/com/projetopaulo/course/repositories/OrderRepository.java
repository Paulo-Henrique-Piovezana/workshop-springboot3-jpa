package com.projetopaulo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopaulo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
