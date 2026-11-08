import java.util.Scanner;
/**
 * Ejercicio 11: "Desarrollar una solución que imprima el costo de un pedido de
 * un artículo del cual se tiene la descripción, la cantidad que se requiere y
 * el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un
 * descuento de 15%."
 * @author Jhoel, Antony
 * @version 1.0
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precioUnitario;
        double subtotal;
        double porcentajeDescuento;
        double valorDescuento;
        double totalPagar;
        System.out.println("Ingrese descripción del artículo: ");
        descripcion = tcl.nextLine();
        System.out.println("Ingrese cantidad solicitada: ");
        cantidad = tcl.nextInt();
        System.out.println("Ingrese precio unitario: ");
        precioUnitario = tcl.nextDouble();
        subtotal = cantidad * precioUnitario;
        if (cantidad > 50) {
            porcentajeDescuento = 0.15;
        } else {
            porcentajeDescuento = 0.0;
        }
        valorDescuento = subtotal * porcentajeDescuento;
        totalPagar = subtotal - valorDescuento;
        System.out.println("  RESUMEN PEDIDO  ");
        System.out.println("Artículo: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Sutotal: $" + subtotal);
        System.out.println("Descuento (" + (int)(porcentajeDescuento * 100) + 
                "%): $" + valorDescuento);
        System.out.println("TOTAL A PAGAR: $" + totalPagar);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese descripci�n del art�culo: 
Teclado mecanico
Ingrese cantidad solicitada: 
60
Ingrese precio unitario: 
25.5
  RESUMEN PEDIDO  
Art�culo: Teclado mecanico
Cantidad: 60
Precio Unitario: $25.5
Sutotal: $1530.0
Descuento (15%): $229.5
TOTAL A PAGAR: $1300.5
BUILD SUCCESSFUL (total time: 20 seconds)
 */     
   
    

