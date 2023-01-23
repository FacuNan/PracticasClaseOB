package POO.Clases;

import POO.Herencia.Moto;

public class main {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setNombre("Mercedes Benz");
                Vehiculo coche1 = new Vehiculo("Romeo", "yo", "1998", 2.56, 1999, false);
        System.out.println(coche1);


        Motor motorGTI = new Motor("GtI", 200, 2.6, 4);
        Vehiculo fordFiesta = new Vehiculo("Ford", "yo","Fiesta",2.6,1998, false, 0, motorGTI );


        fordFiesta.acelerar(50);
        System.out.println(fordFiesta.getVelocidad());

        Moto kawasaki = new Moto();

        kawasaki.acelerar(50);

        System.out.println(kawasaki.getVelocidad());

    }

   
}
