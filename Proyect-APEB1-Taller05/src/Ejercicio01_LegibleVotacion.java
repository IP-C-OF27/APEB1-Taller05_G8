import java.util.Scanner;
/**
 * Ejercicio 01: "Determinar si una persona es elegible para votar en función de
 * su edad (mayor o igual a 16 años)."
 * @author Jhoel García, Antony Solano
 * @version 1.0
 */

public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Deme edad");
        edad = tcl.nextInt();
        if (edad >= 16)
            System.out.println("Legible para votas");
        else
            System.out.println("NO legible para votar");
    } 
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Deme edad
21
Legible para votas
BUILD SUCCESSFUL (total time: 3 seconds)
 */