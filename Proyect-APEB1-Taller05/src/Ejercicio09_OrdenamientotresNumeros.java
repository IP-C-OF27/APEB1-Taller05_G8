import java.util.Scanner;
/**
 * Ejercicio 09: "Dados tres números, ordenarlos en orden ascendente."
 * @author Jhoel, Antony
 * @version 1.0
 */
public class Ejercicio09_OrdenamientotresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double menor, medio, mayor;
        System.out.println("Ingrese los tres números: ");
        num1 = tcl.nextDouble();
        num2 = tcl.nextDouble();
        num3 = tcl.nextDouble();
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3){
            medio = num2;
            mayor = num3;
        } else {
            medio = num3;
            mayor = num2;
        } 
    } else if (num2 <= num1 && num2 <= num3) {
    menor = num2;
    if (num1 <= num3) {
        medio = num1;
        mayor = num3;
    } else {
        medio = num3;
        mayor = num1;
    }
} else {
    menor = num3;
    if (num1 <= num2) {
        medio = num1;
        mayor = num2;
    } else {
        medio = num2;
        mayor = num1;
    }
}
        System.out.println("Los numeros ordenados : " + menor + ", " + medio + 
                ", " + mayor);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese los tres n�meros: 
45
12
28
Los numeros ordenados : 12.0, 28.0, 45.0
BUILD SUCCESSFUL (total time: 18 seconds)
 */

            
        
       