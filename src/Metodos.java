import java.util.Arrays;
import java.util.Scanner;

public class Metodos {
    public static int[] main(String[] args) throws Exception {
        int opcion;
        Scanner scanner = new Scanner(System.in);


    do{
        //mostrar menu
        System.out.println("      Menu Principal      ");
            System.out.println("1. Burbuja");
            System.out.println("2. Insercion");
            System.out.println("3. Seleccion ");       
            System.out.println("4. Brujbuja Avazando");
            System.out.println("0. SALIR ");

            System.out.print("Elige una opcion: ");
        
        opcion = scanner.nextInt();
        switch (opcion) {
                case 1:

    int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    int[] seleccion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    int[] insercion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    int[] sortBumbbleAva(int[] arreglo) {
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

    }while(opcion!=0);
}
}