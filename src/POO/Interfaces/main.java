package POO.Interfaces;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Empleado juancito = new Empleado("Juancito", 42, 2.000, true);
        Empleado Maria = new Empleado("Maria", 45, 2.500, false);
        Empleado roberto= new Empleado("Roberto", 42, 2.000, true);

        EmpleadoCrud empleado = new EmpleadoCrud();
        empleado.guardar(juancito);
        empleado.guardar(roberto);
        empleado.guardar(Maria);

        List<Empleado> empleados = empleado.findAll();
        System.out.println(empleados);


    }


}
