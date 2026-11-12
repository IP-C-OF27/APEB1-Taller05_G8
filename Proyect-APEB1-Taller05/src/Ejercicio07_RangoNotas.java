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
        System.out.println("Ingrese la calificacion: ");
        int nota = tcl.nextInt();
        char letra;
        if (nota >= 90 && nota <= 100)
            letra = 'A';
        if (nota >= 80 && nota <= 89)
            letra = 'B';
        if (nota >= 70 && nota <= 79)
            letra = 'C';
        if (nota >= 0 && nota <= 69)
            letra = 'D';
        else
            letra = 'X'; //Fuera del rango
        if (letra != 'X'){
            System.out.println("La calificacion asignada es: " + letra);
        } else{
            System.out.println("La calificacion esta fuera del rango. ");
        }
    }
}

                    
        