package org.example.model.repositories;

import org.example.model.entities.Cliente;
import org.example.model.entities.Filtro;
import org.example.model.entities.Usuario;

import java.util.List;

public class FiltroRepository implements CrudBasic{

    private DAO<Filtro> dao;

    public FiltroRepository() {
        this.dao = new DAO<Filtro>(Filtro.class);
    }

    @Override
    public Object create(Object obj) {
        Filtro filtro = (Filtro) obj;
        dao.create(filtro);
        return filtro;
    }

    @Override
    public void delete(Object obj) {
        Filtro filtro = (Filtro) obj;
        dao.delete(filtro);
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
        Filtro filtro = (Filtro) obj;
        dao.update(filtro);
        return filtro;
    }
}
