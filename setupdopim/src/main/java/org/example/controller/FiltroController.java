package org.example.controller;

import org.example.model.entities.Filtro;
import org.example.model.repositories.FiltroRepository;

import java.util.List;

public class FiltroController implements CrudController<Filtro> {

    private FiltroRepository filtro;

    public FiltroController() {
        filtro = new FiltroRepository();
    }

    @Override
    public Filtro create(Object obj) {
        return (Filtro) filtro.create(obj);
    }

    @Override
    public Filtro update(Object obj) {
        return (Filtro) filtro.create(obj);
    }

    @Override
    public void delete(Object obj) {
        filtro.delete(obj);
    }

    @Override
    public Filtro findById(Long id) {
        return (Filtro) filtro.findById(id);
    }

    @Override
    public List findAll() {
        return filtro.findAll();
    }
}
