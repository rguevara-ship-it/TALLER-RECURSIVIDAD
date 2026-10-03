import java.util.Arrays;
import java.util.Scanner;
 
public class Ejercicio10 {
 
    private static final Scanner lea = new Scanner(System.in);
 
    public static void main(String[] args) {
        int cantidad = leerEntero("Cuantos valores desea ingresar: ");
 
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }
 
        int[] valores = leerValores(cantidad);
        long suma = sumarElementos(valores, 0);
 
        System.out.println("Vector: " + Arrays.toString(valores));
        System.out.println("La suma de los elementos es: " + suma);
    }
 
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static int[] leerValores(int cantidad) {
        int[] valores = new int[cantidad];
        for (int posicion = 0; posicion < cantidad; posicion++) {
            valores[posicion] = leerEntero("Ingrese el valor " + (posicion + 1) + ": ");
        }
        return valores;
    }
 
    private static long sumarElementos(int[] valores, int posicion) {
        if (posicion == valores.length) {
            return 0;
        }
        return valores[posicion] + sumarElementos(valores, posicion + 1);
    }
}
