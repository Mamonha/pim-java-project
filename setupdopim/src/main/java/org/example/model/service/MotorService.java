package org.example.model.service;

import org.example.model.repositories.MotorRepository;

import java.util.List;

public class MotorService implements CrudInterface {

    private MotorRepository motor;

    public MotorService() {
        motor = new MotorRepository();
    }

    @Override
    public Object create(Object obj) {
        return motor.create(obj);
    }

    @Override
    public Object update(Object obj) {
        return motor.update(obj);
    }

    @Override
    public void delete(Object obj) {
        motor.delete(obj);
    }

    @Override
    public Object findById(Long id) {
        return motor.findById(id);
    }

    @Override
    public List findAll() {
        return motor.findAll();
    }
}
