package org.example;

import org.example.controller.ClienteController;
import org.example.controller.UsuarioController;
import org.example.model.entities.Cliente;
import org.example.model.entities.Usuario;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main2 {
    public static void main(String[] args) {

        UsuarioController usuario = new UsuarioController();
        ClienteController cliente = new ClienteController();

        Usuario userLogin = usuario.login("asdaw", "awdfawf");
        System.out.println(userLogin.toString());

        Cliente cliente1 = new Cliente(null, "Mario 453432", "Mario157@2323gmail.com", "8734291023'23", userLogin);

        Cliente clienteCriado = cliente.create(cliente1);

        userLogin.setClientes(cliente.findClientes(userLogin.getId()));

        for (Cliente clnt : userLogin.getClientes()
             ) {
            System.out.println(clnt.toString());
        }

        System.out.println("Alterado");
//        List<Cliente> clientes = new ArrayList<>();
//        Usuario user = new Usuario(null, "asdaw", "awdfawf", null)
//        Cliente cliente1 = new Cliente(null, "Jose Borges", "jose@gmail.com", "08897223907", user);
//        Cliente cliente2 = new Cliente(null, "Jose Braga", "braga@gmail.com", "08837223907", user);
//        clientes.add(cliente2);
//        clientes.add(cliente1);
//        user.setClientes(clientes);
//        usuarioRepository.create(user);



//        Usuario userLogin = usuarioRepository.login("asdaw", "awdfawf");
//        Cliente cliente1 = new Cliente(null, "Jose Virgo", "jose234@gmail.com", "08897253307", userLogin);
//        clienteR.create(cliente1);
//        System.out.println(userLogin.toString());
//        for (Cliente cliente: userLogin.getClientes() ) {
//            System.out.println(cliente.toString());
//        }

    }
}