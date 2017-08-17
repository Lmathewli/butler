package com.mathew.butler.store.factory.dao;

import com.mathew.butler.store.factory.model.Factory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactoryDao extends JpaRepository<Factory, Integer> {
}
