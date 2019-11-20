package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;

public interface TODORepository extends CrudRepository<TODO, Long> {
    static Object findALL() {
        return null;
    }
}
