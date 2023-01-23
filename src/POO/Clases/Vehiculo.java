package POO.Clases;

public class Vehiculo {

    //atributos
    private String nombre;
     private String modelo;
   private String fabricante;

    private double cc;
     private int anio;
    private  boolean sport;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    private int velocidad;
     Motor motor;

    //constructores
    public Vehiculo(){

    }
    public Vehiculo(String nombre, String fabricante, String modelo, double cc, int anio, boolean sport){
        this.nombre = nombre;
        this.modelo=modelo;
        this.fabricante=fabricante;
        this.cc=cc;
        this.anio = anio;
        this.sport= sport;
        this.velocidad=0;

    }


    public Vehiculo(String nombre, String modelo, String fabricante, double cc, int anio, boolean sport, int velocidad, Motor motor) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.anio = anio;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    //metodos
    public void acelerar(int cantidad){

        this.velocidad= cantidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", cc=" + cc +
                ", anio=" + anio +
                ", sport=" + sport +
                ", velocidad=" + velocidad +
                '}';
    }
}
