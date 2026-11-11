
import java.util.Scanner;

/**
 * Ejercicio 10 : "Dado un valor entero ingresado por teclado (positivo o
 * negativo), determinar si se trata de un valor par o impar."
 *
 * @author Antony Solano Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio10_ValoresParesoImpares {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese numero entero: ");
        numero = tcl.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese numero entero: 
10
El numero 10 es par
 */
