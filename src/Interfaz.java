import java.util.Scanner;

public class Interfaz {


    Scanner scanner = new Scanner(System.in);

    // Ingreso de numeros del arreglo
    public int[] ingresoArreglo(int tamanio){
        int [] arreglo = new int[tamanio];
        for(int k = 0; k < tamanio; k++ ){
            arreglo[k] = leerEnteroValido(scanner, "Ingrese el valor de la posicion " + (k+1), true);
        }
        return arreglo;
    }

    //Imprimir el arreglo
    public void printArreglo(int[] arreglo){
        System.out.println("El arreglo ingresado es: ");
        for(int elemento : arreglo){           //for each 
            System.out.print(elemento + ", ");     // Imprimir arreglo ingresado
        }
    }

    
    //Menu principal
    boolean exit = false;
    public boolean menuPrincipal(Scanner ingreso){
        int primeraOpcion;
        boolean salir = false;
        while(true){
            System.out.println("MENU PRINCIPAL");
            System.out.println("(1) Ingrese su arreglo");
            System.out.println("(2) Ordenar Arreglo");
            System.out.println("(0) Salir");
            System.out.print("Elige una opción: ");

            if (scanner.hasNextInt()) {
                primeraOpcion = scanner.nextInt(); //Ingreso de opcion por consola
                scanner.nextLine();

                switch(primeraOpcion){
                    case 1: {
                        int tamanio = leerEnteroValido(scanner, "Ingrese el tamanio del arreglo", false);
                        int[] arreglo = ingresoArreglo(tamanio);
                        printArreglo(arreglo);
                    }
                }
            }
        }
        return salir;
    }


    //Evitar ingreso de negativos y letras en tamanio, y letras en el arreglo 
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
            if(!permitirNegativo && numero <= 0 ){
                System.out.println("El tamanio debe ser entero mayor a 0");
            }
        }while(!permitirNegativo && numero <= 0);
        return numero;
    }


    /*Scanner scanner = new Scanner(System.in);
        boolean exit = false; // Variable para controlar cuando salir del programa

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

}
