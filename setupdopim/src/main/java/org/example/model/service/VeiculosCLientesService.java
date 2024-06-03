package org.example.model.service;

import org.example.model.repositories.VeiculosClientesRepository;

import java.util.List;

public class VeiculosCLientesService implements CrudInterface{

    private VeiculosClientesRepository veiculo;

    public VeiculosCLientesService() {
        veiculo = new VeiculosClientesRepository();
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
