package org.example.model.repositories;

import org.example.model.entities.Motor;

import java.util.List;

public class MotorRepository implements CrudBasic{


    private DAO<Motor> dao;

    public MotorRepository() {
        this.dao = new DAO<Motor>(Motor.class);
    }

    @Override
    public Object create(Object obj) {
        Motor motor = (Motor) obj;
        dao.create(motor);
        return motor;
    }

    @Override
    public void delete(Object obj) {
        Motor motor = (Motor) obj;
        dao.delete(motor);
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
        Motor motor = (Motor) obj;
        return dao.update(motor);
    }
}
