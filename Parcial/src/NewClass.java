
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double iva = 15, subtotal = 0, lavado = 0, desc = 0, montoIva = 0;      
        System.out.println("Deme $Rep, $mano, antiguedad: ");
        int costoRep = tcl.nextInt();
        int costoMano = tcl.nextInt();
        int antiguedad = tcl.nextInt();
        subtotal = costoRep + costoMano;
        montoIva = subtotal * (iva / 100);
        if (antiguedad > 10) {
            desc = 12;
        } else{
            desc = 5;
        }
        if (subtotal > 300) {
            lavado = 0;     
        } else{
            lavado = 15;
        }
        double Total = subtotal + montoIva - desc + lavado;
        System.out.println("----FACTURA TALLER----");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA: $" + montoIva);
        System.out.println("Descuento: " + desc);
        System.out.println("Lavado: $" + lavado);
        System.out.println("TOTAL A PAGAR: $" + Total);
    }
}
