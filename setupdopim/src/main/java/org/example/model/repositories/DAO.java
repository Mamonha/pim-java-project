package org.example.model.repositories;

import org.example.model.entities.Usuario;
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

    public List<E> getAllData() {
        if (classe == null) {
            throw new UnsupportedOperationException("class null");
        }
        String jpql = "select e from " + classe.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        return query.getResultList();
    }

    public E findById(Long id) {
        return em.find(classe, id);
    }

//    public List<E> findAllData() {
//        return this.getAllData();
//    }


    public E login(String login, String senha) {
        String jpql = "SELECT u from Usuario u where u.login = :login";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setParameter("login", login);

        List<E> result = query.getResultList();
        if(result.isEmpty()) {
            return null;
        }

        Usuario user = (Usuario) result.get(0);
        if(BCrypt.checkpw(senha, user.getSenha())) {
            return (E) user;
        } else {
            return null;
        }
    }

    public List findClientes(Long id) {
        String jpql = "SELECT c from Cliente c where c.usuario.id = :id";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setParameter("id", id);
        List<E> result = query.getResultList();
        return result.isEmpty() ? null : result;
    }

    public List<E> findVeiculosTipo(String type) {
        String jpql = "SELECT v from Veiculo v where v.tipo = :type";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setParameter("type", type);
        List<E> result = query.getResultList();
        return result.isEmpty() ? null : result;
    }


    public Integer findClientsNumber(Long id) {
        String jpql = "SELECT count(c.id) from Cliente c WHERE c.usuario.id = :id";
        TypedQuery<Long> query = em.createQuery(jpql, Long.class);
        query.setParameter("id", id);
        Long quantidade = query.getSingleResult();
        return quantidade != null ? quantidade.intValue() : 0;
    }



}
