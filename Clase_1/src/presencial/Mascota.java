package presencial;

public class Mascota {
     String Nombre;
     int Edad;
     String Peso;
     String Sonido;

     public Mascota (String nombre, int edad, String peso,  String sonido){
         this.Nombre = nombre;
         this.Edad = edad;
         this.Peso  = peso;
         this.Sonido =  sonido;
     }


    public static void main(String[] args) {
         Mascota mascota1 = new Mascota("Manchitas", 2, "1.5 Kg", "Guau");
        Mascota mascota2 = new Mascota("Nemo", 1, "140 gr", "bublu");
        Mascota mascota3 = new Mascota("Silvetre", 3, "1.5 Kg", "miau");
        Mascota mascota4 = new Mascota("Manuelita", 12, "300 gr", "gogor");
        Mascota mascota5 = new Mascota("Gardel", 1, "350 gr", "kikiu");

        System.out.println("Mi nombre es: " + mascota1.Nombre + " mi edad es: " + mascota1.Edad + " Peso: " + mascota1.Peso + " Mi sonido distintivo es " + mascota1.Sonido );
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mi nombre es: " + mascota2.Nombre + " mi edad es: " + mascota2.Edad + " Peso: " + mascota2.Peso + " Mi sonido distintivo es " + mascota2.Sonido );
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mi nombre es: " + mascota3.Nombre + " mi edad es: " + mascota3.Edad + " Peso: " + mascota3.Peso + " Mi sonido distintivo es " + mascota3.Sonido );
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mi nombre es: " + mascota4.Nombre + " mi edad es: " + mascota4.Edad + " Peso: " + mascota4.Peso + " Mi sonido distintivo es " + mascota4.Sonido );
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Mi nombre es: " + mascota5.Nombre + " mi edad es: " + mascota5.Edad + " Peso: " + mascota5.Peso + " Mi sonido distintivo es " + mascota5.Sonido );
    }
}

