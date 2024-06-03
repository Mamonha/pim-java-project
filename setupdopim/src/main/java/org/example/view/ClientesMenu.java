package org.example.view;

import org.example.controller.ClienteController;
import org.example.controller.UsuarioController;
import org.example.model.entities.Cliente;

import java.util.List;
import java.util.Scanner;

import static org.example.view.Main.*;

public class ClientesMenu {

    private static Scanner sc = new Scanner(System.in);
    private static ClienteController clienteController = new ClienteController();


    public static void clienteMenu() {


        Boolean sair = true;
        System.out.println("Quantidade de clientes cadastradas: " + clienteController.findQuantidadeDeClientes(usuario.getId()));

        while (sair) {
            System.out.println("1 - cadastrar um cliente");
            System.out.println("2 - atualizar dados de um cliente");
            System.out.println("3 - Listar Clientes");
            System.out.println("3 - sair");
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
}
