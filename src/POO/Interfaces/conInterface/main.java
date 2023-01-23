package POO.Interfaces.conInterface;

import POO.Interfaces.Empleado;

public class main {
    public static void main(String[] args) {
        EmpleadoCrud empleadoCrud = new Oracle();
        Empleado empleado= new Empleado();



        empleadoCrud.guardar(empleado);



    }
}
