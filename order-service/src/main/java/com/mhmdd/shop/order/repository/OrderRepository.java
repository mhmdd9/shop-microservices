package com.mhmdd.shop.order.repository;

import com.mhmdd.shop.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
