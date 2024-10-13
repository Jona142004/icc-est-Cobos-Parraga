import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Metodos ordenador = new Metodos();
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Ingrese el tamanio del arreglo");
        int tam = 0;
        do {
            System.out.print("Ingrese el tamanio del arreglo");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida");
                System.out.println("Ingrese el tamanio del arreglo");
                break;
            }
            tam = scanner.nextInt();
            if (tam <= 0) {
                System.out.println("El tamanio debe ser entero postivo mayor que cero");

            } // 2

        } while (tam <= 0);

        int[] arreglo = new int[tam];

        for (int i = 0; i < tam; i++) {

            arreglo[i] = LeerEnteroValido(scanner, "Elemento" + (i + 1) + ":", false);
        }
        for (int i : arreglo) {
            System.out.print(i + ",");
        }
        scanner.close();
       
    }

    public static int LeerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativos) {
        int numero;
        do {

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida");
                scanner.nextInt();
            }
            numero = scanner.nextInt();
            if (!permitirNegativos && numero < 0) {
                System.out.println(" No se permiten negativos");

            }

        } while (!permitirNegativos && numero < 0);
        return numero;

    }

}
