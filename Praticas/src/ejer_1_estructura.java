public class ejer_1_estructura {
    public String candena1 = "Pedrito";
    public String candena2  = "Pedrito2";
    public static void main(String[] args) {
        ejer_1_estructura est = new ejer_1_estructura();

        if(est.candena1.equals(est.candena2)) {
            System.out.println("El String son iguales");

        }else {
            System.out.println("El String no son iguales");
        }

    }
}
