import java.util.Arrays;
import java.util.Scanner;

public class Metodos {
    Metodos metodos = new Metodos();
    public  int menuOrdenPrint (Scanner scanner, boolean ascendente, boolean logs){
        System.out.println("Elija el tipo de orden:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        int tipoOrden = scanner.nextInt();
        System.out.println("Desea imprimir el proceso (logs)?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcionLogs = scanner.nextInt();
        if (tipoOrden == 1) {
            ascendente = true;
        } else if (tipoOrden == 2) {
            ascendente = false;
        } else {
            System.out.println("Opción inválida, se seleccionará el orden ascendente por defecto.");
            ascendente = true;
        }

        System.out.println("Desea imprimir el proceso (logs)?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcionLogs = scanner.nextInt();
        logs = (opcionLogs == 1); 
    }
    
    public int[] burbuja(int[] arreglo, boolean logs, boolean ascendente) {

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            if (logs) {
                System.out.println("Pasada numero" + i);
            }
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    if (logs) {
                        System.out.println("\tResultado intermedio: " + Arrays.toString(arreglo));
                    }
                }
            }
        }
        return arreglo;
    }
    

    public int[] seleccion(int[] arreglo, boolean logs, boolean ascendente) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            
            int indiceMinimo = i;
            if (logs) {
                System.out.println("Pasada numero" + i);
            }
            for (int j = i + 1; j < arreglo.length; j++) {
                
                if (ascendente) {
                    // Orden ascendente
                    if (arreglo[j] < arreglo[indiceMinimo]) {
                        indiceMinimo = j;
                    }
                } else {
                    // Orden descendente
                    if (arreglo[j] > arreglo[indiceMinimo]) {
                        indiceMinimo = j;
                    }

                }
                int numeromenor = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = numeromenor;
                if (logs) {
                    System.out.println("\tResultado intermedio: " + Arrays.toString(arreglo));
                }
            }
        }
        return arreglo;
    }
    public int[] insercion(int[] arreglo, boolean logs, boolean ascendente) {
        int tam = arreglo.length;
        for (int i = 1; i < tam; i++) {
            if (logs) {
                System.out.println("Pasada numero" + i);
            }

            int aux = arreglo[i];
            int j = i - 1;
            if (logs) {
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + arreglo[i] + " [j]=" + arreglo[j]);
            }

            while (j >= 0 && arreglo[j] > aux) {
                if (logs) {
                    System.out.println("\t\tCompramos " + aux + " con " + arreglo[j]);
                }

                arreglo[j + 1] = arreglo[j];
                j = j - 1;
                arreglo[j + 1] = aux;
                if (logs) {
                    System.out.println("\t\t--------" + Arrays.toString(arreglo));
                }

            }
            if (logs) {
                System.out.println("\t--------" + Arrays.toString(arreglo));
            }

        }
        return arreglo;
    }

    public int[] BubbleTeaAva(int[] arreglo, boolean logs, boolean ascendente) {
        
        int n = arreglo.length;
        boolean intercambio = false;

        for (int i = 0; i < n; i++) {
            System.out.println("Pasada" + i);

            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println("j=" + j + "[j]=" + arreglo[j] + "j+1=" + j + 1 + "[j+1]=" + arreglo[j + 1]);
                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("Si hay cambio");
                    // Intercambio
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }
            // Si no hubo ningun intercambio deberia finalizar el codigo si ya esta ordenado
            if (!intercambio) {
                break;
            }
        }
        return arreglo;
    }
    public void printArreglo(int[]arreglo){
        for (int elemento : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
            System.out.print(elemento + ",");
        }
    }
}
