package Funciones;

import java.util.Scanner;

public class ejericicio_1 {
    //Este Ejercicio es el del PDF que sale en el playgroung
    int num1;
    int num2;


    public boolean esDivisible (int n, int divisor) {
        if (n % divisor == 0) {
            System.out.println("El numero " + n + " es Divisible con " + divisor);
        }else {
            System.out.println("El numero " + n + " no es Divisible con " + divisor);
        }
        return false;
    }

    public static void main(String[] args) {
        ejericicio_1 ej1 = new ejericicio_1();
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero que desea dividir:");
        ej1.num1 = scanner.nextInt();

        System.out.println("Ingrese el Segundo numero  que sea tu divisor:");
        ej1.num2 = scanner.nextInt();

        ej1.esDivisible(ej1.num1, ej1.num2);


    }

}
