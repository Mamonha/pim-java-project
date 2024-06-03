package org.example.model.repositories;


import org.example.model.entities.VeiculosClientes;

import java.util.List;

public class VeiculosClientesRepository implements CrudBasic{

    private DAO<VeiculosClientes> dao;

    public VeiculosClientesRepository() {
        this.dao = new DAO<VeiculosClientes>(VeiculosClientes.class);
    }


    @Override
    public Object create(Object obj) {
        VeiculosClientes veiculo = (VeiculosClientes) obj;
        dao.create(veiculo);
        return veiculo;
    }

    @Override
    public void delete(Object obj) {
        VeiculosClientes veiculo = (VeiculosClientes) obj;
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
        VeiculosClientes veiculo = (VeiculosClientes) obj;
        return dao.update(veiculo);
    }
}
