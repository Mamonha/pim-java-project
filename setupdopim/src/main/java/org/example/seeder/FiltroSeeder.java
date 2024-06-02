package org.example.seeder;

import org.example.model.entities.Filtro;
import org.example.model.service.FiltroService;

public class FiltroSeeder {
    private FiltroService service;

    public FiltroSeeder(FiltroService service) {
        this.service = service;
    }

    public void seed() {
        Filtro[] filtros = new Filtro[8];

        filtros[0] = new Filtro();
        filtros[0].setMarca("TECFIL");
        filtros[0].setModelo("TM1");

        filtros[1] = new Filtro();
        filtros[1].setMarca("TECFIL");
        filtros[1].setModelo("TM2");

        filtros[2] = new Filtro();
        filtros[2].setMarca("TECFIL");
        filtros[2].setModelo("TM3");

        filtros[3] = new Filtro();
        filtros[3].setMarca("TECFIL");
        filtros[3].setModelo("TM4");

        filtros[4] = new Filtro();
        filtros[4].setMarca("TECFIL");
        filtros[4].setModelo("TM5");

        filtros[5] = new Filtro();
        filtros[5].setMarca("TECFIL");
        filtros[5].setModelo("PEL 108");

        filtros[6] = new Filtro();
        filtros[6].setMarca("TECFIL");
        filtros[6].setModelo("PEL674");

        filtros[7] = new Filtro();
        filtros[7].setMarca("TECFIL");
        filtros[7].setModelo("PSL652");

        for (Filtro filtro : filtros) {
            service.create(filtro);
        }
    }

    public static void main(String[] args) {
        FiltroService service = new FiltroService();
        FiltroSeeder seeder = new FiltroSeeder(service);
        seeder.seed();

        System.out.println("Todos os filtros:");
        for (Object filtro : service.findAll()) {
            System.out.println(filtro);
        }
    }
}
