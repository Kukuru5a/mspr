package org.example.rzag.spring.service;

import org.example.rzag.spring.database.repository.repository.CompanyRepository;
import org.example.rzag.spring.database.repository.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
