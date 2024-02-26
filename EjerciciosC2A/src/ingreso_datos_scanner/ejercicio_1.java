package ingreso_datos_scanner;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        String iniciales;

        System.out.println("Ingresa tu nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingresa tu Apellido: ");
        apellido = scanner.nextLine();
        iniciales = nombre.charAt(0) + "." + apellido.charAt(0);

        System.out.println("Tu nombre y Apellido es: " + nombre + " " + apellido );
    //    System.out.println("Tu Inciales son: " + nombre.charAt(0) + "." + apellido.charAt(0));
        System.out.println("Tu Inciales son: " + iniciales);
    }
}
