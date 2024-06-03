package org.example.view;

import java.util.Scanner;

import static org.example.view.CarroAsciiArt.bemVindo;
import static org.example.view.MenuFiltros.menuFiltros;
import static org.example.view.MenuVeiculo.menuVeiculo;
import static org.example.view.MenuOleos.menuOleos;
import static org.example.view.EstimateValue.show;
import static org.example.view.CarroAsciiArt.bemVindo;

public class Main {
    public static void main(String[] args) {
        bemVindo();
        Scanner sc = new Scanner(System.in);
        boolean mantemLoop = true;
        while (mantemLoop == true) {
        System.out.println("Escolha uma opção abaixo");
        System.out.println("1 - Gerenciar Filtros");
        System.out.println("2 - Gerenciar Óleos");
        System.out.println("3 - Gerenciar Veiculos");
        System.out.println("4 - Orçamento ");
        System.out.println("0 - sair");

            System.out.println("print gitt add . push");

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                menuFiltros();
                break;
            case 2:
                menuOleos();
                break;
            case 3:
                menuVeiculo();
                break;
            case 4:
                show();
                break;
            case 0:
                System.out.println("Saindo!");
                mantemLoop = false;
                break;
            default:
                System.out.println("Opção invalida Escolha outra opçao");
                break;

            }
        }
    }

    private static void bemVindo() {
    }
}
