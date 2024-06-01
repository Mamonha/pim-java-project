package org.example.model.repositories;

import org.example.model.entities.Cliente;
import org.example.model.entities.Cliente ;
import org.example.model.entities.Usuario;

import java.util.List;

public class ClienteRepository implements CrudBasic{

    private DAO<Cliente> dao;

    public ClienteRepository() {
        this.dao = new DAO<Cliente>(Cliente.class);
    }

    @Override
    public Object create(Object obj) {
        Cliente cliente = (Cliente) obj;
        dao.create(cliente);
        return cliente;
    }

    @Override
    public void delete(Object obj) {
        Cliente cliente = (Cliente) obj;
        dao.delete(cliente);
    }

    @Override
    public List findAll() {
        return dao.getAllData();
    }

    @Override
    public Object findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public Object update(Object obj) {
        Cliente cliente = (Cliente) obj;
        return dao.update(cliente);
    }

    public List findClientes(Long id){
        return dao.findClientes(id);
    }
}
