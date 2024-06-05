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

import static org.example.view.Main.usuario;

public class EstimateValue {

    public static void show(){
        Veiculo veiculo = new Veiculo();
        VeiculoController veiculocontroller = new VeiculoController();
        System.out.println("Menu Orçamento:");
        Scanner sc = new Scanner(System.in);
            System.out.println("Selecione o tipo de veiculo: (1- Leve  2- Utilitario  3-sair)");
                    List<Veiculo> veiculos = new ArrayList<>();
                    List<Veiculo> veiculosVerificar = new ArrayList<>();
                    veiculos = veiculocontroller.findAll();
                    for (Veiculo veiculochad : veiculos) {
                        boolean marcaJaImpressa = false;
                        for (Veiculo veiculoInList : veiculosVerificar) {
                            if (veiculochad.getMarca().equals(veiculoInList.getMarca())) {
                                marcaJaImpressa = true;
                                break;
                            }
                        }
                        if (!marcaJaImpressa) {
                            System.out.println("Id " + veiculochad.getId() + " Marca: " + veiculochad.getMarca());
                            veiculosVerificar.add(veiculochad);
                        }
                    }
                    System.out.println("Escolha a marca: ");
                    Long id = sc.nextLong();

                    veiculo= veiculocontroller.findById(id);

                    veiculos = veiculocontroller.findVeiculosModelos(veiculo.getMarca());

                    for (Veiculo veiculochad: veiculos){
                        System.out.println("Id "+ veiculochad.getId() + " Marca: " + veiculochad.getMarca() + " Modelo: " + veiculochad.getModelo());
                    }
                    System.out.println("Escolha o Modelo: ");
                    id = sc.nextLong();

                    veiculo= veiculocontroller.findById(id);
                    veiculos = veiculocontroller.findVeiculosAno(veiculo.getAno(), veiculo.getModelo());

                    for (Veiculo veiculochad: veiculos){
                        System.out.println("Id "+ veiculochad.getId() + " Marca: " + veiculochad.getMarca() + " Modelo: " + veiculochad.getModelo()+ " Ano: " + veiculochad.getAno());
                    }
                    System.out.println("Escolha o Ano: ");
                    id = sc.nextLong();
                    veiculo= veiculocontroller.findById(id);

                    MotorController motorController = new MotorController();
                    List <Motor> motores= motorController.findAll();

                    for (Motor motorchad: motores){
                        System.out.println("Id "+ motorchad.getId() + "Nome: " + motorchad.getNome());
                    }
                    System.out.println("Escolha o Modelo: ");
                    id = sc.nextLong();

                    Motor motor= motorController.findById(id);

                    VeiculosMotoresController veiculosMotoresController= new VeiculosMotoresController();

                    VeiculosMotores veiculosMotores= new VeiculosMotores();

                    veiculosMotores.setMotor(motor);

                    veiculosMotores.setVeiculo(veiculo);

                    veiculosMotoresController.create(veiculosMotores);

                    System.out.println("Id "+ veiculo.getId() + " Marca: " + veiculo.getMarca() + " Modelo: " + veiculo.getModelo() + " Motor: " + motor.getNome());
                    System.out.println("Oleo recomendado:   Especificacao: " + motor.getOleo().getEspecificacao() + " Modelo: " + motor.getOleo().getModelo());
                    System.out.println("Filtro recomendado:  Modelo:" + motor.getFiltro().getModelo() + "\n");
    }
}


