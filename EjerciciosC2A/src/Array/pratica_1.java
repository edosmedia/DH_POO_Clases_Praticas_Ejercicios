package Array;

import java.lang.reflect.Array;

public class pratica_1 {
    public static void main(String[] args) {
        // Creando un Array con longitud 0, pero con valores a todos igual null
        String[] nombres = new String[3];

        // Asignacion de  Valores
        nombres[0] = "Juan";
        nombres[1] = "Juancito";
        nombres[2] = "Juancho";

        // Distinto tipo Bucle para mostrar el array
        System.out.println("/////////////////////////////////////////");
        System.out.println("   ");

        System.out.println("Ciclo for in");
        for (String nombre : nombres ) {
            System.out.println(nombre);
        }
        System.out.println("   ");
        System.out.println("-----------------------------------------");
        System.out.println("   ");
        System.out.println("Ciclo for contador manipulable");
        for (int i = 0; i < nombres.length ; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("   ");
        System.out.println("-----------------------------------------");
        System.out.println("   ");

        System.out.println("Ciclo while");
        int i = 0;
        while ( i < nombres.length) {
            System.out.println(nombres[i]);
            i++;
        }
    }
}
