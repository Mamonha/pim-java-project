package org.example.controller;

import org.example.model.entities.Motor;
import org.example.model.repositories.MotorRepository;

import java.util.List;

public class MotorController implements CrudController<Motor> {

    private MotorRepository motor;

    public MotorController() {
        motor = new MotorRepository();
    }

    @Override
    public Motor create(Object obj) {
        return (Motor) motor.create(obj);
    }

    @Override
    public Motor update(Object obj) {
        return (Motor) motor.create(obj);
    }

    @Override
    public void delete(Object obj) {
        motor.delete(obj);
    }

    @Override
    public Motor findById(Long id) {
        return (Motor) motor.findById(id);
    }

    @Override
    public List findAll() {
        return motor.findAll();
    }
}
