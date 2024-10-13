import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Interfaz interfaz = new Interfaz();
        System.out.println("Ingrese el tamanio del arreglo");
        int tamanio = interfaz.leerEnteroValido(scanner, "Ingrese el tamanio", false);
        int [] arreglo = new int[tamanio];
        for(int k = 0; k < tamanio; k++ ){
            arreglo[k] = interfaz.leerEnteroValido(scanner, "Ingrese el valor de la posicion " + (k+1), true);
        }
    }
}
