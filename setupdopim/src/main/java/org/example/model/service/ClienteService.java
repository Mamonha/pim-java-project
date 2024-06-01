package org.example.model.service;

import org.example.model.repositories.ClienteRepository;

import java.util.List;

public class ClienteService implements CrudInterface {

    private ClienteRepository cliente;

    public ClienteService() {
        cliente = new ClienteRepository();
    }

    @Override
    public Object create(Object obj) {
        return cliente.create(obj);
    }

    @Override
    public Object update(Object obj) {
        return cliente.update(obj);
    }

    @Override
    public void delete(Object obj) {
        cliente.delete(obj);
    }

    @Override
    public Object findById(Long id) {
        return cliente.findById(id);
    }

    @Override
    public List findAll() {
        return cliente.findAll();
    }

    public List findClientes(Long id){
        return cliente.findClientes(id);
    }
}
