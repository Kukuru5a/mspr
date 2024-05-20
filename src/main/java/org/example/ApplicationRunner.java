package org.example;

import org.example.rzag.spring.database.pool.ConnectionPool;
import org.example.rzag.spring.database.repository.repository.CompanyRepository;
import org.example.rzag.spring.database.repository.repository.UserRepository;
import org.example.rzag.spring.ioc.Container;
import org.example.rzag.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var contqainer = new Container();
//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var us = new UserService(userRepository, companyRepository);

        var connectionPool = contqainer.getClass(ConnectionPool.class);
        var userRepository = contqainer.getClass(UserRepository.class);
        var companyRepository = contqainer.getClass(CompanyRepository.class);
        var us = contqainer.getClass(UserService.class);


    }
}