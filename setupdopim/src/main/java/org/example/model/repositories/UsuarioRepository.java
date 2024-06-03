package org.example.model.repositories;

import org.example.model.entities.Usuario;
import org.mindrot.jbcrypt.BCrypt;

import java.util.List;

public class UsuarioRepository implements CrudBasic{

    private DAO<Usuario> dao;

    public UsuarioRepository() {
        this.dao = new DAO<Usuario>(Usuario.class);
    }

    @Override
    public Object create(Object obj) {
        Usuario createUser = (Usuario)  obj;
        String hashedPassword = BCrypt.hashpw(createUser.getSenha(), BCrypt.gensalt());
        createUser.setSenha(hashedPassword);
        dao.create(createUser);
        return createUser;
    }

    @Override
    public void delete(Object obj) {
        Usuario user = (Usuario)  obj;
        dao.delete(user);
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
        Usuario user = (Usuario) obj;
        dao.update(user);
        return user;
    }

    public Usuario login(String login, String senha) {
        return dao.login(login, senha);
    }
}
