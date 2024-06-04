package org.example.controller;

import org.example.model.entities.VeiculosClientesMotores;
import org.example.model.repositories.VeiculosClientesMotoresRepository;

import java.util.List;

public class VeiculosClientesMotoresController implements CrudController<VeiculosClientesMotores> {

    private VeiculosClientesMotoresRepository veiculosClientesMotoresService;

    public VeiculosClientesMotoresController() {
        veiculosClientesMotoresService = new VeiculosClientesMotoresRepository();
    }

    @Override
    public VeiculosClientesMotores create(Object obj) {
        return (VeiculosClientesMotores) veiculosClientesMotoresService.create(obj);
    }

    @Override
    public VeiculosClientesMotores update(Object obj) {
        return (VeiculosClientesMotores) veiculosClientesMotoresService.update(obj);
    }

    @Override
    public void delete(Object obj) {
        veiculosClientesMotoresService.delete(obj);
    }

    @Override
    public VeiculosClientesMotores findById(Long id) {
        return (VeiculosClientesMotores) veiculosClientesMotoresService.findById(id);
    }

    @Override
    public List<VeiculosClientesMotores> findAll() {
        return veiculosClientesMotoresService.findAll();
    }

    public VeiculosClientesMotores findByPlaca(String placa) {
        return (VeiculosClientesMotores) veiculosClientesMotoresService.findByPlaca(placa);
    }
}
