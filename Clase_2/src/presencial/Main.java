package presencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("************Bienvenidos al Sistema  de Ingreso Persona ***************");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese su Nombre: ");
        String nombre  =  scanner.nextLine();
        char  primeraLetra  = obtenerPrimeraLetra (nombre);
        char  ultimaLetra  = obtenerUltimaLetra(nombre);
        System.out.println("Ingrese su Edad: ");
        Integer edad = scanner.nextInt();
        System.out.println("Ingresar altura");
        Double altura = scanner.nextDouble();

        scanner.close();

        System.out.println("Los Datos Ingresados: ");
        System.out.println( nombre + " ,"+edad+" ," + altura);
        System.out.println("Inicial " +  primeraLetra  );
        System.out.println("***********************************************");
        System.out.println("Inicial " +  ultimaLetra  );
        System.out.println("***********************************************");
        System.out.println("¿La Persona es Mayor de Edad?: " + esMayorDeEdad(edad));
    }

    public static char obtenerPrimeraLetra(String nombre) {
    return  nombre.charAt(0);
    }

    public static char obtenerUltimaLetra(String nombre) {
        return  nombre.charAt(nombre.length() -1 );
    }
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}
