import java.util.Arrays;
import java.util.Scanner;

public class Metodos {
    public static int LeerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativos) {
        Interfaz interfaz = new Interfaz();
        System.out.println("Ingrese el tamanio del arreglo");
        int tamanio = interfaz.leerEnteroValido(scanner, "Ingrese el tamanio", false);33
        int [] arreglo = new int[tamanio];
        for(int k = 0; k < tamanio; k++ ){
            arreglo[k] = interfaz.leerEnteroValido(scanner, "Ingrese el valor de la posicion " + (k+1), true);
           
        }
    }

    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public int[] seleccion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int numeromenor = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = numeromenor;
        }
        return arreglo;
    }

    public int[] insercion(int[] arreglo, boolean logs) {
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

    public int[] sortBubbleTeaAva(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
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
}
