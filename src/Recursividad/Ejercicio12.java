import java.util.Scanner;
import java.util.StringJoiner;
 
public class Ejercicio12 {
 
    private static final Scanner lea = new Scanner(System.in);
 
    public static void main(String[] args) {
        int limite = leerEntero("Ingrese el limite de la serie: ");
 
        if (limite < 0) {
            System.out.println("El limite debe ser negativo.");
            return;
        }
 
        System.out.println("Serie de Fibonacci hasta " + limite + ": " + construirSerie(limite));
    }
 
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static String construirSerie(int limite) {
        StringJoiner serie = new StringJoiner(", ");
        for (int posicion = 0; posicion <= limite; posicion++) {
            serie.add(String.valueOf(calcularFibonacci(posicion)));
        }
        return serie.toString();
    }
 
    private static long calcularFibonacci(int posicion) {
        if (posicion <= 1) {
            return posicion;
        }
        return calcularFibonacci(posicion - 1) + calcularFibonacci(posicion - 2);
    }
}
