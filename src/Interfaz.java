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
        System.out.println();
    }

    //Validar los valores del tamanio y el arreglo
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

    
    //Menu principal
    public boolean menuPrincipal(Scanner ingreso){
        int primeraOpcion;
        boolean fin = false;
        boolean validarOrden = false;
        while (!fin) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("(1) Ingrese su arreglo");
            System.out.println("(2) Ordenar Arreglo");
            System.out.println("(0) Salir");
            System.out.println("Elige una opción: ");

            if (scanner.hasNextInt()) {
                primeraOpcion = scanner.nextInt(); //Ingreso de opcion por consola
                scanner.nextLine();

                switch(primeraOpcion){
                    case 1: {
                        int tamanio = leerEnteroValido(scanner, "Ingrese el tamanio del arreglo", false);
                        int[] arreglo = ingresoArreglo(tamanio);
                        printArreglo(arreglo);
                        validarOrden = true;
                        break;
                    }
                    case 2:{
                        // Ir al menu de Ordenamiento
                        if (validarOrden){
                            menuOrdenamiento(scanner); //menuOrdenamiento devuelve un booleano 
                        } else {
                            System.out.println("Primero debe de ingresar un arreglo");
                        }
                        break;
                    }
                    case 0:{
                        fin = true;
                        break;
                    }
                    default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingresa un número.");                // Si no es un entero, mostrar mensaje de error y limpiar el buffer
                scanner.nextLine(); 
            }
        } 
        return fin;
    }

    // Menu de Ordenamiento
    public boolean menuOrdenamiento(Scanner scanner){
        int segundaOpcion;

        while(true){
            System.out.println("MENU DE ORDENAMIENTO");
            System.out.println("(1) Metodo Burbuja");
            System.out.println("(2) Metodo Seleccion");
            System.out.println("(3) Metodo Insercion");
            System.out.println("(4) Metodo Burbuja Mejorado");
            System.out.println("(0) Regresar al menu principal");
            System.out.println("Elige una opción: ");


            if (scanner.hasNextInt()) { 
                //Validar que no ingrese nada diferente de un entero positivo
                segundaOpcion = scanner.nextInt(); //Ingreso de opcion por consola
                scanner.nextLine();

                switch(segundaOpcion){
                    case 1: {
                        System.out.println("METODO BURBUJA");
                        break;
                    }
                    case 2:{
                        System.out.println("METODO SELECCION");
                        break;
                    }
                    case 3:{
                        System.out.println("METODO INSERCION");
                        break;
                    }
                    case 4:{
                        System.out.println("METODO BURBUJA MEJORADO");
                        break;
                    }
                    case 0:{
                        System.out.println("Regresando al menu principal...");
                        return false;
                    }
                    default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingresa un número."); // Si no es un entero, mostrar mensaje de error y limpiar el buffer
                scanner.nextLine(); 
            }
        }
    }
}
