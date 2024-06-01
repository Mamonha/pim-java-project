package org.example.model.service;

import org.example.model.repositories.UsuarioRepository;

import java.util.List;

public class UsuarioService implements CrudInterface{

    private UsuarioRepository usuario;

    public UsuarioService() {
        usuario = new UsuarioRepository();
    }

    @Override
    public Object create(Object obj) {
        return usuario.create(obj);
    }

    @Override
    public Object update(Object obj) {
        return usuario.update(obj);
    }

    @Override
    public void delete(Object obj) {
        usuario.delete(obj);
    }

    @Override
    public Object findById(Long id) {
        return usuario.findById(id);
    }

    @Override
    public List findAll() {
        return usuario.findAll();
    }

    public Object login(String login, String senha){
        return usuario.login(login, senha);
    }
}
