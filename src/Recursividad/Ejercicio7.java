import java.util.Scanner;
 
public class Ejercicio7 {
 
    private static final Scanner lea = new Scanner(System.in);
 
    public static void main(String[] args) {
        int primerNumero = leerEntero("Ingrese el primer numero (M): ");
        int segundoNumero = leerEntero("Ingrese el segundo numero (N): ");
 
        if (primerNumero == 0 && segundoNumero == 0) {
            System.out.println("El MCD no esta definido cuando ambos numeros son cero.");
            return;
        }
 
        long mcd = calcularMcd(Math.abs((long) primerNumero), Math.abs((long) segundoNumero));
        System.out.println("El MCD de " + primerNumero + " y " + segundoNumero + " es: " + mcd);
    }
 
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static long calcularMcd(long m, long n) {
        if (n == 0) {
            return m;
        }
        return calcularMcd(n, m % n);
    }
}
