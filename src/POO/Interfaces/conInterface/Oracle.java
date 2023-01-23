package POO.Interfaces.conInterface;

import POO.Interfaces.Empleado;

public class Oracle implements  EmpleadoCrud {
    @Override
    public void guardar(Empleado empleado) {
        System.out.println("Utilizando Oracle" + empleado);
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public void editar(int id) {

    }
}
