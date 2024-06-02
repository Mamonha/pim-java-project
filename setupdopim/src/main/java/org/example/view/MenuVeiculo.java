package org.example.view;

import org.example.controller.FiltroController;
import org.example.controller.VeiculoController;
import org.example.model.entities.Filtro;
import org.example.model.entities.Veiculo;

import java.util.Scanner;

public class MenuVeiculo {
    public static void menuVeiculo(){
        String tipo;
        String marca;
        String modelo;
        Integer ano;
        Scanner sc = new Scanner(System.in);
        VeiculoController veiculoController = new VeiculoController();
        Veiculo veiculo = new Veiculo();
        boolean mantemLoop = true;
        do {
            System.out.println("Menu de Filtros");
            System.out.println("Escolha uma opção abaixo");
            System.out.println("1 - Cadastrar Veiculo");
            System.out.println("2 - Remover Veiculo");
            System.out.println("3 - Alterar dados de um Veiculo");
            System.out.println("4 - Procurar um Veiculo");
            System.out.println("5 - Ver todos os Veiculo cadastrados");
            System.out.println("6 - sair");

            int escolha = sc.nextInt();


            switch (escolha) {
                case 1:

                    sc.nextLine();
                    System.out.println("Cadastrar Filtro");
                    System.out.println("Digite o tipo de carro");
                    tipo = sc.nextLine();
                    System.out.println("Digite a maraca do veiculo");
                    marca = sc.nextLine();
                    System.out.println("Digite o modelo do veiculo");
                    modelo = sc.nextLine();
                    System.out.println("Digite o ano do veuculo");
                    ano = sc.nextInt();
                    veiculo.setTipo(tipo);
                    veiculo.setMarca(marca);
                    veiculo.setModelo(modelo);
                    veiculo.setAno(ano);
                    veiculoController.create(veiculo);
                    break;
                case 2:
                    System.out.println("Remover Veiculo");
                    for (Object obj : veiculoController.findAll()) {
                        Veiculo x = (Veiculo) obj;
                        System.out.println("ID:" + x.getId() + " - Tipo: " + x.getTipo() + " Marca: " + x.getMarca()+ " modelo: " + x.getModelo()+ " Ano: " + x.getAno());
                    }
                    System.out.println("Digite o id do Carro q ira ser removido");
                    Long idVeiculo = sc.nextLong();
                    sc.nextLine();
                    System.out.println("Voce confirma a exclusao do filtro? \nSim \nNao");
                    String confirma = sc.nextLine().toUpperCase();
                    if (confirma.equals("SIM")) {
                        veiculoController.delete(idVeiculo);
                        System.out.println("filtro Removido");

                    }
                    break;
                case 3:
                    System.out.println("Alterador dados de um filtro");
                    for (Object obj : veiculoController.findAll()) {
                        Veiculo x = (Veiculo) obj;
                        System.out.println("ID:" + x.getId() + " - Tipo: " + x.getTipo() + " Marca: " + x.getMarca()+ " modelo: " + x.getModelo()+ " Ano: " + x.getAno());
                    }
                    System.out.println("Digite o ID do Veiculo para alterar");
                    Long id = sc.nextLong();
                    sc.nextLine();
                    veiculo = veiculoController.findById(id);
                    System.out.println("Veiculo encontrado");
                    System.out.println("ID: " + veiculo.getId());
                    System.out.println("Tipo: " + veiculo.getTipo());
                    System.out.println("Marca: " + veiculo.getMarca());
                    System.out.println("Modelo: " + veiculo.getModelo());
                    System.out.println("Ano: " + veiculo.getAno());
                    System.out.println("\nDigite os novos dados");
                    System.out.println("Tipo: ");
                    String novoTipo = sc.nextLine();
                    if (!novoTipo.isEmpty()) {
                        veiculo.setTipo(novoTipo);
                    }
                    sc.nextLine();
                    System.out.println("Marca: ");
                    String novaMarca = sc.nextLine();
                    if (!novaMarca.isEmpty()) {
                        veiculo.setMarca(novaMarca);
                    }
                    sc.nextLine();
                    System.out.println("Modelo: ");
                    String novoModelo = sc.nextLine();
                    if (!novoModelo.isEmpty()) {
                        veiculo.setModelo(novoModelo);
                    }
                    sc.nextLine();
                    System.out.println("Ano: ");
                    int novoAno = sc.nextInt();
                    veiculo.setAno(novoAno);
                    veiculoController.update(veiculo);
                    System.out.println("\nFiltro atualizado");
                    System.out.println("ID: " + veiculo.getId());
                    System.out.println("Tipo: " + veiculo.getTipo());
                    System.out.println("Marca: " + veiculo.getMarca());
                    System.out.println("Modelo: " + veiculo.getModelo());
                    System.out.println("Ano: " + veiculo.getAno());

                    break;
                case 4:
                    System.out.println("Encontrar um Veiculo");
                    System.out.println("Digite o id do Veiculo");
                    Long idVeiculo1 = sc.nextLong();
                    veiculo = veiculoController.findById(idVeiculo1);

                    System.out.println("Filtro encontrado");
                    System.out.println("ID: " + veiculo.getId());
                    System.out.println("Tipo: " + veiculo.getTipo());
                    System.out.println("Marca: " + veiculo.getMarca());
                    System.out.println("Modelo: " + veiculo.getModelo());
                    System.out.println("Ano: " + veiculo.getAno());

                    break;
                case 5:
                    System.out.println("Todos Veiculos Cadastrados");
                    for (Object obj : veiculoController.findAll()) {
                        Veiculo x = (Veiculo) obj;
                        System.out.println("ID:" + x.getId() + " - Tipo: " + x.getTipo() + " Marca: " + x.getMarca()+ " modelo: " + x.getModelo()+ " Ano: " + x.getAno());
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
        } while (mantemLoop);
    }
}
