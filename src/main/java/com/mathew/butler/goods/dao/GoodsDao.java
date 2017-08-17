package com.mathew.butler.goods.dao;

import com.mathew.butler.goods.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsDao extends JpaRepository<Goods, Integer> {
}
