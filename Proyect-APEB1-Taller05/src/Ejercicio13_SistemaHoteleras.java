import java.util.Scanner;
/**
 * Ejercicio 13: "En una hostería de la ciudad de Loja se hace un descuento del
 * 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 
 * días y del 20% si se hospeda más de 15 días. Elaborar una solución que pida
 * el número de días y el precio diario de la habitación y luego calcule e 
 * imprima el subtotal por pagar, el descuento y el total por pagar."
 * @author Jhoel, Antony
 * @version 1.0
 */
public class Ejercicio13_SistemaHoteleras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int diaHospedaje;
        double precioDiario;
        double subtotal;
        double porcentajeDescuento;
        double valorDescuento;
        double totalPagar;
        System.out.println("Ingrese numero dias de hospedaje: ");
        diaHospedaje = tcl.nextInt();
        System.out.println("Ingrese precio diario de habitación: ");
        precioDiario = tcl.nextDouble();
        subtotal = diaHospedaje * precioDiario;
        if (diaHospedaje > 15) {
            porcentajeDescuento = 0.20;
        } else if (diaHospedaje > 10) {
            porcentajeDescuento = 0.15;
        } else if (diaHospedaje > 5) {
            porcentajeDescuento = 0.10;
        } else {
            porcentajeDescuento = 0.0;
        }
        valorDescuento = subtotal * porcentajeDescuento;
        totalPagar = subtotal - valorDescuento;
        System.out.println("  DETALLE RESERVA HOSTELERA  ");
        System.out.println("Dias de hospedaje: " + diaHospedaje);
        System.out.println("Precio por dia: $" + precioDiario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento (" + (int)(porcentajeDescuento * 100) 
        + "%): $" + valorDescuento);
        System.out.println("TOTAL A PAGAR: $" + totalPagar);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese numero dias de hospedaje: 
12
Ingrese precio diario de habitaci�n: 
35.0
  DETALLE RESERVA HOSTELERA  
Dias de hospedaje: 12
Precio por dia: $35.0
Subtotal: $420.0
Descuento (15%): $63.0
TOTAL A PAGAR: $357.0
BUILD SUCCESSFUL (total time: 9 seconds)
 */     
   