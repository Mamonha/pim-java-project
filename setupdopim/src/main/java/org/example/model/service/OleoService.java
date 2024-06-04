package org.example.model.service;

import org.example.model.repositories.OleoRepository;

import java.util.List;

public class OleoService implements CrudInterface {

    private OleoRepository oleo;

    public OleoService() {
        oleo = new OleoRepository();
    }

    @Override
    public Object create(Object obj) {
        return oleo.create(obj);
    }

    @Override
    public Object update(Object obj) {
        return oleo.update(obj);
    }

    @Override
    public void delete(Object obj) {
        oleo.delete(obj);
    }

    @Override
    public Object findById(Long id) {
        return oleo.findById(id);
    }

    @Override
    public List findAll() {
        return oleo.findAll();
    }
}
