package Smart;

public class SmartWatch extends SmartDevice{
    private String malla;


    public SmartWatch() {
    }

    public SmartWatch(int pantalla, int anio, String modelo, String malla) {
        super(pantalla, anio, modelo);
        this.malla=malla;
    }


    public String getMalla() {
        return malla;
    }

    public void setMalla(String malla) {
        this.malla = malla;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "malla='" + malla + '\'' +
                '}';
    }
}
