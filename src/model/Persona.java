package model;
/**
 * Class Persona: representa a cualquier contacto en Llanquihue Tour
 * Permite implementar la relación de composición entre Persona y Direccion
 * @author Natalie Duchens
 */

public class Persona {

    // Atributos privados
    private String rut;
    private String nombre;
    private String telefono;
    private Direccion direccion; // Relación de composición con Direccion

    // Constructor vacío
    public Persona() {
        this.rut = "00000000-0";
        this.nombre = "Sin Nombre";
        this.telefono = "+56900000000";
        this.direccion = new Direccion();
    }

    // Constructor con parámetros
    public Persona
    (String rut, String nombre, String telefono, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getRut() {
        return rut;     
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Override del método toString() para mostrar la información de la persona
    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Teléfono: " + telefono + " | Dirección: [" + direccion.toString() + "]";
    }   

}