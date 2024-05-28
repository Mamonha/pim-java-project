package org.example.model.repositories;

import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("jpa-config");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DAO(Class<E> classe) {
        if (emf == null) {
            throw new IllegalStateException("EntityManagerFactory is not initialized.");
        }
        this.em = emf.createEntityManager();
        this.classe = classe;
    }

    public DAO<E> openTransaction() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> closeTransaction() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> insert(E entity) {
        em.persist(entity);
        return this;
    }

    public DAO<E> remove(E entity) {
        em.remove(entity);
        return this;
    }

    public DAO<E> update(E entity) {
        em.merge(entity);
        return this;
    }

    public DAO<E> create(E entity) {
        return this.openTransaction().insert(entity).closeTransaction();
    }

    public DAO<E> delete(E entity) {
        return this.openTransaction().remove(entity).closeTransaction();
    }

    public List<E> getAllData(int quantity, int limit) {
        if (classe == null) {
            throw new UnsupportedOperationException("class null");
        }
        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(quantity);
        query.setFirstResult(limit);
        return query.getResultList();
    }

    public E findById(Long id) {
        return em.find(classe, id);
    }

    public List<E> findAllData() {
        return this.getAllData(10, 0);
    }

    //implementar no final
//    public E login(String email, String senha) {
//        String jpql = "SELECT u from UsuarioEntity u where u.email = :email";
//        TypedQuery<E> query = em.createQuery(jpql, classe);
//        query.setParameter("email", email);
//
//        List<E> result = query.getResultList();
//        if(result.isEmpty()) {
//            return null;
//        }
//
//        UsuarioEntity user = (UsuarioEntity) result.get(0);
//        if(BCrypt.checkpw(senha, user.getSenha())) {
//            return (E) user;
//        } else {
//            return null;
//        }
//    }

}
