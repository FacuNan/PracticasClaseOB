package POO.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCrud {
   private List<Empleado> empleados = new ArrayList<>();

    //guardar empleado
    public void guardar(Empleado empleado) {
        empleados.add(empleado);

    }

    public List<Empleado>findAll(){
        return empleados;
    }

}
