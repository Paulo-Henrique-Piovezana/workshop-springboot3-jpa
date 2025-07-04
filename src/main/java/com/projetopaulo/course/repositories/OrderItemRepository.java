package com.projetopaulo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopaulo.course.entities.OrderItem;
import com.projetopaulo.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> { 

}
