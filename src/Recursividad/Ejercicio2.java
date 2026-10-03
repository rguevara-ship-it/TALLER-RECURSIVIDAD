import java.util.Scanner;
 
public class Ejercicio2 {
 
    public static void main(String[] args) {
        int numero = leerEntero("Ingrese un numero entero: ");
 
        if (numero < 0) {
            System.out.println("La sumatoria no existe para numeros negativos.");
            return;
        }
 
        System.out.println("La sumatoria de 1 hasta " + numero + " es: " + calcularSumatoria(numero));
    }
 
    private static int leerEntero(String mensaje) {
        Scanner lea = new Scanner(System.in);
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static long calcularSumatoria(int numero) {
        if (numero == 0) {
            return 0;
        }
        return numero + calcularSumatoria(numero - 1);
    }
}
