package com.mathew.butler.store.logistics.dao;

import com.mathew.butler.store.logistics.model.Logistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogisticDao extends JpaRepository<Logistic, Integer> {
}
