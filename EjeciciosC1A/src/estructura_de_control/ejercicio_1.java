package estructura_de_control;

public class ejercicio_1 {

    public String candena1 = "Pedrito";
    public String candena2  = "Pedrito2";
    public static void main(String[] args) {
        ejercicio_1 est = new ejercicio_1();

        if(est.candena1.equals(est.candena2)) {
            System.out.println("El String son iguales");

        }else {
            System.out.println("El String no son iguales");
        }

    }
}
