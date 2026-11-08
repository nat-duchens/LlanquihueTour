package model;

/**
 * Class Empleado: representa a un empleado en Llanquihue Tour
 * Herencia: hereda atributos y métodos de la clase Persona
 * @author Natalie Duchens
 */

public class Empleado extends Persona {

    // Atributos privados
    private String cargo;
    private int sueldo;

    // Constructor vacío
    public Empleado() {
        super(); // Llamada al constructor de la clase padre (Persona)
        this.cargo = "Sin Cargo";
        this.sueldo = 0;
    }

    // Constructor con parámetros
    public Empleado(String rut, String nombre, String telefono, Direccion direccion, String cargo, int sueldo) {
        super(rut, nombre, telefono, direccion); // Llama al constructor de la clase Persona
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    // Override del método toString() para mostrar información del empleado
    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo + " | Sueldo: $" + sueldo;
    }
}