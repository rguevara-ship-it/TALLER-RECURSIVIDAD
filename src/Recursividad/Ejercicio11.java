import java.util.Arrays;
import java.util.Scanner;
 
public class Ejercicio11 {
 
    private static final Scanner lea = new Scanner(System.in);
 
    public static void main(String[] args) {
        int filas = leerEntero("Ingrese el numero de filas (m): ");
        int columnas = leerEntero("Ingrese el numero de columnas (n): ");
 
        if (filas <= 0 || columnas <= 0) {
            System.out.println("Las filas y las columnas deben ser mayores que cero.");
            return;
        }
 
        int[][] matriz = leerMatriz(filas, columnas);
        long suma = sumarElementos(matriz, 0, 0);
 
        mostrarMatriz(matriz);
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }
 
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static int[][] leerMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[fila][columna] = leerEntero("Ingrese el elemento [" + fila + "][" + columna + "]: ");
            }
        }
        return matriz;
    }
 
    private static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
 
    private static long sumarElementos(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }
        if (columna == matriz[fila].length) {
            return sumarElementos(matriz, fila + 1, 0);
        }
        return matriz[fila][columna] + sumarElementos(matriz, fila, columna + 1);
    }
}
