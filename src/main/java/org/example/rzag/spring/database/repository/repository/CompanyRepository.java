package org.example.rzag.spring.database.repository.repository;

import org.example.rzag.spring.database.pool.ConnectionPool;

public class CompanyRepository {
    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    private void init() {
        System.out.println("init");
    }

    private void destroy() {
        System.out.println("destroy");
    }
}
