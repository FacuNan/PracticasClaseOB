package Smart;

public class smarthPhone extends SmartDevice{

    private String bateria;



    public smarthPhone() {
    }


    public smarthPhone(int pantalla, int anio, String modelo, String bateria) {
        super(pantalla, anio, modelo);
        this.bateria = bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getBateria() {
        return bateria;
    }

    @Override
    public String toString() {
        return "smarthPhone{" +
                "bateria='" + bateria + '\'' +
                '}';
    }
}
