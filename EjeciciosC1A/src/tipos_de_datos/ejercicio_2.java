package tipos_de_datos;

public class ejercicio_2 {

        //Variables
        public int numeroEntero = 22;
        public double numeroConComa = 2.2;

        public double sumar(double a, double b) {
            //Aca va tu codigo
            double suma = a + b;
            // No modificar esta linea
            return suma;
        }
        public static void main(String[] args) {
            ejercicio_2  main = new ejercicio_2 ();
            double resultado  = main.sumar(main.numeroEntero, main.numeroConComa);

            System.out.println("La Suma es: " + resultado);

        }


}
