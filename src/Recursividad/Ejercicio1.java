import java.math.BigInteger;
import java.util.Scanner;
 
public class Ejercicio1 {
 
    public static void main(String[] args) {
        int numero = leerentero("Ingrese un numero entero: ");
 
        if (numero < 0) {
            System.out.println("El factorial no existe para numeros negativos.");
            return;
        }
 
        System.out.println(numero + "! = " + factorial(numero));
    }
 
    private static int leerentero(String mensaje) {
        Scanner lea = new Scanner(System.in);
        System.out.print(mensaje);
        return lea.nextInt();
    }
 
    private static BigInteger factorial(int Numero) {
        if (Numero <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(Numero).multiply(factorial(Numero - 1));
    }
}
