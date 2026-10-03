import java.util.Scanner;
 
public class Ejercicio8 {
 
    private static final Scanner lea = new Scanner(System.in);
     public static void main(String[] args) {
        int dividendo = leerEntero("Ingrese el dividendo: ");
        int divisor = leerEntero("Ingrese el divisor: ");
 
        if (divisor == 0) {
            System.out.println("No se puede dividir entre cero.");
            return;
        }
 
        long cociente = calcularCociente(Math.abs((long) dividendo), Math.abs((long) divisor));
        if (tienenSignosDistintos(dividendo, divisor)) {
            cociente = -cociente;
        }
 
        System.out.println("El cociente de " + dividendo + " / " + divisor + " es: " + cociente);
    }
 
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static long calcularCociente(long dividendo, long divisor) {
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + calcularCociente(dividendo - divisor, divisor);
    }
 
    private static boolean tienenSignosDistintos(int primerNumero, int segundoNumero) {
        return (primerNumero < 0) != (segundoNumero < 0);
    }
}
