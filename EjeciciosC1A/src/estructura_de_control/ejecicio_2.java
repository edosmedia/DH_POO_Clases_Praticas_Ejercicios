package estructura_de_control;

public class ejecicio_2 {
    Integer num1 = 87000;
    Integer num2 = 87000;

    public static void main(String[] args) {
        ejecicio_2 eje_2  = new ejecicio_2();
        if (eje_2.num1.compareTo(eje_2.num2) > 0) {
            System.out.println("El numero mayor es: " + eje_2.num1);
        } else if (eje_2.num1.compareTo(eje_2.num2) < 0) {
            System.out.println("El numero mayor es: " + eje_2.num2);
        } else  {
            System.out.println(eje_2.num1 + " es igual a " + eje_2.num2);
        }
    }

}
