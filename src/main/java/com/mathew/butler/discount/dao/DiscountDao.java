package com.mathew.butler.discount.dao;

import com.mathew.butler.cart.model.Cart;
import com.mathew.butler.discount.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountDao extends JpaRepository<Discount, Integer> {
}
