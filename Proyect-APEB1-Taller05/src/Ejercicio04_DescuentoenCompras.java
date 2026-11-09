
import java.util.Scanner;

/**
 * Ejercicio 04 : "Descuento en Compras: Calcular el precio final de un producto
 * con un descuento del 10% si el precio original es mayor de $100; de lo
 * contrario, no hay descuento."
 *
 * @author Antony Solano Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio04_DescuentoenCompras {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precioOriginal;
        double descuento;
        double precioFinal;
        System.out.println("Ingrese el precio original del producto:");
        precioOriginal = tcl.nextDouble();
        if (precioOriginal < 0) {
            System.out.println("Error el precio no puede ser negativo");
        } else {
            if (precioOriginal > 100) {
                descuento = precioOriginal * 0.10;
            } else {
                descuento = 0;
            }
            precioFinal = precioOriginal - descuento;
            System.out.println("Precio original: $" + precioOriginal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Precio Final: $" + precioFinal);
        }
    }
    //AQUÍ AGREGUE TODO SU CÓDIGO...
}

/***
 * EVIDENCIA DEL RUN:
Ingrese el precio original del producto
102
Precio original: $102.0
Descuento: $10.200000000000001
Precio Final: $91.8
 * Pegue aquí la evidencia de la ejecución del .java
 */
