package org.example.model.service;

import org.example.model.repositories.VeiculosClientesMotoresRepository;

import java.util.List;

public class VeiculosClientesMotoresService implements CrudInterface {

    private VeiculosClientesMotoresRepository veiculosClientesMotoresRepository;

    public VeiculosClientesMotoresService() {
        veiculosClientesMotoresRepository = new VeiculosClientesMotoresRepository();
    }

    @Override
    public Object create(Object obj) {
        return veiculosClientesMotoresRepository.create(obj);
    }

    @Override
    public Object update(Object obj) {
        return veiculosClientesMotoresRepository.update(obj);
    }

    @Override
    public void delete(Object obj) {
        veiculosClientesMotoresRepository.delete(obj);
    }

    @Override
    public Object findById(Long id) {
        return veiculosClientesMotoresRepository.findById(id);
    }

    @Override
    public List findAll() {
        return veiculosClientesMotoresRepository.findAll();
    }
}
