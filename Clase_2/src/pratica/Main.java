package pratica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("************Bienvenidos Es primo o no  ***************");
        System.out.println("Ingrese el numero: ");
        Scanner scanner = new Scanner(System.in);
        Integer numeroDivisible  =  scanner.nextInt();
        System.out.println("¿Es Divisible?: " + esDivisible(numeroDivisible, 2));
    }
    public static boolean esDivisible(int nDivisible, int divisor) {
          return  nDivisible % divisor == 0;
    }
}
