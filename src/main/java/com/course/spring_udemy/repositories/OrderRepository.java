package com.course.spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring_udemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
