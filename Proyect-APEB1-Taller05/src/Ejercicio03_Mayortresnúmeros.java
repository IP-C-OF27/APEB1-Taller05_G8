import java.util.Scanner;
/**
 * Ejercicio 03: "Dados tres números distintos, determinar cuál es el mayor."
 * @author Jhoel, Antony
 * @version 1.0
 */

public class Ejercicio03_Mayortresnúmeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double mayor;
        System.out.println("Ingrese los tres números: ");
        num1 = tcl.nextDouble();
        num2 = tcl.nextDouble();
        num3 = tcl.nextDouble();
        if (num1 > num2 && num1 > num3){
            mayor = num1;
        } else if (num2 > num3){
            mayor = num2;
        } else{
            mayor = num3;
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese los tres n�meros: 
5
8
14
El numero mayor es: 14.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */
        
    
   
        
    