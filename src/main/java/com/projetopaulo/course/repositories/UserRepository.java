package com.projetopaulo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopaulo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
