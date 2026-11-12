import java.util.Scanner;
/**
 * Ejercicio 05: "Dados tres números distintos, determinar cuál es el mayor."
 * @author Jhoel, Antony
 * @version 1.0
 */
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        boolean esBisiesto;
        int anio;
        System.out.println("Ingrese el anio: ");
        anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        } else{
            esBisiesto = false;
        }
        if (esBisiesto){
            System.out.println("El anio " + anio + " es BISIESTO.");
            System.out.println("Mensaje: Este anio tiene 366 dias ");
        } else{
            System.out.println("El anio " + anio + " NO es bisiesto.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el anio: 
2024
El anio 2024 es BISIESTO.
Mensaje: Este anio tiene 366 dias 
BUILD SUCCESSFUL (total time: 4 seconds)
* 
 */

        
              
       
                    
        


