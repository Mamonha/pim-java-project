package org.example;

import org.example.model.entities.Cliente;
import org.example.model.entities.Usuario;
import org.example.model.repositories.UsuarioRepository;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();

//        List<Cliente> clientes = new ArrayList<>();
//        Usuario user = new Usuario(null, "asdaw", "awdfawf", null);
//        Cliente cliente1 = new Cliente(null, "Jose Borges", "jose@gmail.com", "08897223907", user);
//        Cliente cliente2 = new Cliente(null, "Jose Braga", "braga@gmail.com", "08837223907", user);
//        clientes.add(cliente2);
//        clientes.add(cliente1);
//        user.setClientes(clientes);
//        usuarioRepository.create(user);

        Usuario userLogin = usuarioRepository.login("asdaw", "awdfawf");

        System.out.println(userLogin.toString());
        for (Cliente cliente: userLogin.getClientes() ) {
            System.out.println(cliente.toString());
        }

    }
}