package org.example.View;

import java.util.Scanner;

import static org.example.View.CarroAsciiArt.bemVindo;
import static org.example.View.MenuFiltros.menuFiltros;
import static org.example.View.MenuOleos.menuOleos;

public class Main {
    public static void main(String[] args) {
        bemVindo();
        Scanner sc = new Scanner(System.in);
        boolean mantemLoop = true;
        while (mantemLoop == true) {
        System.out.println("Escolha uma opção abaixo");
        System.out.println("1 - Gerenciar Filtros");
        System.out.println("2 - Gerenciar Óleos");
        System.out.println("3 - Fazer um Orçamento");
        System.out.println("4 - Fazer uma Troca ");
        System.out.println("0 - sair");

            System.out.println("atualizaÇÃO"); //remover isso depois
            ''

        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                menuFiltros();
                break;
            case 2:
                menuOleos();
                break;
            case 3:

                break;
            case 4:

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
}
