package org.example.model.service;

import org.example.model.entities.VeiculosClientesMotores;
import org.example.model.repositories.VeiculosClientesMotoresRepository;
import org.hibernate.type.ObjectType;

import java.sql.SQLException;
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

    public Object findByPlaca(String placa) {
        try {
            return veiculosClientesMotoresRepository.findByPlaca(placa);
        } catch (RuntimeException e){
            System.out.println("Nada encontrado");
        }
        return null;
    }
}
