package org.example.view;

import jdk.dynalink.beans.StaticClass;
import org.example.controller.UsuarioController;
import org.example.model.entities.Usuario;

import java.util.Scanner;

import static org.example.view.CarroAsciiArt.bemVindo;
import static org.example.view.CarroAsciiArt.bemVindo;
import static org.example.view.ClientesMenu.clienteMenu;
import static org.example.view.ClientesMenu.mostrarCarro;
import static org.example.view.EstimateValue.show;

public class Main {

    public static Usuario usuario = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioController userController = new UsuarioController();
        bemVindo();
        while(usuario == null) {
            System.out.println("Digite 1 para fazer login ou 2 para cadastrar-se no sistema! ");
            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Digite seu login: ");
                    String login = sc.nextLine();
                    System.out.println("Digite sua senha: ");
                    String senha = sc.nextLine();
                    usuario = userController.login(login, senha);
                    if(usuario == null) {
                        System.out.println("Login ou senha incorretos");
                    }
                    break;
                case 2:
                    System.out.println("Digite seu login para cadastro: ");
                    String cadastrarLogin = sc.nextLine();
                    System.out.println("Digite sua senha para cadastro: ");
                    String cadastrarSenha = sc.nextLine();
                    Usuario criarUsuario = new Usuario(null, cadastrarLogin, cadastrarSenha, null);
                    usuario = userController.create(criarUsuario);
                    if(usuario == null) {
                        System.out.println("Erro ao cadastrar");
                    }
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;
            }


        }


        bemVindo();
        System.out.println("Bem vindo: " + usuario.getLogin());

        boolean mantemLoop = true;
        while (mantemLoop == true) {
        System.out.println("Escolha uma opção abaixo");
        System.out.println("1 - Gerenciar Clientes");
        System.out.println("2 - Orçamento");
        System.out.println("0 - sair");


        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                clienteMenu();
                break;
            case 2:
                show();
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
