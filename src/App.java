public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hola soy mateo");
        Metodos ordenador = new Metodos();
        int[] arreglo = { 34, 2, 10, 6, 7, 5, 1, 15 };
        int[] arregloBurbujaOrdenado1 = ordenador.burbujaTradicional(arreglo);
        System.out.println(
        "Resultado arregloBurbuja tradicional Metodo 1 : " +
        java.util.Arrays.toString(arregloBurbujaOrdenado1));
    }
}
