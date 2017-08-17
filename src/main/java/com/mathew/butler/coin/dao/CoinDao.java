package com.mathew.butler.coin.dao;

import com.mathew.butler.coin.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinDao extends JpaRepository<Coin, Integer> {
}
