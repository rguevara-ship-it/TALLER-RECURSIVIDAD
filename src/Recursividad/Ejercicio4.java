import java.util.Scanner;
 
public class Ejercicio4 {
 
    private static final int BASE_DECIMAL = 10;
 
    public static void main(String[] args) {
        int numero = leerEntero("Ingrese un numero entero: ");
 
        System.out.println("Numero invertido: " + invertir(numero));
    }
 
    private static int leerEntero(String mensaje) {
        Scanner lea = new Scanner(System.in);
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static long invertir(int numero) {
        if (numero < 0) {
            return -invertirDigitos(-(long) numero, 0);
        }
        return invertirDigitos(numero, 0);
    }
 
    private static long invertirDigitos(long numero, long invertido) {
        if (numero == 0) {
            return invertido;
        }
        long ultimoDigito = numero % BASE_DECIMAL;
        return invertirDigitos(numero / BASE_DECIMAL, invertido * BASE_DECIMAL + ultimoDigito);
    }
}
