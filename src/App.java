import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Interfaz interfaz = new Interfaz();

        boolean terminarPrograma = false;
        while (!terminarPrograma) {
            terminarPrograma = interfaz.menuPrincipal(scanner);
            // Solo llamar a menuOrdenPrint si no se ha terminado el programa
            if (!terminarPrograma) {
                interfaz.menuOrdenPrint();
            }
        }
        System.out.println("Programa terminado.");
        scanner.close(); // Cerrar el scanner
    }
}
