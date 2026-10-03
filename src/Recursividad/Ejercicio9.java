import java.util.Scanner;
 
public class Ejercicio9 {
 
    private static final Scanner lea = new Scanner(System.in);
 
    public static void main(String[] args) {
        int multiplicando = leerEntero("Ingrese el primer numero (multiplicando): ");
        int multiplicador = leerEntero("Ingrese el segundo numero (multiplicador): ");
 
        long producto = calcularProducto(Math.abs((long) multiplicando), Math.abs((long) multiplicador));
        if (tienenSignosDistintos(multiplicando, multiplicador)) {
            producto = -producto;
        }
 
        System.out.println(multiplicando + " x " + multiplicador + " = " + producto);
    }
 
    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static long calcularProducto(long multiplicando, long multiplicador) {
        if (multiplicador == 0) {
            return 0;
        }
        return multiplicando + calcularProducto(multiplicando, multiplicador - 1);
    }
 
    private static boolean tienenSignosDistintos(int primerNumero, int segundoNumero) {
        return (primerNumero < 0) != (segundoNumero < 0);
    }
}
