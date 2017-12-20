package com.mathew.butler.base.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityRepository authorityRepository;
    
    @Override
    public Authority getAuthorityById(long id) {
        return authorityRepository.findOne(id);
    }
}
