package org.example.rzag.spring.database.repository.repository;

import org.example.rzag.spring.database.bpp.InjectBean;
import org.example.rzag.spring.database.bpp.Transaction;
import org.example.rzag.spring.database.pool.ConnectionPool;
import org.example.rzag.spring.entity.Company;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transaction
public class CompanyRepository implements CRUDRepository<Integer, Company> {
    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method called");
    }
}
