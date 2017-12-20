package com.mathew.butler.base.security.config;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 权限仓库
 */
public interface AuthorityRepository extends JpaRepository<Authority, Long>{
}
