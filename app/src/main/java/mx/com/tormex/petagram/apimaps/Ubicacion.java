package mx.com.tormex.petagram.apimaps;

/**
 * Created by Sistemas on 25/07/2017.
 */

public class Ubicacion {
    private int imagen;
    private String Nombre;
    private double lat;
    private double lon;

    public Ubicacion(){ }

    public Ubicacion (int imagen, String nombre, double lat, double lon) {
        this.imagen = imagen;
        this.Nombre = nombre;
        this.lat = lat;
        this.lon = lon;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}