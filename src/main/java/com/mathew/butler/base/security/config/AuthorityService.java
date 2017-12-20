package com.mathew.butler.base.security.config;

public interface AuthorityService {
    /**
     * 根据id查询权限
     * @param id
     * @return
     */
    Authority getAuthorityById(long id);
}
