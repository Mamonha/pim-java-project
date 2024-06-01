package org.example.model.repositories;

import org.example.model.entities.Usuario;

import java.util.List;

public class UsuarioRepository implements CrudBasic{

    private DAO<Usuario> dao;

    public UsuarioRepository() {
        this.dao = new DAO<Usuario>(Usuario.class);
    }

    @Override
    public Object create(Object obj) {
        Usuario user = (Usuario) obj;
        return dao.create(user);
    }

    @Override
    public void delete(Object obj) {

    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object findById(Long id) {
        return null;
    }

    @Override
    public Object update(Object obj) {
        return null;
    }
}
