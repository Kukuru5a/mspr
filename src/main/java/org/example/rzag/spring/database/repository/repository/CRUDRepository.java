package org.example.rzag.spring.database.repository.repository;

import java.util.Optional;

public interface CRUDRepository<K, E> {
    Optional<E> findById(K id);
    void delete(E entity);
}
