package org.example.controller;

import org.example.model.entities.Oleo;
import org.example.model.repositories.OleoRepository;

import java.util.List;

public class OleoController implements CrudController<Oleo> {

    private OleoRepository oleo;

    public OleoController() {
        oleo = new OleoRepository();
    }

    @Override
    public Oleo create(Object obj) {
        return (Oleo) oleo.create(obj);
    }

    @Override
    public Oleo update(Object obj) {
        return (Oleo) oleo.create(obj);
    }

    @Override
    public void delete(Object obj) {
        oleo.delete(obj);
    }

    @Override
    public Oleo findById(Long id) {
        return (Oleo) oleo.findById(id);
    }

    @Override
    public List findAll() {
        return oleo.findAll();
    }
}
