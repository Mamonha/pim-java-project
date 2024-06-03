public class CarroAsciiArt {
    public static void main(String[] args) {
        // Desenho ASCII fornecido
        String[] carro = {
                "    _______",
                "   /______/=,",
                "  [     | =, =,,",
                "  [-----+----=,* )",
                "  (_---_____---_)/",
                "    (O)     (O)"
        };

        // Exibir a arte ASCII no console
        for (String linha : carro) {
            System.out.println(linha);
        }
        System.out.println("  ____  _____ __  __  __     _____ _   _ ____   ___       _         ");
        System.out.println(" | __ )| ____|  \\/  | \\ \\   / /_ _| \\ | |  _ \\ / _ \\     / \\        ");
        System.out.println(" |  _ \\|  _| | |\\/| |  \\ \\ / / | ||  \\| | | | | | | |   / _ \\       ");
        System.out.println(" | |_) | |___| |  | |   \\ V /  | || |\\  | |_| | |_| |  / ___ \\      ");
        System.out.println(" |____/|_____|_|__|_|    \\_/  |___|_| \\_|____/ \\___/  /_/   \\_\\___  ");
        System.out.println("  / ___|  / \\  / ___|  / \\    |  _ \\ / _ \\   / _ \\| |   | ____/ _ \\ ");
        System.out.println(" | |     / _ \\ \\___ \\ / _ \\   | | | | | | | | | | | |   |  _|| | | |");
        System.out.println(" | |___ / ___ \\ ___) / ___ \\  | |_| | |_| | | |_| | |___| |__| |_| |");
        System.out.println("  \\____/_/   \\_\\____/_/   \\_\\ |____/ \\___/   \\___/|_____|_____\\___/ ");
    }

}