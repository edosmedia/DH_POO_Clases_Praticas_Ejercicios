package pratica2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido para saber quien es mayor de los tres numero selecionados");
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        Integer numero1 = numeros.nextInt();
        System.out.println("Ingrese el numero 2: ");
        Integer numero2 = numeros.nextInt();
        System.out.println("Ingrese el numero 3: ");
        Integer numero3 = numeros.nextInt();
        numeros.close();
        System.out.println("El numero de Mayor es: " + maximoEntreTresNumeros(numero1, numero2, numero3) );

    }
    public static Integer maximoEntreTresNumeros(Integer n1, Integer n2, Integer n3) {
        Integer maximo = n1;
        if (n2 > maximo) {
            maximo = n2;
        }
        if (n3 > maximo) {
            maximo = n2;
        }
        return maximo;
    }
}
