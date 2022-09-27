
package concadenación;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Concadenación {

    static Scanner ent = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        System.out.println("BIENVENIDO AL FORMULARIO");
        System.out.println("=======================");
        formu();
    }
    public static void formu(){
        String nombre;
        String apellido;
        System.out.print("Introduzca su nombre para empezar:  ");
        nombre = ent.nextLine();
        System.out.print("Introduzca su apellido para acabar:  ");
        apellido = ent.nextLine();
        System.out.println("");
        System.out.println("Su nombre completo es: "+nombre+" "+apellido);
        
    }
}
