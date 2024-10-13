import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Interfaz interfaz = new Interfaz();

        /* UNRESOLVED */
        boolean terminarPrograma = false;
        interfaz.menuPrincipal(scanner);

        System.out.println("Programa terminado.");
        scanner.close(); // Cerrar el scanner
    }
}
/*Scanner scanner = new Scanner(System.in);
        boolean exit (terminarPrograma) = false; // Variable para controlar cuando salir del programa

        while (!exit) {
            // Llamar al menú principal
            exit = menuPrincipal(scanner);
        }

        System.out.println("Programa terminado.");
        scanner.close();
    }

    // Método para el Menú Principal
    public static boolean menuPrincipal(Scanner scanner) {
        int opcion;
        boolean salir = false;

        while (true) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Ir al Menú Secundario");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Ir al Menú Secundario
                    salir = menuSecundario(scanner);
                    if (salir) {
                        return true; // Si selecciona salir desde el menú secundario, termina todo
                    }
                    break;
                case 2:
                    // Opción de Salir
                    System.out.println("Saliendo del programa...");
                    return true; // Termina el programa
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    // Método para el Menú Secundario
    public static boolean menuSecundario(Scanner scanner) {
        int opcion;

        while (true) {
            System.out.println("\n--- MENÚ SECUNDARIO ---");
            System.out.println("1. Regresar al Menú Principal");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Regresar al Menú Principal
                    return false; // No salir del programa, solo regresar
                case 2:
                    // Opción de Salir
                    System.out.println("Saliendo del programa...");
                    return true; // Termina todo el programa
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    } */