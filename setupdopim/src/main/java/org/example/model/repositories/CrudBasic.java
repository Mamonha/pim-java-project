package org.example.model.repositories;

import java.util.List;

public interface CrudBasic<E> {

    public E create(E obj);
    public void delete(E obj);
    public List<E> findAll();
    public E findById(Long id);
    public E update(Object obj);

}
