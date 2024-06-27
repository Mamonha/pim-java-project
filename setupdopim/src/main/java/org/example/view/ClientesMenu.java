package org.example.view;

import org.example.controller.*;
import org.example.model.entities.Cliente;
import org.example.model.entities.VeiculosClientes;
import org.example.model.entities.VeiculosClientesMotores;
import org.example.model.entities.VeiculosMotores;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static org.example.view.Main.*;

public class ClientesMenu {

    private static Scanner sc = new Scanner(System.in);
    private static ClienteController clienteController = new ClienteController();
    private static VeiculosClientesController veiculosClientesController = new VeiculosClientesController();
    private static VeiculosMotoresController veiculosMotoresController = new VeiculosMotoresController();
    private static VeiculosClientesMotoresController veiculosClientesMotoresController = new VeiculosClientesMotoresController();

    public static void clienteMenu() {


        Boolean sair = true;
        System.out.println("Quantidade de clientes cadastradas: " + clienteController.findQuantidadeDeClientes(usuario.getId()));

        while (sair) {
            System.out.println("1 - cadastrar um cliente");
            System.out.println("2 - atualizar dados de um cliente");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Cadastrar Veiculos Clientes");
            System.out.println("5 - Procurar Veiculo por placa");
            System.out.println("6 - sair");
            System.out.println("Digite qual opcao deseja fazer! ");
            Integer opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    atualizarCliente();
                    break;
                case 3:
                    listarClientes();
                    break;
                case 4:
                    cadastrarVeiculosClientes();
                    break;
                case 5:
                    procurarVeiculoPlaca();

                    break;
                case 6:
                    System.out.println("Voltando a tela principal! ");
                    sair = false;
                    break;
                default:
                    System.out.println("Opcao Invalida, tente novamente");
                    break;

            }
        }
    }

    public static void cadastrarCliente() {
        System.out.println("Digite o nome do usuario: ");
        String nome = sc.nextLine();

        System.out.println("Digite o email do usuario: ");
        String email = sc.nextLine();

        System.out.println("Digite o cpf: ");
        String cpf = sc.nextLine();
        Cliente clienteAdd = new Cliente(null, nome, email, cpf, usuario);
        clienteAdd = clienteController.create(clienteAdd);
        if(clienteAdd != null) {
            System.out.println("Atualizado com sucesso!");
        } else {
            System.out.println("Falha ao cadastrar Usuario");
        }
    }

    public static void listarClientes() {
        for (Cliente cliente: usuario.getClientes()
             ) {
            System.out.println(cliente.toString());
        }
    }

    public static void atualizarCliente() {
        listarClientes();
        System.out.println("Digite o id que você deseja alterar: ");
        Long id = sc.nextLong();
        sc.nextLine();
        Cliente cliente = clienteController.findById(id);
        if(cliente != null) {
            System.out.println("Digite o novo email: ");
            String email = sc.nextLine();
            System.out.println("Digite o novo nome: ");
            String nome = sc.nextLine();
            cliente.setEmail(email);
            cliente.setNome(nome);
            cliente = clienteController.update(cliente);
            if (cliente != null) {
                System.out.println("Atualizado com sucesso");
                usuario.setClientes(clienteController.findClientes(usuario.getId()));
            }else {
                System.out.println("Falha ao atualizar");
            }
        } else {
            System.out.println("Usuario não existe no sistema");
        }
    }

    public static void cadastrarVeiculosClientes() {
        listarClientes();

        System.out.println("Digite o id do cliente que você deseja cadastrar: ");
        Long id = sc.nextLong();
        sc.nextLine();

        Cliente cadastrarCliente = clienteController.findById(id);
        if (cadastrarCliente != null) {
            System.out.println("Digite a placa do veículo: ");
            String placa = sc.nextLine();

            System.out.println("Digite a kilometragem do veículo: ");
            String kilometragem = sc.nextLine();

            System.out.println("Digite a data da última troca de óleo (YYYY-MM-DD): ");
            String ultimaTrocaStr = sc.nextLine();
            LocalDate ultimaTroca;
            ultimaTroca = LocalDate.parse(ultimaTrocaStr);

            VeiculosClientes veiculoCliente = new VeiculosClientes(null, placa, kilometragem, ultimaTroca, null, cadastrarCliente);
            veiculoCliente = veiculosClientesController.create(veiculoCliente);

            mostrarCarro();
            System.out.println("Digite o codigo do carro que você deseja adicionar");
            Long idCarro = sc.nextLong();
            VeiculosMotores veiculosMotores = veiculosMotoresController.findById(idCarro);

            if(veiculosMotores != null) {
                VeiculosClientesMotores vc = new VeiculosClientesMotores(null, veiculoCliente, veiculosMotores);
                vc = veiculosClientesMotoresController.create(vc);
            } else {
                System.out.println("Veiculo nao encontrado! ");
            }
        } else {
            System.out.println("Cliente não encontrado! ");
        }
    }

    public static void mostrarCarro(){

        List<VeiculosMotores> veiculos = veiculosMotoresController.findAll();

        for (VeiculosMotores veiculo : veiculos
             ) {
            System.out.println("ID: " + veiculo.getId() + " Nome: " + veiculo.getVeiculo().getMarca() + " Modelo: " +
                    veiculo.getVeiculo().getModelo() + " Ano: " + veiculo.getVeiculo().getAno() +" Motor: " + veiculo.getMotor().getNome() + " Filtro: " +
                    veiculo.getMotor().getFiltro().getModelo() + " OLEO: " + veiculo.getMotor().getOleo().getModelo());
        }
    }

    public static void procurarVeiculoPlaca() {
        System.out.println("Digite uma placa: ");
        String placa = sc.nextLine();

        VeiculosClientesMotores veiculoClienteMotor = veiculosClientesMotoresController.findByPlaca(placa);

        if (veiculoClienteMotor != null) {
            System.out.println("Veículo cliente motor encontrado! " );
            System.out.println("Motor: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getNome());
            System.out.println("Oleo Recomendado: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getOleo().getModelo());
            System.out.println("Filtro Recomendado: " + veiculoClienteMotor.getVeiculosMotores().getMotor().getFiltro().getModelo());
            System.out.println("Ultima troca de oleo: " + veiculoClienteMotor.getVeiculosClientes().getUltimaTroca());
        } else {
            System.out.println("Veículo cliente motor com placa " + placa + " não encontrado.");
        }
    }
}
