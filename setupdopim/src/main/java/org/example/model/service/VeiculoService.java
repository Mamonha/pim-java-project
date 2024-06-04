package org.example.model.service;

import org.example.model.repositories.VeiculoRepository;

import java.util.List;

public class VeiculoService implements CrudInterface{

    private VeiculoRepository veiculo;

    public VeiculoService() {
        veiculo = new VeiculoRepository();
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

    public List findVeiculosTipo(String type){
        return veiculo.findVeiculosTipo(type);
    }

}
