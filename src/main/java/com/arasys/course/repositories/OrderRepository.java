package com.arasys.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arasys.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
