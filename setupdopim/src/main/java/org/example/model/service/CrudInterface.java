package org.example.model.service;

import java.util.List;

public interface CrudInterface {

    public Object create(Object obj);
    public Object update(Object obj);
    public void delete(Object obj);
    public Object findById(Long id);
    public List findAll();
}
