package POO.Interfaces.conInterface;

import POO.Interfaces.Empleado;

public class MySql implements EmpleadoCrud {


    @Override
    public void guardar(Empleado empleado) {
        System.out.println("Guardado utilizando el metodo de mySQL" + empleado);
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public void editar(int id) {

    }
}
