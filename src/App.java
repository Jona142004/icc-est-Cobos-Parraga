public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hola soy mateo");
        Metodos ordenador = new Metodos();
        int[] arregloBurbuja = { 34, 2, 10, 6, 7, 5, 1, 15 };
        int[] arregloBurbujaOrdenado1 = ordenador.burbujaTradicional(arregloBurbuja);
        System.out.println(
        "Resultado burbuja tradicional Metodo 1 : " +
        java.util.Arrays.toString(arregloBurbujaOrdenado1));
    }
}
