import java.util.Scanner;
/**
 * Ejercicio 07: "Asignar una letra (A, B, C, D) a una calificación en función 
 * de su rango (A para 90-100, B para 80-89, etc.)."
 * @author Jhoel, Antony
 * @version 1.0
 */
public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double nota;
        char letra;
        System.out.println("Ingrese la calificacion: ");
        nota = tcl.nextDouble();
        if (nota >= 90 && nota <= 100) {
            letra = 'A';
    } else if (nota >= 80 && nota < 90) {
            letra = 'B';
    } else if (nota >= 70 && nota < 80) {
        letra = 'C';
    } else if (nota >= 60 && nota < 70) {
        letra = 'D';
    } else if (nota >= 0 && nota < 60) {
        letra = 'F';
    } else{
        letra = 'X'; //Fuera de rango
    }
        if (letra != 'X') {
            System.out.println("La calificacion es: " + letra);
        } else {
            System.out.println("Eror: La nota ingresada esta fuera de rango");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la calificacion: 
85.5
La calificacion es: B
BUILD SUCCESSFUL (total time: 4 seconds)
 */
            
        
    
