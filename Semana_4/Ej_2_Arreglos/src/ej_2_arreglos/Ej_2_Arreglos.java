package ej_2_arreglos;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Ej_2_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acumulador=0;
        int contador=0;
        Mascota m= new Mascota();     
        Scanner sc= new Scanner(System.in);
        System.out.println("Datos de clientes...");
        System.out.println("Ingrese la cantidad de clientes a registrar: ");
        int cantidad= sc.nextInt();
        Cliente [] c=new Cliente[cantidad];
        
        for (int i = 0; i < c.length; i++) {
            System.out.println("Ingrese el n° de Cliente: ");
            int numero= sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del Cliente: ");
            String nombre= sc.nextLine();
            System.out.println("Ingrese la antiguedad del cliente: ");
            int antiguedad=sc.nextInt();
            sc.nextLine();
            System.out.println("Datos de la Mascota...");
            System.out.println("Ingrese el nombre de la mascota: ");
            m.setNombre(sc.nextLine());
            System.out.println("Ingrese la edad de la mascota: ");
            m.setEdad(sc.nextInt());
            acumulador=+m.getEdad();
            c[i] = new Cliente(numero, antiguedad, m, nombre);            
        }
        //Clientes con antiguedad mayor o igual a 5 añoss
        for (int i = 0; i < c.length; i++) {
            if (c[i] != null && c[i].getAntiguedad()>=5) {
                contador++;
            }
        }
        
        //Muestra de datos
        System.out.println("La cantidad de clientes ingresados: "+ cantidad);
        System.out.println("El promedio de dedad de las mascotas es: "+((double)acumulador/cantidad));
        System.out.println("La cantidad de clientes con antiguedad mayor o igual a 5: "+contador);
    }
    
}
