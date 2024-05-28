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
        List<Cliente> clientes = new ArrayList<>();
        Usuario user = new Usuario(null, "asdaw", "awdfawf", clientes);

        usuarioRepository.create(user);

    }
}