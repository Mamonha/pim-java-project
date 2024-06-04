package org.example.view;

import org.example.controller.MotorController;
import org.example.controller.VeiculoController;
import org.example.controller.VeiculosMotoresController;
import org.example.model.entities.Motor;
import org.example.model.entities.Veiculo;
import org.example.model.entities.VeiculosMotores;
import org.example.model.service.VeiculoService;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EstimateValue {

    public static void show(){
        Veiculo veiculo = new Veiculo();
        VeiculoController veiculocontroller = new VeiculoController();
        System.out.println("Menu Orçamento:");
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        do {
            System.out.println("Selecione o tipo de veiculo: (1- Leve ou 2- Utilitario)");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    List<Veiculo> veiculos = new ArrayList<>();

                    veiculos = veiculocontroller.findVeiculosTipo("leve");

                    for (Veiculo veiculochad: veiculos){
                        System.out.println("Id"+ veiculochad.getId() + " Marca: " + veiculochad.getMarca());
                    }
                    System.out.println("Escolha a marca: ");
                    Long id = sc.nextLong();

                    veiculo= veiculocontroller.findById(id);

                    veiculos = veiculocontroller.findVeiculosModelos(veiculo.getMarca());

                    for (Veiculo veiculochad: veiculos){
                        System.out.println("Id"+ veiculochad.getId() + " Marca: " + veiculochad.getMarca() + " Modelo: " + veiculochad.getModelo());
                    }
                    System.out.println("Escolha o Modelo: ");
                    id = sc.nextLong();

                    veiculo= veiculocontroller.findById(id);
                    veiculos = veiculocontroller.findVeiculosAno(veiculo.getAno());

                    for (Veiculo veiculochad: veiculos){
                        System.out.println("Id"+ veiculochad.getId() + " Marca: " + veiculochad.getMarca() + " Modelo: " + veiculochad.getModelo()+ " Ano: " + veiculochad.getAno());
                    }
                    System.out.println("Escolha o Modelo: ");
                    id = sc.nextLong();
                    veiculo= veiculocontroller.findById(id);

                    MotorController motorController = new MotorController();
                    List <Motor> motores= motorController.findAll();

                    for (Motor motorchad: motores){
                        System.out.println("Id"+ motorchad.getId() + "Nome: " + motorchad.getNome());
                    }
                    System.out.println("Escolha o Modelo: ");
                    id = sc.nextLong();

                    Motor motor= motorController.findById(id);

                    VeiculosMotoresController veiculosMotoresController= new VeiculosMotoresController();

                    VeiculosMotores veiculosMotores= new VeiculosMotores();

                    veiculosMotores.setMotor(motor);

                    veiculosMotores.setVeiculo(veiculo);

                    veiculosMotoresController.create(veiculosMotores);

                    break;
                case 2:
                    veiculocontroller.findVeiculosTipo("UTILITARIO");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }while (escolha != 3);



    }
}
