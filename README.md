# Llanquihue Tour - Sistema Orientado a Objetos

## Descripción

Prototipo en Java que representa a las personas vinculadas a la agencia de turismo
Llanquihue Tour (Región de Los Lagos). Su propósito es reemplazar la gestión manual
de contactos por un modelo de clases estructurado, aplicando encapsulamiento,
composición y herencia.

## Estructura del proyecto

```
LlanquihueTour/
└── src/
    ├── app/
    │   └── Main.java
    └── model/
        ├── Persona.java
        ├── Direccion.java
        └── Empleado.java
```

## Clases implementadas

| Paquete | Clase | Descripción |
|---|---|---|
| `model` | `Persona` | Clase base. Contiene rut, nombre, teléfono y una `Direccion`. |
| `model` | `Direccion` | Calle, ciudad y región. Se usa por composición dentro de `Persona`. |
| `model` | `Empleado` | Hereda de `Persona` y agrega cargo y sueldo. |
| `app` | `Main` | Crea 3 objetos y muestra sus datos por consola con `toString()`. |

## Relaciones entre clases

- **Composición:** `Persona` tiene un atributo de tipo `Direccion`.
- **Herencia:** `Empleado` extiende `Persona`.

## Cómo compilar y ejecutar

Desde la carpeta raíz del proyecto:

```
javac -d out src/model/*.java src/app/*.java
java -cp out app.Main
```

Requiere tener instalado JDK 17 o superior.

## Autora

Natalie Duchens - Desarrollo Orientado a Objetos, Duoc UC