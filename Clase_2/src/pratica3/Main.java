package pratica3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el texto A:");
        String unTextoA = scanner.nextLine();
        System.out.println("Ingresa el texto B:");
        String unTextoB = scanner.nextLine();

        System.out.println("Los textos son distintos? "+cadenasDeTextoDistintas(unTextoA, unTextoB));

    }
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        if(unTextoA.equals(unTextoB)) {
            return false;
        } else {
            return true;
        }
    }

}