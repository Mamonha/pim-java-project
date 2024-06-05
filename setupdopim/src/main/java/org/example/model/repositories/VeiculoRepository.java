package org.example.model.repositories;

import org.example.model.entities.Veiculo;

import java.util.List;

public class VeiculoRepository implements CrudBasic{

    private DAO<Veiculo> dao;

    public VeiculoRepository() {
        this.dao = new DAO<Veiculo>(Veiculo.class);
    }

    @Override
    public Object create(Object obj) {
        Veiculo veiculo = (Veiculo) obj;
        dao.create(veiculo);
        return veiculo;
    }

    @Override
    public void delete(Object obj) {
        Veiculo veiculo = (Veiculo) obj;
        dao.delete(veiculo);
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
        Veiculo veiculo = (Veiculo) obj;
        dao.update(veiculo);
        return veiculo;
    }

    public List<Veiculo> findVeiculosModelos(String marca) {return dao.findVeiculosModelo(marca);}

    public List<Veiculo> findVeiculosAno(Integer ano, String modelo) {return dao.findVeiculosAno(ano, modelo);}
}
