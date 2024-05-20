package org.example;

import org.example.rzag.spring.database.pool.ConnectionPool;
import org.example.rzag.spring.database.repository.repository.CompanyRepository;
import org.example.rzag.spring.database.repository.repository.UserRepository;
import org.example.rzag.spring.ioc.Container;
import org.example.rzag.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
    var context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        var connectionPool1 = context.getBean("pool2", ConnectionPool.class);
        var connectionPool2 = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool2);
    }
}