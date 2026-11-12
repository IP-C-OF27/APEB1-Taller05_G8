import java.util.Scanner;

/**
 * Ejercicio 02: "Dados tres números distintos, determinar cuál es el mayor."
 * @author Jhoel, Antony
 * @version 1.0
 */

public class Ejercicio03_Mayor3Numeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme 3 num: ");
        int n1 = tcl.nextInt(), n2 = tcl.nextInt(), n3 = tcl.nextInt(), mayor;
        if (n1 > n2)
            mayor = n1;
        else
            mayor = n2;
        if (mayor < n3)
            mayor = n3;
        System.out.println("El mayor es " + mayor);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme 3 num: 
2
3
1
3
BUILD SUCCESSFUL (total time: 6 seconds)
* 
 */
                    

                    
        