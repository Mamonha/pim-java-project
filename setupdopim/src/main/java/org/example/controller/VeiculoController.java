package org.example.controller;

import org.example.model.entities.Veiculo;
import org.example.model.repositories.VeiculoRepository;

import java.util.List;

public class VeiculoController implements CrudController<Veiculo> {

    private VeiculoRepository veiculo;

    public VeiculoController() {
        veiculo = new VeiculoRepository();
    }

    @Override
    public Veiculo create(Object obj) {
        return (Veiculo) veiculo.create(obj);
    }

    @Override
    public Veiculo update(Object obj) {
        return (Veiculo) veiculo.update(obj);
    }

    @Override
    public void delete(Object obj) {
        veiculo.delete(obj);
    }

    @Override
    public Veiculo findById(Long id) {
        return (Veiculo) veiculo.findById(id);
    }

    @Override
    public List findAll() {
        return veiculo.findAll();
    }

    public List<Veiculo> findVeiculosModelos(String marca) {return veiculo.findVeiculosModelos(marca); }

    public List<Veiculo> findVeiculosAno(Integer ano, String modelo) {return veiculo.findVeiculosAno(ano, modelo); }



}
