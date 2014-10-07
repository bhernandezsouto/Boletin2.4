/*
 Progrmama que pide dos numeros hace su suma su resta multiplicacion y divicion
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author bhernandezsouto
 */
public class Ejercicio4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b;
        Scanner ab = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        a = ab.nextFloat();
        System.out.println("Introduzca el segundo numero");
        b = ab.nextFloat();
        System.out.println("La suma de los numeros es: " + (a+b));
        System.out.println("La resta de los numeros es: " + (a-b));
        System.out.println("La multiplicación de los numeros es: " + (a*b));
        System.out.println("La division de los numeros es: " + (a/b));
    }
    
}
