package org.example.seeder;

import org.example.controller.ClienteController;
import org.example.controller.MotorController;
import org.example.controller.VeiculoController;
import org.example.controller.VeiculosMotoresController;
import org.example.model.entities.Cliente;
import org.example.model.entities.Veiculo;
import org.example.model.entities.VeiculosMotores;

public class VeiculoMotorSeeder {

    public static void veiculoMotor() {
        MotorController motorController = new MotorController();
        VeiculoController veiculoController = new VeiculoController();
        VeiculosMotoresController veiculosMotoresController = new VeiculosMotoresController();

        //add clio
        VeiculosMotores v1 = new VeiculosMotores(null, veiculoController.findById(1L), motorController.findById(1L), null);
        veiculosMotoresController.create(v1);
        //add clio
        VeiculosMotores v2 = new VeiculosMotores(null, veiculoController.findById(1L), motorController.findById(12L), null);
        veiculosMotoresController.create(v2);
        //add clio
        VeiculosMotores v3 = new VeiculosMotores(null, veiculoController.findById(1L), motorController.findById(13L), null);
        veiculosMotoresController.create(v3);
        //add Astra
        VeiculosMotores v4 = new VeiculosMotores(null, veiculoController.findById(2L), motorController.findById(2L), null);
        veiculosMotoresController.create(v4);
        //add Corsa
        VeiculosMotores v5 = new VeiculosMotores(null, veiculoController.findById(3L), motorController.findById(3L), null);
        veiculosMotoresController.create(v5);
        //add Corsa
        VeiculosMotores v6 = new VeiculosMotores(null, veiculoController.findById(3L), motorController.findById(6L), null);
        veiculosMotoresController.create(v6);
        //add civic
        VeiculosMotores v7 = new VeiculosMotores(null, veiculoController.findById(4L), motorController.findById(4L), null);
        veiculosMotoresController.create(v7);

        //add fiesta
        VeiculosMotores v8 = new VeiculosMotores(null, veiculoController.findById(5L), motorController.findById(5L), null);
        veiculosMotoresController.create(v8);

        //onix
        VeiculosMotores v9 = new VeiculosMotores(null, veiculoController.findById(6L), motorController.findById(6L), null);
        veiculosMotoresController.create(v9);

        VeiculosMotores v10 = new VeiculosMotores(null, veiculoController.findById(6L), motorController.findById(3L), null);
        veiculosMotoresController.create(v10);

        //saveiro
        VeiculosMotores v11 = new VeiculosMotores(null, veiculoController.findById(7L), motorController.findById(7L), null);
        veiculosMotoresController.create(v11);

        VeiculosMotores v12 = new VeiculosMotores(null, veiculoController.findById(7L), motorController.findById(8L), null);
        veiculosMotoresController.create(v12);

        //gol
        VeiculosMotores v13 = new VeiculosMotores(null, veiculoController.findById(8L), motorController.findById(7L), null);
        veiculosMotoresController.create(v13);

        VeiculosMotores v14 = new VeiculosMotores(null, veiculoController.findById(8L), motorController.findById(8L), null);
        veiculosMotoresController.create(v14);

        //uno
        VeiculosMotores v15 = new VeiculosMotores(null, veiculoController.findById(9L), motorController.findById(9L), null);
        veiculosMotoresController.create(v15);

        //hb20
        VeiculosMotores v16 = new VeiculosMotores(null, veiculoController.findById(10L), motorController.findById(10L), null);
        veiculosMotoresController.create(v16);

        //cruze
        VeiculosMotores v17 = new VeiculosMotores(null, veiculoController.findById(11L), motorController.findById(11L), null);
        veiculosMotoresController.create(v17);

        //mamonha 206
        VeiculosMotores v18 = new VeiculosMotores(null, veiculoController.findById(12L), motorController.findById(12L), null);
        veiculosMotoresController.create(v18);

        //mamonha 207
        VeiculosMotores v19 = new VeiculosMotores(null, veiculoController.findById(13L), motorController.findById(13L), null);
        veiculosMotoresController.create(v19);
    }

    public static void main(String[] args) {
        veiculoMotor();
    }
}
