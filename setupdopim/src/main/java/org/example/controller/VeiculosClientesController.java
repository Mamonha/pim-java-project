package org.example.controller;

import org.example.model.entities.VeiculosClientes;
import org.example.model.service.VeiculosCLientesService;

import java.util.List;

public class VeiculosClientesController implements CrudController<VeiculosClientes> {

    private VeiculosCLientesService veiculo;



    public VeiculosClientesController() {
        this.veiculo = new VeiculosCLientesService();
    }

    @Override
    public VeiculosClientes create(Object obj) {
        return (VeiculosClientes) veiculo.create(obj);
    }

    @Override
    public VeiculosClientes update(Object obj) {
        return (VeiculosClientes) veiculo.update(obj);
    }

    @Override
    public void delete(Object obj) {
        veiculo.delete(obj);
    }

    @Override
    public VeiculosClientes findById(Long id) {
        return (VeiculosClientes) veiculo.findById(id);
    }

    @Override
    public List findAll() {
        return veiculo.findAll();
    }
}
