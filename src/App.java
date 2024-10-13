import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Interfaz interfaz = new Interfaz();
        interfaz.menuOrdenPrint();  // Configurar orden y logs
        
        boolean terminarPrograma = false;
        while(!terminarPrograma){
            terminarPrograma = interfaz.menuPrincipal(scanner);
        }
        System.out.println("Programa terminado.");
        scanner.close(); // Cerrar el scanner
    }
}
