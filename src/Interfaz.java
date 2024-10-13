import java.util.Scanner;

public class Interfaz {

    public int leerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativo){
    int numero;
    do{
        System.out.println(mensaje);
        while(!scanner.hasNextInt()){   //hasNextIn devuelve true si y solo si el valor ingresado es un entero positivo
            System.out.println("Ingrese un entero valido");
            System.out.println(mensaje);
            scanner.next();
        }
        numero = scanner.nextInt();
        if(!permitirNegativo && numero < 0 ){
            System.out.println("El tamanio debe ser entero positivo");
        }
    }while(!permitirNegativo && numero < 0);
    return numero;
    }
    public void printArreglo(int[]arreglo){
        for (int i : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
            System.out.print(i + "-");
        }
    

    }
}
