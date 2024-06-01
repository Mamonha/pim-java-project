package org.example.model.service;

import org.example.model.repositories.FiltroRepository;

import java.util.List;

public class FiltroService implements CrudInterface {

    private FiltroRepository filtro;

    public FiltroService(){
        filtro = new FiltroRepository();
    }

    @Override
    public Object create(Object obj) {
        return filtro.create(obj);
    }

    @Override
    public Object update(Object obj) {
        return filtro.update(obj);
    }

    @Override
    public void delete(Object obj) {
        filtro.delete(obj);
    }

    @Override
    public Object findById(Long id) {
        return filtro.findById(id);
    }

    @Override
    public List findAll() {
        return filtro.findAll();
    }
}
