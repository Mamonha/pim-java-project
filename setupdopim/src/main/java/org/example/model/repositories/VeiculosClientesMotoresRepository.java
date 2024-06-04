package org.example.model.repositories;

import org.example.model.entities.VeiculosClientesMotores;
import java.util.List;

public class VeiculosClientesMotoresRepository implements CrudBasic {

    private DAO<VeiculosClientesMotores> dao;

    public VeiculosClientesMotoresRepository() {
        this.dao = new DAO<>(VeiculosClientesMotores.class);
    }

    @Override
    public Object create(Object obj) {
        VeiculosClientesMotores veiculosClientesMotores = (VeiculosClientesMotores) obj;
        dao.create(veiculosClientesMotores);
        return veiculosClientesMotores;
    }

    @Override
    public void delete(Object obj) {
        VeiculosClientesMotores veiculosClientesMotores = (VeiculosClientesMotores) obj;
        dao.delete(veiculosClientesMotores);
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
        VeiculosClientesMotores veiculosClientesMotores = (VeiculosClientesMotores) obj;
        dao.update(veiculosClientesMotores);
        return veiculosClientesMotores;
    }
}
