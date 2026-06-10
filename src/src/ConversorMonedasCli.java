import java.util.Scanner;

public class ConversorMonedasCli {

    private ConversorMonedas conversor;
    private Scanner scanner;

    public ConversorMonedasCli() {
        conversor = new ConversorMonedas();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {

        int opcion;

        do {
            System.out.println("\n=== Conversor de Monedas Ficticias ===");
            System.out.println("1. Pesos a dólares");
            System.out.println("2. Dólares a pesos");
            System.out.println("3. Pesos a euros");
            System.out.println("4. Euros a pesos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el valor en pesos: ");
                    double pesos1 = scanner.nextDouble();

                    double dolares = conversor.convertirPesosADolares(pesos1);

                    System.out.printf("%.2f pesos equivalen a %.2f dólares ficticios.%n",
                            pesos1, dolares);
                    break;

                case 2:
                    System.out.print("Ingrese el valor en dólares: ");
                    double dolares2 = scanner.nextDouble();

                    double pesos2 = conversor.convertirDolaresAPesos(dolares2);

                    System.out.printf("%.2f dólares ficticios equivalen a %.2f pesos.%n",
                            dolares2, pesos2);
                    break;

                case 3:
                    System.out.print("Ingrese el valor en pesos: ");
                    double pesos3 = scanner.nextDouble();

                    double euros = conversor.convertirPesosAEuros(pesos3);

                    System.out.printf("%.2f pesos equivalen a %.2f euros ficticios.%n",
                            pesos3, euros);
                    break;

                case 4:
                    System.out.print("Ingrese el valor en euros: ");
                    double euros2 = scanner.nextDouble();

                    double pesos4 = conversor.convertirEurosAPesos(euros2);

                    System.out.printf("%.2f euros ficticios equivalen a %.2f pesos.%n",
                            euros2, pesos4);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}