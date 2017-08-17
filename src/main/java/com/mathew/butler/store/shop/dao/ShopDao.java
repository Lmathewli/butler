package com.mathew.butler.store.shop.dao;

import com.mathew.butler.store.shop.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopDao extends JpaRepository<Shop, Integer> {
}
