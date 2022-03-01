package com.course.spring_udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring_udemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
