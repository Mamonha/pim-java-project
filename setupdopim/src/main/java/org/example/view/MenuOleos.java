package org.example.view;

import org.example.controller.OleoController;
import org.example.model.entities.Filtro;
import org.example.model.entities.Oleo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuOleos {
    public static void menuOleos(){
        String marca;
        String modelo;
        String especificacao;
        Scanner sc = new Scanner(System.in);
        OleoController oleoController = new OleoController();
        Oleo oleo = new Oleo();

        boolean mantemLoop = true;
        do {
            System.out.println("Menu de Óleos");
            System.out.println("Escolha uma opção abaixo");
            System.out.println("1 - Cadastrar Óleo");
            System.out.println("2 - Remover Óleo");
            System.out.println("3 - Alterar dados de um Óleo");
            System.out.println("4 - Procurar um Óleo");
            System.out.println("5 - Ver todos os Óleo cadastrados");
            System.out.println("6 - sair");

            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:

                    System.out.println("Cadastrar óleo");
                    System.out.println("Digite a marca do filtro");
                    marca = sc.nextLine();
                    System.out.println("Digite o modelo");
                    modelo = sc.nextLine();
                    System.out.println("Digite a Especificação do óleo: Ex(20W50)" );
                    especificacao = sc.nextLine();
                    oleo.setMarca(marca);
                    oleo.setModelo(modelo);
                    oleo.setEspecificacao(especificacao);
                    oleoController.create(oleo);
                    break;
                case 2:
                    System.out.println("Remover Oleo");
                    for (Object obj : oleoController.findAll()) {
                        Oleo x = (Oleo) obj;
                        System.out.println("ID:" + x.getId() + " - Nome: " + x.getMarca() + " Modelo: " + x.getModelo() + "Especificação: " + x.getEspecificacao());
                    }
                    System.out.println("Digite o id do Óleo q ira ser removido");
                    Long idOleo = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Voce confirma a exclusao do filtro? \nSim \nNao");
                    String confirma = sc.nextLine().toUpperCase();
                    if (confirma.equals("SIM")) {
                        oleoController.delete(idOleo);
                        System.out.println("Óleo Removido");

                    }
                    break;
                case 3:
                    System.out.println("Alterador dados de um óleo");
                    for (Object obj : oleoController.findAll()) {
                        Oleo x = (Oleo) obj;
                        System.out.println("ID:" + x.getId() + " - Nome: " + x.getMarca() + " Modelo: " + x.getModelo() + "Especificação: " + x.getEspecificacao());
                    }
                    System.out.println("Digite o ID do óleo para alterar");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    oleo = oleoController.findById(id);
                    System.out.println("Óleo encontrado");
                    System.out.println("ID: " + oleo.getId());
                    System.out.println("Marca: " + oleo.getMarca());
                    System.out.println("Modelo: " + oleo.getModelo());
                    System.out.println("Especificação: " + oleo.getEspecificacao());
                    System.out.println("\nDigite os novos dados");
                    System.out.println("Marca: ");
                    String novaMarca = sc.nextLine();
                    if (!novaMarca.isEmpty()) {
                        oleo.setMarca(novaMarca);
                    }
                    sc.nextLine();
                    System.out.println("Modelo: ");
                    String novoModelo = sc.nextLine();
                    if (!novoModelo.isEmpty()) {
                        oleo.setModelo(novoModelo);
                    }
                    System.out.println("Especificação: ");
                    String novaEsp = sc.nextLine();
                    if ((!novaEsp.isEmpty())){
                        oleo.setModelo(novaEsp);
                    }
                    oleoController.update(oleo);

                    System.out.println("\nÓleo atualizado");
                    System.out.println("ID: " + oleo.getId());
                    System.out.println("Marca: " + oleo.getMarca());
                    System.out.println("Modelo: " + oleo.getModelo());
                    System.out.println("Especificação: " + oleo.getEspecificacao());

                    break;
                case 4:
                    System.out.println("Encontrar um Óleo");
                    System.out.println("Digite o id do Óleo");
                    Long idFiltro1 = sc.nextLong();
                    oleo = oleoController.findById(idFiltro1);

                    System.out.println("óleo encontrado");
                    System.out.println("ID: " + oleo.getId());
                    System.out.println("Marca: " + oleo.getMarca());
                    System.out.println("Modelo: " + oleo.getModelo());
                    System.out.println("Especificação: " + oleo.getEspecificacao());

                    break;
                case 5:
                    System.out.println("Todos Filtros Cadastrados");
                    for (Object obj : oleoController.findAll()) {
                        Oleo x = (Oleo) obj;
                        System.out.println("ID:" + x.getId() + " - Nome: " + x.getMarca() + " Modelo: " + x.getModelo() + "Especificação: " + x.getEspecificacao());
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
