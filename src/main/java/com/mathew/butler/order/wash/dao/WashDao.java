package com.mathew.butler.order.wash.dao;

import com.mathew.butler.order.wash.model.OrderWash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WashDao extends JpaRepository<OrderWash, Integer> {
}
