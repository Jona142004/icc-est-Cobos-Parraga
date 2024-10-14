import java.util.Arrays;
public class Metodos {
public int[] burbuja(int[] arreglo, boolean logs, boolean ascendente) {
    // Crear una copia del arreglo para no modificar el original
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
        int n = arreglo.length; 
        for (int i = 0; i < n; i++) {
            if (logs) {
                System.out.println("Pasada número " + i);
            }
            for (int j = i + 1; j < n; j++) {
                // Comparar los elementos
                if (ascendente ? (arreglo[i] > arreglo[j]) : (arreglo[i] < arreglo[j])) {
                    // Intercambio de elementos
                    int aux = arreglo[i]; // Usar arreglo para el intercambio
                    arreglo[i] = arreglo[j]; 
                    arreglo[j] = aux;
    
                    if (logs) {
                        System.out.println("Intercambio realizado: " + Arrays.toString(arreglo)); // Imprimir el estado del arreglo copiado
                    }
                }
            }
        }
        return copiaArreglo; // Devolver el arreglo ordenado
    }
        
    // Método selección
    public int[] seleccion(int[] arreglo, boolean logs, boolean ascendente) {
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            if (logs) {
                System.out.println("Pasada número " + i);
            }
            for (int j = i + 1; j < arreglo.length; j++) {
                if ((ascendente && arreglo[j] < arreglo[indiceMinimo]) || (!ascendente && arreglo[j] > arreglo[indiceMinimo])) {
                    indiceMinimo = j;
                }
            }
            int numeromenor = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = numeromenor;
            if (logs) {
                System.out.println("Intercambio realizado: " + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }

    // Método inserción
    public int[] insercion(int[] arreglo, boolean logs, boolean ascendente) {
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);

        int tam = arreglo.length;
        for (int i = 1; i < tam; i++) {
            if (logs) {
                System.out.println("Pasada número " + i);
            }
            int aux = arreglo[i];
            int j = i - 1;
            while (j >= 0 && ((ascendente && arreglo[j] > aux) || (!ascendente && arreglo[j] < aux))) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = aux;
            if (logs) {
                System.out.println("Intercambio realizado: " + Arrays.toString(arreglo));
            }
        }
        return arreglo;
    }
    // Método Burbuja Mejorado
    public int[] BubbleTeaAva(int[] arreglo, boolean logs, boolean ascendente) {
        int[] copiaArreglo = Arrays.copyOf(arreglo, arreglo.length);
        int n = arreglo.length;
        boolean intercambio = false;
        for(int i =0; i < n; i++){
            if(logs){
                System.out.println("Pasada" +i );
            }
            for(int j =0; j < n-1-i; j++){
                if(logs){
                    System.out.println("j="+j+"[j]="+ arreglo[j]+"j+1="+j+1+"[j+1]="+arreglo[j+1]);
                }
                
                if(arreglo[j] > arreglo[j+1])
                if(logs){
                    System.out.println("Si hay cambio");
                }         
                //  Intercambio
                int aux = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo [j+1] = aux;
                intercambio = true;
        }
    
    //Si no hubo ningun intercambio deberia finalizar el codigo si ya esta ordenado
    if (!intercambio){
        break;
    }
    }
    return arreglo;
}
    public void printArreglo(int[] arreglo) {
    System.out.println("Arreglo: " + Arrays.toString(arreglo));
    }
}
