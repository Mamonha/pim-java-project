package org.example.controller;

import org.example.model.entities.VeiculosClientesMotores;
import org.example.model.repositories.VeiculosClientesMotoresRepository;

import java.util.List;

public class VeiculosClientesMotoresController implements CrudController<VeiculosClientesMotores> {

    private VeiculosClientesMotoresRepository veiculosClientesMotoresRepository;

    public VeiculosClientesMotoresController() {
        veiculosClientesMotoresRepository = new VeiculosClientesMotoresRepository();
    }

    @Override
    public VeiculosClientesMotores create(Object obj) {
        return (VeiculosClientesMotores) veiculosClientesMotoresRepository.create(obj);
    }

    @Override
    public VeiculosClientesMotores update(Object obj) {
        return (VeiculosClientesMotores) veiculosClientesMotoresRepository.update(obj);
    }

    @Override
    public void delete(Object obj) {
        veiculosClientesMotoresRepository.delete(obj);
    }

    @Override
    public VeiculosClientesMotores findById(Long id) {
        return (VeiculosClientesMotores) veiculosClientesMotoresRepository.findById(id);
    }

    @Override
    public List<VeiculosClientesMotores> findAll() {
        return veiculosClientesMotoresRepository.findAll();
    }
}
