package org.example.View;

import org.example.controller.FiltroController;
import org.example.model.entities.Filtro;

import java.util.Scanner;

public class MenuFiltros {
    public static void menuFiltros(){
        String marca;
        String modelo;
        Scanner sc = new Scanner(System.in);
        FiltroController filtroController = new FiltroController();
        Filtro filtro = new Filtro();
        boolean mantemLoop = true;
        do {
            System.out.println("Menu de Filtros");
            System.out.println("Escolha uma opção abaixo");
            System.out.println("1 - Cadastrar Filtro");
            System.out.println("2 - Remover Filtro");
            System.out.println("3 - Alterar dados de um Filtro");
            System.out.println("4 - Procurar um Filtro");
            System.out.println("5 - Ver todos os Filtros cadastrados");
            System.out.println("6 - sair");

            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    
                    sc.nextLine();
                    System.out.println("Cadastrar Filtro");
                    System.out.println("Digite a marca do filtro");
                    marca = sc.nextLine();
                    System.out.println("Digite o modelo");
                    modelo = sc.nextLine();
                    filtro.setMarca(marca);
                    filtro.setModelo(modelo);
                    filtroController.create(filtro);
                    break;
                case 2:
                    System.out.println("Remover Filtro");
                    for (Object obj : filtroController.findAll()) {
                        Filtro x = (Filtro) obj;
                        System.out.println("ID:" + x.getId() + " - Nome: " + x.getMarca() + " Modelo: " + x.getModelo());
                    }
                    System.out.println("Digite o id do filtro q ira ser removido");
                    Long idFiltro = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Voce confirma a exclusao do filtro? \nSim \nNao");
                    String confirma = sc.nextLine().toUpperCase();
                    if (confirma.equals("SIM")) {
                        filtroController.delete(idFiltro);
                        System.out.println("filtro Removido");

                    }
                    break;
                case 3:
                    System.out.println("Alterador dados de um filtro");
                    for (Object obj : filtroController.findAll()) {
                        Filtro x = (Filtro) obj;
                        System.out.println("ID:" + x.getId() + " - Nome: " + x.getMarca() + " Modelo: " + x.getModelo());
                    }
                    System.out.println("Digite o ID do Filtro para alterar");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    filtro = filtroController.findById(id);
                    System.out.println("Filtro encontrado");
                    System.out.println("ID: " + filtro.getId());
                    System.out.println("Marca: " + filtro.getMarca());
                    System.out.println("Modelo: " + filtro.getModelo());
                    System.out.println("\nDigite os novos dados");
                    System.out.println("Marca: ");
                    String novaMarca = sc.nextLine();
                    if (!novaMarca.isEmpty()) {
                        filtro.setMarca(novaMarca);
                    }
                    sc.nextLine();
                    System.out.println("Modelo: ");
                    String novoModelo = sc.nextLine();
                    if (!novoModelo.isEmpty()) {
                        filtro.setModelo(novoModelo);
                    }
                    filtroController.update(filtro);
                    System.out.println("\nFiltro atualizado");
                    System.out.println("Marca: " + filtro.getMarca());
                    System.out.println("Modelo: " + filtro.getModelo());

                    break;
                case 4:
                    System.out.println("Encontrar um Filtro");
                    System.out.println("Digite o id do Filtro");
                    Long idFiltro1 = sc.nextLong();
                    filtro = filtroController.findById(idFiltro1);

                    System.out.println("Filtro encontrado");
                    System.out.println("ID: " + filtro.getId());
                    System.out.println("Marca: " + filtro.getMarca());
                    System.out.println("Modelo: " + filtro.getModelo());

                    break;
                case 5:
                    System.out.println("Todos Filtros Cadastrados");
                    for (Object obj : filtroController.findAll()) {
                        Filtro x = (Filtro) obj;
                        System.out.println("ID:" + x.getId() + " - Nome: " + x.getMarca() + " Modelo: " + x.getModelo());
                    }
                    break;
                case 6:
                    System.out.println("Saindo.");
                    mantemLoop = false;
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (mantemLoop == true);
    }
}
