package com.example.ecommerce.repository;

import jakarta.persistence.criteria.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    static void save(com.example.ecommerce.entity.Order order) {

    }

    List<Order> findByUserEmail(String userEmail);

}

