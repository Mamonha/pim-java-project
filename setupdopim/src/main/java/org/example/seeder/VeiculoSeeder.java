package org.example.seeder;

import org.example.model.entities.Veiculo;
import org.example.model.service.VeiculoService;

public class VeiculoSeeder {
    private VeiculoService service;

    public VeiculoSeeder(VeiculoService service) {
        this.service = service;
    }

    public void seed() {
        Object[][] veiculosData = {
                {"LEVE", "RENAULT", "CLIO", 2008, null},
                {"LEVE", "CHEVROLET", "ASTRA", 2001, null},
                {"LEVE", "CHEVROLET", "CORSA", 2010, null},
                {"LEVE", "HONDA", "CIVIC", 2007, null},
                {"LEVE", "FORD", "FIESTA", 2010, null},
                {"LEVE", "CHEVROLET", "ONIX", 2015, null},
                {"UTILITARIO", "VOLKSWAGEN", "SAVEIRO", 2012, null},
                {"LEVE", "VOLKSWAGEN", "GOL", 2006, null},
                {"LEVE", "FIAT", "UNO", 2010, null},
                {"LEVE", "HYUNDAI", "HB20", 2018, null},
                {"LEVE", "CHEVROLET", "CRUZE", 2014, null},
                {"LEVE", "PEUGEOT", "206", 2005, null},
                {"LEVE", "PEUGEOT", "207", 2012, null}
        };

        for (Object[] veiculoData : veiculosData) {
            Veiculo veiculo = new Veiculo();
            veiculo.setTipo((String) veiculoData[0]);
            veiculo.setMarca((String) veiculoData[1]);
            veiculo.setModelo((String) veiculoData[2]);
            if (veiculoData[3] != null) {
                veiculo.setAno((Integer) veiculoData[3]);
            }

            service.create(veiculo);
        }
    }

    public static void runVeiculo() {
        VeiculoService service = new VeiculoService();
        VeiculoSeeder seeder = new VeiculoSeeder(service);
        seeder.seed();

        System.out.println("Todos os veículos:");
        for (Object veiculo : service.findAll()) {
            System.out.println(veiculo);
        }
    }
}
