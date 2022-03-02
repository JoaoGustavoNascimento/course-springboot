package com.course.spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring_udemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
