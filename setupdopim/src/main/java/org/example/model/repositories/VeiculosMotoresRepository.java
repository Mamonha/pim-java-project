package org.example.model.repositories;

import org.example.model.entities.VeiculosClientes;
import org.example.model.entities.VeiculosMotores;

import java.util.List;

public class VeiculosMotoresRepository implements CrudBasic {

    private DAO<VeiculosMotores> dao;

    public VeiculosMotoresRepository() {
        this.dao = new DAO<>(VeiculosMotores.class);
    }

    @Override
    public Object create(Object obj) {
        VeiculosMotores veiculo = (VeiculosMotores) obj;
        dao.create(veiculo);
        return veiculo;
    }

    @Override
    public void delete(Object obj) {
        VeiculosMotores veiculo = (VeiculosMotores) obj;
        dao.delete(veiculo);
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
        VeiculosMotores veiculo = (VeiculosMotores) obj;
        dao.update(veiculo);
        return veiculo;
    }
}
