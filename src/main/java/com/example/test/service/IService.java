package com.example.test.service;

import java.util.List;

public interface IService <T>{
    List<T> findALl();

    T findById(Long id);

    T save(T t);

    void remove(Long id);

    List<T> findByName(String name);
}
