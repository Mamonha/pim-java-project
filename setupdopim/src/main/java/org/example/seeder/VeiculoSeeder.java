//package org.example.seeder;
//
//import org.example.model.entities.Veiculo;
//import org.example.model.service.VeiculoService;
//
//public class VeiculoSeeder {
//    private VeiculoService service;
//
//    public VeiculoSeeder(VeiculoService service) {
//        this.service = service;
//    }
//
//    public void seed() {
//        Veiculo teste = new Veiculo();
//
//        teste.setMarca();
//        teste.setAno();
//        teste.setTipo();
//        teste.setModelo();
//        teste.setVeiculosMotores();
//        Veiculo[] veiculos = {
//                new Veiculo("LEVE", "RENAULT", "CLIO", 2008, "1.0 8V L4", 2, 5),
//                new Veiculo("LEVE", "CHEVROLET", "ASTRA", 2001, "2.0 8V MPFI L4", 3, 3),
//                new Veiculo("LEVE", "CHEVROLET", "CORSA", 2010, "1.4 8V MPFI L4", 4, 3),
//                new Veiculo("LEVE", "HONDA", "CIVIC", 2007, "2.0 16V K20 L4", 4, 5),
//                new Veiculo("LEVE", "FORD", "FIESTA", 2010, "2.0 16V L4", 4, 1),
//                new Veiculo("LEVE", "CHEVROLET", "ONIX", 2015, "1.0 8V L4", 6, 3),
//                new Veiculo("UTILITARIO", "VOLKSWAGEN", "SAVEIRO", 2017, "1.6 8V MSI L4", 7, 2),
//                new Veiculo("LEVE", "VOLKSWAGEN", "GOL", 2006, "1.6 8V EA827 L4", 1, 2),
//                new Veiculo("LEVE", "FIAT", "UNO", 2010, "1.0 8V L4", 1, 5),
//                new Veiculo("LEVE", "HYUNDAI", "HB20", 2018, "1.0 12V L3", 4, 5),
//                new Veiculo("LEVE", "CHEVROLET", "CRUZE", 2014, "1.8 16v L4", 4, 7),
//                new Veiculo("LEVE", "PEUGEOT", "206", 2005, "1.6 16v L4", 2, 6),
//                new Veiculo("LEVE", "PEUGEOT", "207", 2012, "1.4 8V L4", 2, 6)
//        };
//
//        for (Veiculo veiculo : veiculos) {
//            service.create(veiculo);
//        }
//    }
//
//    public static void main(String[] args) {
//        VeiculoService service = new VeiculoService();
//        VeiculoSeeder seeder = new VeiculoSeeder(service);
//        seeder.seed();
//
//        System.out.println("Todos os veículos:");
//        for (Object veiculo : service.findAll()) {
//            System.out.println(veiculo);
//        }
//    }
//}
