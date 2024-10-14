import java.util.Arrays;
import java.util.Scanner;

public class Interfaz {

    private int[] arreglo;
    private final Scanner scanner;
    private boolean logs;
    private boolean ascendente;

    public Interfaz(Scanner scanner) {
        this.scanner = scanner;

    }

    // Ingreso de arreglo
    public int[] ingresoArreglo(int tamanio) {
        int[] arreglo = new int[tamanio];
        for (int k = 0; k < tamanio; k++) {
            arreglo[k] = leerEnteroValido("Ingrese el valor de la posición " + (k + 1), true);
        }
        return arreglo;
    }

    // Imprimir el arreglo
    public void printArreglo(int[] arreglo) {
        System.out.println("El arreglo ingresado es: ");
        for (int elemento : arreglo) {
            System.out.print(elemento + ", ");
        }
        System.out.println();
    }

    // Validar los valores del tamaño y el arreglo
    public int leerEnteroValido(String mensaje, boolean permitirNegativo) {
        int numero;
        do {
            System.out.println(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un entero válido");
                scanner.next();
            }
            numero = scanner.nextInt();
            if (!permitirNegativo && numero <= 0) {
                System.out.println("El tamaño debe ser un entero mayor a 0");
            }
        } while (!permitirNegativo && numero <= 0);
        return numero;
    }

    // Menú principal
    public boolean menuPrincipal() {
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
                primeraOpcion = scanner.nextInt();
                scanner.nextLine();
                switch (primeraOpcion) {
                    case 1:
                        int tamanio = leerEnteroValido("Ingrese el tamaño del arreglo", false);
                        arreglo = ingresoArreglo(tamanio);
                        printArreglo(arreglo);
                        validarOrden = true;
                        break;
                    case 2:
                        if (validarOrden) {
                            menuOrdenamiento();
                        } else {
                            System.out.println("Primero debe ingresar un arreglo.");
                        }
                        break;
                    case 0:
                        fin = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingresa un número.");
                scanner.nextLine();
            }
        }
        return fin;
    }

    // Menú de Ordenamiento
    public void menuOrdenamiento() {
        int segundaOpcion;
        Metodos metodos = new Metodos();
        while (true) {
            System.out.println("MENU DE ORDENAMIENTO");
            System.out.println("(1) Método Burbuja");
            System.out.println("(2) Método Selección");
            System.out.println("(3) Método Inserción");
            System.out.println("(4) Método Burbuja Mejorado");
            System.out.println("(0) Regresar al menú principal");
            System.out.println("Elige una opción: ");

            if (scanner.hasNextInt()) {
                segundaOpcion = scanner.nextInt();
                scanner.nextLine();
                switch (segundaOpcion) {
                    case 1:
                    menuOrdenPrint();
                    int[] copiaBurbuja = Arrays.copyOf(arreglo, arreglo.length);
                    metodos.burbuja(copiaBurbuja, logs, ascendente);
                    metodos.printArreglo(copiaBurbuja);
                        break;
                    case 2:
                    menuOrdenPrint();
                      int[] copiaSeleccion = Arrays.copyOf(arreglo, arreglo.length);
                    metodos.seleccion(copiaSeleccion, logs, ascendente);
                    metodos.printArreglo(copiaSeleccion);
                        break;
                    case 3:
                    menuOrdenPrint();
                    int[] copiaInsercion = Arrays.copyOf(arreglo, arreglo.length);
                    metodos.insercion(copiaInsercion, logs, ascendente);                        
                    metodos.printArreglo(copiaInsercion);
                        break;
                    case 4:
                    menuOrdenPrint();
                    int[] copiaBurbujaMejorada = Arrays.copyOf(arreglo, arreglo.length);
                    metodos.BubbleTeaAva(copiaBurbujaMejorada, logs, ascendente);
                    metodos.printArreglo(copiaBurbujaMejorada);
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingresa un número.");
                scanner.nextLine();
            }
        }
    }
    public void menuOrdenPrint() {
        System.out.println("Elija el tipo de orden:");
        System.out.println("1. Ascendente");
        System.out.println("2. Descendente");
        int tipoOrden = leerEnteroValido("Ingrese el orden deseado ", true);
        while (tipoOrden != 1 && tipoOrden != 2) {
            System.out.println("Opción no válida");
            System.out.println("1. Ascendente");
            System.out.println("2. Descendente");
            tipoOrden = leerEnteroValido("Ingrese el orden deseado ", true);
        }
        ascendente = (tipoOrden == 1);
    
        // Preguntar si desea imprimir los logs
        System.out.println("¿Desea imprimir el proceso (logs)?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        int opcionLogs = leerEnteroValido("Ingrese si desea ver logs ", true);
        while (opcionLogs != 1 && opcionLogs != 2) {
            System.out.println("Opción no válida");
            System.out.println("1. Sí");
            System.out.println("2. No");
            opcionLogs = leerEnteroValido("Ingrese si desea ver logs ", true);
        }
        logs = (opcionLogs == 1);
        System.out.println("Orden: " + (ascendente ? "Ascendente" : "Descendente"));
        System.out.println("Logs: " + (logs ? "Activados" : "Desactivados"));
    }
    
}




