package org.example.view;

import org.example.controller.VeiculoController;
import org.example.model.entities.Veiculo;
import org.example.model.service.VeiculoService;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EstimateValue {

    public static void show(){
        Veiculo veiculo = new Veiculo();
        VeiculoController controller = new VeiculoController();
        System.out.println("Menu Orçamento:");
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        do {
            System.out.println("Selecione o tipo de veiculo: (1- Leve ou 2- Utilitario)");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    List<Veiculo> veiculos = new ArrayList<>();

                    veiculos = controller.findVeiculosTipo("LEVE");

                    for (Veiculo veiculochad: veiculos){
                        System.out.println("Id"+ veiculochad.getId() + "Marca: " + veiculochad.getMarca());
                    }
                    System.out.println("Escolha a marca: ");
                    int escolhaMarca = sc.nextInt();


                    break;
                case 2:
                    controller.findVeiculosTipo("UTILITARIO");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }while (escolha != 3);



    }
}
