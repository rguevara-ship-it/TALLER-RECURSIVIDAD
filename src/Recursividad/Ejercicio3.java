import java.util.Scanner;
 
public class Ejercicio3 {
 
    public static void main(String[] args) {
        int numero = leerEntero("Ingrese un numero entero: ");
 
        if (numero <= 0) {
            System.out.println("El numero debe ser mayor que cero.");
            return;
        }
 
        System.out.println("La sumatoria 1 + 1/2 + ... + 1/" + numero + " es: " + calcularSumatoria(numero));
    }
 
    private static int leerEntero(String mensaje) {
        Scanner lea = new Scanner(System.in);
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static double calcularSumatoria(int numero) {
        if (numero == 1) {
            return 1;
        }
        return 1.0 / numero + calcularSumatoria(numero - 1);
    }
}
