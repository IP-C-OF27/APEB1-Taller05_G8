
import java.util.Scanner;

/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en 
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author Antony Solano, Jhoel Garcia
 * @version 1.0
 */

public class Ejercicio02_diasemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame nro. dia (1 al 7): ");
        int Dia = tcl.nextInt();
        String msjDia;
        switch (Dia) {
            case 1: 
                msjDia = "lunes";
                break;
            case 2:
                msjDia = "martes";
                break;
            case 3:
                msjDia = "miercoles";
                break;
            case 4:
                msjDia = "jueves";
                break;
            case 5:
                msjDia = "viernes";
                break;
            case 6:
                msjDia = "sabado";
                break;
            case 7:
                msjDia = "domingo";
                break;
            default:
                msjDia = "error";
        }
        System.out.println("El numero:" + Dia + "Corresponde a:" + msjDia);
    }
    //AQUÍ AGREGUE TODO SU CÓDIGO...
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */