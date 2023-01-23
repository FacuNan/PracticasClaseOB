package Smart;

public abstract class SmartDevice {

    private int pantalla;
    private int anio;
    private String modelo;

    public SmartDevice() {
    }

    public SmartDevice(int pantalla, int anio, String modelo) {
        this.pantalla = pantalla;
        this.anio = anio;
        this.modelo = modelo;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
