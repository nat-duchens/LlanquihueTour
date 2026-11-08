package app;

// Importación de clases del paquete model
import model.Direccion;
import model.Persona;
import model.Empleado;

/** Clase principal que contiene el método main  
 * Instancia objetos de las clases Direccion, Persona y Empleado
 * @author Natalie Duchens
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("AGENCIA DE TURISMO LLANQUIHUE TOUR - REGISTRO DE CONTACTOS Y EMPLEADOS");
        System.out.println("---------------------------------------------------------------------------------");
        
        // Objeto 1: Instancia de Persona --> Cliente/Contacto (composición de Direccion)
        Direccion direccion1 = new Direccion("Av. Longanizas 100", "Llanquihue", "Los Lagos");
        Persona persona1 = new Persona("20.550.444-3", "Natalie Duchens", "+56987654321", direccion1);

        // Objeto 2: Instancia de Empleado --> Empleado de la agencia (herencia de Persona)
        Direccion direccion2 = new Direccion("Calle Lobo de Mar 123", "Puerto Montt", "Los Lagos");
        Empleado empleado1 = new Empleado("12.345.678-9", "Juanito Pérez", "+56987654322", direccion2, "Guía Turístico", 800000);        

        // Objeto 3: Instancia de Empleado --> Empleado de la agencia (herencia de Persona)
        Direccion direccion3 = new Direccion("Calle Ramitas 456", "Puerto Varas", "Los Lagos");
        Empleado empleado2 = new Empleado("98.765.432-1", "María González", "+56987654333", direccion3, "Recepcionista", 600000);   

    // Resultados por consola con  System.out.println() y toString()
        System.out.println("~~ REGISTRO N°1: CONTACTO GENERAL ~~");
        System.out.println(persona1.toString());

        System.out.println("\n~~ REGISTRO N°2: GUÍA TURÍSTICO (EMPLEADO) ~~");
        System.out.println(empleado1.toString());

        System.out.println("\n~~ REGISTRO N°3: RECEPCIONISTA (EMPLEADO) ~~");
        System.out.println(empleado2.toString());

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("¡Prototipo exitoso!");
    }
}