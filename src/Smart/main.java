package Smart;

public class main {

    public static void main(String[] args) {
        SmartDevice telefono = new smarthPhone(760, 2015, "Nokia", "LCD" );

        SmartDevice reloj = new SmartWatch(320, 2022, "Casio", "Goma");


        System.out.println("Los daros del telefono son: " + telefono);
        System.out.println("Los datos del reloj son: " + reloj);

    }
}
