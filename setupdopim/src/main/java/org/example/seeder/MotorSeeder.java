package org.example.seeder;

import org.example.model.entities.Motor;
import org.example.model.entities.Oleo;
import org.example.model.entities.Filtro;
import org.example.model.repositories.MotorRepository;
import org.example.model.service.MotorService;
import org.example.model.service.OleoService;
import org.example.model.service.FiltroService;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MotorSeeder {

    private MotorService motorService;
    private OleoService oleoService;
    private FiltroService filtroService;
    MotorRepository repo = new MotorRepository();

    public MotorSeeder(MotorService motorService, OleoService oleoService, FiltroService filtroService) {
        this.motorService = motorService;
        this.oleoService = oleoService;
        this.filtroService = filtroService;
    }

    public void seed() {
//        String[] nomesMotores = {
//                "1.0 8V L4",
//                "2.0 8V MPFI L4",
//                "1.4 8V MPFI L4",
//                "2.0 16V K20 L4",
//                "2.0 16V L4",
//                "1.0 8V L4",
//                "1.6 8V MSI L4",
//                "1.6 8V EA827 L4",
//                "1.0 8V L4",
//                "1.0 12V L3",
//                "1.8 16v L4",
//                "1.6 16v L4",
//                "1.4 8V L4"
//        };

        Motor motor = new Motor();
        motor.setNome("1.0 8V L4");
        motorService.create(motor);

        Oleo oleo = new Oleo();
        oleo.setEspecificacao("T");
        oleo.setMarca("D");
        oleo.setModelo("AH");
        oleoService.create(oleo);

        motor.setOleo(oleo);

        repo.update1(motor);
//                System.out.println("Motor atualizado: " + motor);
//            }
//        }, 5000);

    }

    public static void main(String[] args) {
        MotorService motorService = new MotorService();
        OleoService oleoService = new OleoService();
        FiltroService filtroService = new FiltroService();
//        filtroService.findById((long)2);
//        System.out.p
        MotorSeeder seeder = new MotorSeeder(motorService, oleoService, filtroService);
//
//        // Aqui você precisa obter as listas de objetos Oleo e Filtro
//        List<Oleo> oleos = oleoService.findAll();
//        List<Filtro> filtros = filtroService.findAll();

        seeder.seed();

        System.out.println("Motores criados com sucesso!");
    }
}
