package com.mathew.butler.role.dao;

import com.mathew.butler.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
}
