import java.util.Scanner;
 
public class Ejercicio13 {
 
    private static final Scanner lea = new Scanner(System.in);
 
    public static void main(String[] args) {
        int m = leerEntero("Ingrese el valor de m: ");
        int n = leerEntero("Ingrese el valor de n: ");
 
        if (m < 0 || n < 0) {
            System.out.println("Los valores de m y n deben ser mayores o iguales que cero.");
            return;
        }
 
        System.out.println("Ackermann(" + m + ", " + n + ") = " + calcularAckermann(m, n));
    }
 
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static long calcularAckermann(long m, long n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return calcularAckermann(m - 1, 1);
        }
        return calcularAckermann(m - 1, calcularAckermann(m, n - 1));
    }
}
