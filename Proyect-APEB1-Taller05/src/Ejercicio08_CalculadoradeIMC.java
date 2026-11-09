
import java.util.Scanner;

/**
 * Ejercicio 08: "Calculadora de IMC: Calcular el índice de masa corporal (IMC)
 * de una persona y clasificarla en función de su valor (bajo peso, peso normal,
 * sobrepeso, etc.)."
 *
 * @author Antony Solao Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio08_CalculadoradeIMC {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double peso;
        double estatura;
        double imc;
        String categoria;
        System.out.println("Ingrese peso en kg: ");
        peso = tcl.nextDouble();
        System.out.println("Ingrese estatura en metros: ");
        estatura = tcl.nextDouble();
        if (peso <= 0 || estatura <= 0) {
            System.out.println("Error el peso y la estatura son mayores a 0");
        } else {
            imc = peso / (estatura * estatura);
            if (imc < 18.5) {
                categoria = "bajo peso";
            } else if (imc < 25) {
                categoria = "peso normal";
            } else if (imc < 30) {
                categoria = "sobre peso";
            } else {
                categoria = "obesidad";
            }
            System.out.printf("Su IMC es: %.2f%n ", imc);
            System.out.println("Categoria:" + categoria);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese peso en kg: 
50
Ingrese estatura en metros: 
1,75
Su IMC es: 16,33
Categoria:bajo peso
 */
