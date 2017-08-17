package com.mathew.butler.order.lease.dao;

import com.mathew.butler.order.lease.model.OrderLease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseDao extends JpaRepository<OrderLease, Integer> {
}
