package tienda_02;
/**
 * Programa que simula una tienda. Solicita el nombre, precio y la cantidad de un producto
 * y lo almacena en 3 arreglos; visualiza el total a pagar.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
import java.util.Scanner;
public class Tienda_02 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
            //Declarar variables.
        String nombre;
        int cantidad;
        float total = 0, costo;
            //Solicitar datos.
            System.out.print("Producto: ");
            nombre = sn.nextLine();
            System.out.print("Costo: ");
            costo = sn.nextFloat();
            System.out.print("Cantídad: ");
            cantidad = sn.nextInt();
            System.out.println();
            total = total + (costo*cantidad);
            //imprimir total
        System.out.print("El total es de: "+total+" pesos.");
        System.err.print("Aqui tienes tu "+nombre);
        System.out.println();        
    }
    
}
