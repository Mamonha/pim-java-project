package org.example.controller;

import org.example.model.entities.Usuario;
import org.example.model.repositories.UsuarioRepository;

import java.util.List;

public class UsuarioController implements CrudController<Usuario> {

    private UsuarioRepository usuario;

    public UsuarioController() {
        usuario = new UsuarioRepository();
    }

    @Override
    public Usuario create(Object obj) {
        return (Usuario) usuario.create(obj);
    }

    @Override
    public Usuario update(Object obj) {
        return (Usuario) usuario.create(obj);
    }

    @Override
    public void delete(Object obj) {
        usuario.delete(obj);
    }

    @Override
    public Usuario findById(Long id) {
        return (Usuario) usuario.findById(id);
    }

    @Override
    public List findAll() {
        return usuario.findAll();
    }

    public Usuario login(String login, String senha) {
        return usuario.login(login, senha);
    }
}
