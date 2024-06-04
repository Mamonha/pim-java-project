package org.example.controller;

import org.example.model.entities.Cliente;
import org.example.model.service.ClienteService;

import java.util.List;

public class ClienteController implements CrudController<Cliente> {

    private ClienteService cliente;

    public ClienteController() {
        cliente = new ClienteService();
    }

    @Override
    public Cliente create(Object obj) {
        return (Cliente) cliente.create(obj);
    }

    @Override
    public Cliente update(Object obj) {
        return (Cliente) cliente.update(obj);
    }

    @Override
    public void delete(Object obj) {
        cliente.delete(obj);
    }

    @Override
    public Cliente findById(Long id) {
        return (Cliente) cliente.findById(id);
    }

    @Override
    public List findAll() {
        return cliente.findAll();
    }

    public List findClientes(Long id) {
        return cliente.findClientes(id);
    }

    public Integer findQuantidadeDeClientes(Long id){
        return cliente.findQuantidadeDeClientes(id);
    }
}
