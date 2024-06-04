package org.example.controller;

import java.util.List;

public interface CrudController<E> {

    public E create(Object obj);
    public E update(Object obj);
    public void delete(Object obj);
    public E findById(Long id);
    public List findAll();
}
