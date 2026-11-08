package model;

/**
 * Class Direccion: representa la dirección de un contacto en Llanquihue Tour
 * Permite implementar la relación de composición entre Direccion y Persona
 * @author Natalie Duchens
 */

public class Direccion {

    // Atributos privados
    private String calle;
    private String ciudad;
    private String region;   

    // Constructor vacío
    public Direccion() {
        this.calle = "Sin Calle";
        this.ciudad = "Sin Ciudad";
        this.region = "Sin Región"; 
    }

    // Constructor con parámetros
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;   
    }   

    // Getters y Setters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // Override 
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region; 
    }   

}