package org.example.model.service;

import org.example.model.repositories.VeiculosMotoresRepository;

import java.util.List;

public class VeiculosMotoresService implements CrudInterface{

    private VeiculosMotoresRepository veiculo;

    public VeiculosMotoresService() {
        this.veiculo = new VeiculosMotoresRepository();
    }

    @Override
    public Object create(Object obj) {
        return veiculo.create(obj);
    }

    @Override
    public Object update(Object obj) {
        return veiculo.update(obj);
    }

    @Override
    public void delete(Object obj) {
        veiculo.delete(obj);
    }

    @Override
    public Object findById(Long id) {
        return veiculo.findById(id);
    }

    @Override
    public List findAll() {
        return veiculo.findAll();
    }
}
