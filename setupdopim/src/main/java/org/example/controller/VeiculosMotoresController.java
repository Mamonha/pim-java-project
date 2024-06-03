package org.example.controller;

import org.example.model.entities.VeiculosMotores;
import org.example.model.repositories.VeiculosMotoresRepository;

import java.util.List;

public class VeiculosMotoresController implements CrudController<VeiculosMotores> {

    private VeiculosMotoresRepository veiculo;

    public VeiculosMotoresController() {
        this.veiculo = new VeiculosMotoresRepository();
    }

    @Override
    public VeiculosMotores create(Object obj) {
        return (VeiculosMotores) veiculo.create(obj);
    }

    @Override
    public VeiculosMotores update(Object obj) {
        return (VeiculosMotores) veiculo.update(obj);
    }

    @Override
    public void delete(Object obj) {
        veiculo.delete(obj);
    }

    @Override
    public VeiculosMotores findById(Long id) {
        return (VeiculosMotores) veiculo.findById(id);
    }

    @Override
    public List findAll() {
        return veiculo.findAll();
    }
}
