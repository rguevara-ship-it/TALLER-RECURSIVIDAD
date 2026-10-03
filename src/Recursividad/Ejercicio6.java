import java.util.Scanner;
 
public class Ejercicio6 {
 
    private static final Scanner lea = new Scanner(System.in);
 
    public static void main(String[] args) {
        int base = leerEntero("Ingrese la base: ");
        int exponente = leerEntero("Ingrese el exponente: ");
 
        if (base == 0 && exponente < 0) {
            System.out.println("No se puede elevar cero a un exponente negativo.");
            return;
        }
 
        System.out.println(base + " elevado a " + exponente + " es: " + calcularPotencia(base, exponente));
    }
 
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        if (exponente < 0) {
            return 1 / calcularPotencia(base, -exponente);
        }
        return base * calcularPotencia(base, exponente - 1);
    }
}
