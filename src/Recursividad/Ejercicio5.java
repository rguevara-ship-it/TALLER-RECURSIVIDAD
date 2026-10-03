import java.util.Scanner;
 
public class Ejercicio5 {
 
    private static final int BASE_DECIMAL = 10;
    public static void main(String[] args) {
        int numero = leerEntero("Ingrese un numero de mas de una cifra: ");
 
        System.out.println("La suma de los digitos es: " + sumarDigitos(Math.abs((long) numero)));
    }
 
    private static int leerEntero(String mensaje) {
        Scanner leca = new Scanner(System.in);
        System.out.print(mensaje);
        return leca.nextInt();
    }
 
    private static long sumarDigitos(long numero) {
        if (numero == 0) {
            return 0;
        }
        long ultimoDigito = numero % BASE_DECIMAL;
        return ultimoDigito + sumarDigitos(numero / BASE_DECIMAL);
    }
}
