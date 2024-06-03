package org.example.seeder;

import org.example.model.entities.Motor;
import org.example.model.entities.Oleo;
import org.example.model.entities.Filtro;
import org.example.model.repositories.MotorRepository;
import org.example.model.service.MotorService;
import org.example.model.service.OleoService;
import org.example.model.service.FiltroService;

import java.util.Arrays;
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

    private static class MotorInfo {
        String nome;
        Long idOleo;
        Long idFiltro;

        MotorInfo(String nome, Long idOleo, Long idFiltro) {
            this.nome = nome;
            this.idOleo = idOleo;
            this.idFiltro = idFiltro;
        }
    }

    public void seed() {
//        Motor motor = new Motor();
//        motor.setNome("1.0 8V L4 RENAULT");
//        motorService.create(motor);
//        Oleo newOleo1 = (Oleo) oleoService.findById((long) 2);
//        Filtro filtro1 = (Filtro) filtroService.findById((long) 5);
//        motor.setFiltro(filtro1);
//        motor.setOleo(newOleo1);
//        repo.update1(motor);
//
//        Motor motor1 = new Motor();
//        motor1.setNome("2.0 8V MPFI L4");
//        motorService.create(motor1);
//        Oleo newOleo2 = (Oleo) oleoService.findById((long) 3);
//        Filtro filtro2 = (Filtro) filtroService.findById((long) 3);
//        motor1.setFiltro(filtro2);
//        motor1.setOleo(newOleo2);
//        repo.update1(motor1);
//
//        Motor motor2 = new Motor();
//        motor2.setNome("1.4 8V MPFI L4");
//        motorService.create(motor2);
//        Oleo newOleo3 = (Oleo) oleoService.findById((long) 4);
//        Filtro filtro3 = (Filtro) filtroService.findById((long) 3);
//        motor2.setFiltro(filtro3);
//        motor2.setOleo(newOleo3);
//        repo.update1(motor2);
//
//        Motor motor3 = new Motor();
//        motor3.setNome("2.0 16V K20 L4");
//        motorService.create(motor3);
//        Oleo newOleo4 = (Oleo) oleoService.findById((long) 4);
//        Filtro filtro4 = (Filtro) filtroService.findById((long) 5);
//        motor3.setFiltro(filtro4);
//        motor3.setOleo(newOleo4);
//        repo.update1(motor3);
//
//        Motor motor4 = new Motor();
//        motor4.setNome("2.0 16V L4");
//        motorService.create(motor4);
//        Oleo newOleo5 = (Oleo) oleoService.findById((long) 4);
//        Filtro filtro5 = (Filtro) filtroService.findById((long) 1);
//        motor4.setFiltro(filtro5);
//        motor4.setOleo(newOleo5);
//        repo.update1(motor4);
//
//        Motor motor5 = new Motor();
//        motor5.setNome("1.0 8V L4");
//        motorService.create(motor5);
//        Oleo newOleo6 = (Oleo) oleoService.findById((long) 6);
//        Filtro filtro6 = (Filtro) filtroService.findById((long) 3);
//        motor5.setFiltro(filtro6);
//        motor5.setOleo(newOleo6);
//        repo.update1(motor5);
//
//        Motor motor6 = new Motor();
//        motor6.setNome("1.6 8V MSI L4");
//        motorService.create(motor6);
//        Oleo newOleo7 = (Oleo) oleoService.findById((long) 7);
//        Filtro filtro7 = (Filtro) filtroService.findById((long) 2);
//        motor6.setFiltro(filtro7);
//        motor6.setOleo(newOleo7);
//        repo.update1(motor6);
//
//        Motor motor7 = new Motor();
//        motor7.setNome("1.6 8V EA827 L4");
//        motorService.create(motor7);
//        Oleo newOleo8 = (Oleo) oleoService.findById((long) 1);
//        Filtro filtro8 = (Filtro) filtroService.findById((long) 2);
//        motor7.setFiltro(filtro8);
//        motor7.setOleo(newOleo8);
//        repo.update1(motor7);
//
//        Motor motor8 = new Motor();
//        motor8.setNome("1.0 8V L4");
//        motorService.create(motor8);
//        Oleo newOleo9 = (Oleo) oleoService.findById((long) 1);
//        Filtro filtro9 = (Filtro) filtroService.findById((long) 2);
//        motor8.setFiltro(filtro9);
//        motor8.setOleo(newOleo9);
//        repo.update1(motor8);
//
//        Motor motor9 = new Motor();
//        motor9.setNome("1.0 12V L3");
//        motorService.create(motor9);
//        Oleo newOleo10 = (Oleo) oleoService.findById((long) 4);
//        Filtro filtro10 = (Filtro) filtroService.findById((long) 5);
//        motor9.setFiltro(filtro10);
//        motor9.setOleo(newOleo10);
//        repo.update1(motor9);
//
//        Motor motor10 = new Motor();
//        motor10.setNome("1.8 16v L4");
//        motorService.create(motor10);
//        Oleo newOleo11 = (Oleo) oleoService.findById((long) 4);
//        Filtro filtro11 = (Filtro) filtroService.findById((long) 7);
//        motor10.setFiltro(filtro11);
//        motor10.setOleo(newOleo11);
//        repo.update1(motor10);
//
//        Motor motor11 = new Motor();
//        motor11.setNome("1.6 16v L4");
//        motorService.create(motor11);
//        Oleo newOleo12 = (Oleo) oleoService.findById((long) 2);
//        Filtro filtro12 = (Filtro) filtroService.findById((long) 6);
//        motor11.setFiltro(filtro12);
//        motor11.setOleo(newOleo12);
//        repo.update1(motor11);
//
//        Motor motor12 = new Motor();
//        motor12.setNome("1.4 8V L4");
//        motorService.create(motor12);
//        Oleo newOleo13 = (Oleo) oleoService.findById((long) 2);
//        Filtro filtro13 = (Filtro) filtroService.findById((long) 6);
//        motor12.setFiltro(filtro13);
//        motor12.setOleo(newOleo13);
//        repo.update1(motor12);

        List<MotorInfo> motores = Arrays.asList(
                new MotorInfo("1.0 8V L4 RENAULT", 2L, 5L),
                new MotorInfo("2.0 8V MPFI L4", 3L, 3L),
                new MotorInfo("1.4 8V MPFI L4", 4L, 3L),
                new MotorInfo("2.0 16V K20 L4", 4L, 5L),
                new MotorInfo("2.0 16V L4", 4L, 1L),
                new MotorInfo("1.0 8V L4", 6L, 3L),
                new MotorInfo("1.6 8V MSI L4", 7L, 2L),
                new MotorInfo("1.6 8V EA827 L4", 1L, 2L),
                new MotorInfo("1.0 8V L4", 1L, 5L),
                new MotorInfo("1.0 12V L3", 4L, 5L),
                new MotorInfo("1.8 16v L4", 4L, 7L),
                new MotorInfo("1.6 16v L4", 2L, 6L),
                new MotorInfo("1.4 8V L4", 2L, 6L)

        );

        for (MotorInfo info : motores) {
            Motor motor = new Motor();
            motor.setNome(info.nome);
            motorService.create(motor);
            Oleo oleo = (Oleo) oleoService.findById(info.idOleo);
            Filtro filtro = (Filtro) filtroService.findById(info.idFiltro);
            motor.setFiltro(filtro);
            motor.setOleo(oleo);
            repo.update1(motor);
        }
    }



    public static void main(String[] args) {
        MotorService motorService = new MotorService();
        OleoService oleoService = new OleoService();
        FiltroService filtroService = new FiltroService();

        MotorSeeder seeder = new MotorSeeder(motorService, oleoService, filtroService);;

        seeder.seed();

        System.out.println("Motores criados com sucesso!");
    }
}
