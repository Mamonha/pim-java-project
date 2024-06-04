package org.example.seeder;

import org.example.model.entities.Motor;
import org.example.model.entities.Oleo;
import org.example.model.service.MotorService;
import org.example.model.service.OleoService;

public class OleoSeeder {
    private OleoService service;
    private MotorService motorService;
    public OleoSeeder(OleoService service) {
        this.service = service;
        this.motorService = new MotorService();
    }

    public void seed() {
        Oleo[] oleos = new Oleo[10];
        oleos[0] = new Oleo();
        oleos[0].setMarca("LUBRAX");
        oleos[0].setEspecificacao("TECNO");
        oleos[0].setModelo("15W40");
        oleos[1] = new Oleo();
        oleos[1].setMarca("LUBRAX");
        oleos[1].setEspecificacao("TECNO");
        oleos[1].setModelo("10W40");

        oleos[2] = new Oleo();
        oleos[2].setMarca("LUBRAX");
        oleos[2].setEspecificacao("ESSENCIAL");
        oleos[2].setModelo("20W50");

        oleos[3] = new Oleo();
        oleos[3].setMarca("LUBRAX");
        oleos[3].setEspecificacao("VALORA");
        oleos[3].setModelo("5W30");

        oleos[4] = new Oleo();
        oleos[4].setMarca("LUBRAX");
        oleos[4].setEspecificacao("VALORA");
        oleos[4].setModelo("5W40");

        oleos[5] = new Oleo();
        oleos[5].setMarca("LUBRAX");
        oleos[5].setEspecificacao("VALORA");
        oleos[5].setModelo("0W20");

        oleos[6] = new Oleo();
        oleos[6].setMarca("LUBRAX");
        oleos[6].setEspecificacao("SUPERA");
        oleos[6].setModelo("5W40");

        oleos[7] = new Oleo();
        oleos[7].setMarca("LUBRAX");
        oleos[7].setEspecificacao("SUPERA");
        oleos[7].setModelo("5W30");

        oleos[8] = new Oleo();
        oleos[8].setMarca("LUBRAX");
        oleos[8].setEspecificacao("SUPERA");
        oleos[8].setModelo("0W20");

        oleos[9] = new Oleo();
        oleos[9].setMarca("LUBRAX");
        oleos[9].setEspecificacao("SUPERA");
        oleos[9].setModelo("5W20");

        for (Oleo oleo : oleos) {
            service.create(oleo);
        }

    }

    public static void runOleo() {
        OleoService service = new OleoService();
        OleoSeeder seeder = new OleoSeeder(service);
        seeder.seed();

        System.out.println("Todos os óleos:");
        for (Object oleo : service.findAll()) {
            System.out.println(oleo);
        }
    }
}
