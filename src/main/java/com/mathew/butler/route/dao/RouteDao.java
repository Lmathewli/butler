package com.mathew.butler.route.dao;

import com.mathew.butler.route.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteDao extends JpaRepository<Route, Integer> {
}
