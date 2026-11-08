import java.util.Scanner;
/**
 * Ejercicio 05: "Comprobar si un año ingresado es bisiesto o no. 
 * Si es bisiesto, mostrar un mensaje especial."
 * @author Jhoel, Antony
 * @version 1.0
 */
public class Ejercicio05_Añobisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int anio;
        boolean esBisiesto;
        System.out.println("Ingrese un anio: ");
        anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        } else{
            esBisiesto = false;
        }
        if (esBisiesto) {
            System.out.println("El anio " + anio + "ES BISIESTO");
            System.out.println(" Mensaje especial: Este anio tiene 366 dias");
        } else{
            System.out.println("El anio " + anio + " NO es bisiesto");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un anio: 
2024
El anio 2024ES BISIESTO
 Mensaje especial: Este anio tiene 366 dias
BUILD SUCCESSFUL (total time: 3 seconds)
 */
    
    
    

