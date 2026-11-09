
import java.util.Scanner;

/**
 * Ejercicio 12: "Desarrollar una solución que permita leer los datos de un
 * automóvil (marca, origen y costo) imprima el impuesto por pagar y el precio
 * de venta (incluido el impuesto). Si el origen es Alemania el impuesto es 20%,
 * si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%"
 *
 * @author Antony Solano
 * @version 1.0
 */
public class Ejercicio12_CalculodeImpuesto {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String marca;
        int opcion;
        double costo;
        double porcentaje;
        double impuesto;
        double precioVenta;
        System.out.print("Ingrese la marca del automovil: ");
        marca = tcl.next();
        System.out.println("Origen del automovil:");
        System.out.println("1. Alemania");
        System.out.println("2. Japon");
        System.out.println("3. Italia");
        System.out.println("4. USA");
        System.out.print("Elija una opcion: ");
        opcion = tcl.nextInt();
        if (opcion < 1 || opcion > 4) {
            System.out.println("Error: la opcion no es valida");
        } else {
            System.out.print("Ingrese el costo del automovil: $");
            costo = tcl.nextDouble();
            if (opcion == 1) {
                porcentaje = 0.20;
            } else if (opcion == 2) {
                porcentaje = 0.30;
            } else if (opcion == 3) {
                porcentaje = 0.15;
            } else {
                porcentaje = 0.08;
            }
            impuesto = costo * porcentaje;
            precioVenta = costo + impuesto;
            System.out.println("Marca: " + marca);
            System.out.println("Impuesto por pagar: $" + impuesto);
            System.out.println("Precio de venta: $" + precioVenta);
        }
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run-single:
Ingrese la marca del automovil: toyota
Origen del automovil:
1. Alemania
2. Japon
3. Italia
4. USA
Elija una opcion: 4
Ingrese el costo del automovil: $20000
Marca: toyota
Impuesto por pagar: $1600.0
Precio de venta: $21600.0
 */
