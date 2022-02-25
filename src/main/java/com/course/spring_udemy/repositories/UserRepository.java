package com.course.spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring_udemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
