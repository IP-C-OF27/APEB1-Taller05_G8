
import java.util.Scanner;

/**
 * Ejercicio 06: "Clasificar a una persona en una categoría de edad (niño,
 * adolescente, adulto) en función de su edad."
 *
 * @author Antony Solano Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio06_CategoriadeEdad {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        String categoria;
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad < 0) {
            System.out.println("Error la edad no puede ser menor a 0");
        } else {
            if (edad <= 11) {
                categoria = "Niño";
            } else if (edad <= 17) {
                categoria = "Adolecente";
            } else {
                categoria = "Adulto";
            }
            System.out.println("La categoria es:" + categoria);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese su edad: 
20
La categoria es:Adulto
 */
