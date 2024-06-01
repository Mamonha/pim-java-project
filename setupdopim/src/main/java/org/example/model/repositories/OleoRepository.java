package org.example.model.repositories;

import org.example.model.entities.Oleo;

import java.util.List;

public class OleoRepository implements CrudBasic{

    private DAO<Oleo> dao;

    public OleoRepository() {
        this.dao = new DAO<Oleo>(Oleo.class);
    }

    @Override
    public Object create(Object obj) {
        Oleo oleo = (Oleo) obj;
        dao.create(oleo);
        return oleo;
    }

    @Override
    public void delete(Object obj) {
        Oleo oleo = (Oleo) obj;
        dao.delete(oleo);
    }

    @Override
    public List findAll() {
        return dao.getAllData();
    }

    @Override
    public Object findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public Object update(Object obj) {
        Oleo oleo = (Oleo) obj;
        return dao.update(oleo);
    }
}
