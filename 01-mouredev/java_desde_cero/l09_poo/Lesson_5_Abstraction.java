package mybasic.l09_poo;

/**
 * Clase Abstracta: Sirve como plantilla.
 * Define un comportamiento común (encender) y obliga a las subclases
 * a definir un comportamiento particular (acelerar).
 */
abstract class Vehiculo {

    // Propiedad protegida que será heredada.
    protected String color;

    // Constructor. Las subclases deben llamarlo usando 'super()'.
    public Vehiculo(String color) {
        this.color = color;
    }

    /**
     * Metodo Concreto: Implementación definida en la clase abstracta.
     * Este comportamiento es el mismo para todos los vehículos.
     */
    public void encender() {
        System.out.println("El vehículo " + color + " ha encendido su motor.");
    }

    /**
     * Metodo Abstracto: ¡El núcleo de la abstracción!
     * No tiene cuerpo y fuerza a cualquier subclase no abstracta a implementarlo.
     * La lógica de "cómo" acelerar se deja a la implementación de la subclase.
     */
    public abstract void acelerar();

    // Getter simple.
    public String getColor() {
        return color;
    }
}

/**
 * Clase Concreta: Extiende la clase abstracta y proporciona la implementación.
 * Si no implementa el metodo 'acelerar()', esta clase también debería ser abstracta.
 */
class Automovil extends Vehiculo {

    // Propiedad específica de Automovil.
    private int velocidadMaxima;

    public Automovil(String color, int velocidadMaxima) {
        // Llama al constructor de la superclase (Vehiculo) para inicializar 'color'.
        super(color);
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Implementación obligatoria: Define el 'cómo' para el metodo abstracto 'acelerar'.
     * La anotación @Override es una buena práctica (desde Java 5) para verificar la firma.
     */
    @Override
    public void acelerar() {
        System.out.println("El Automóvil de color " + getColor() + " está acelerando suavemente.");
    }

    // Metodo específico de esta clase concreta.
    public void mostrarVelocidad() {
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h.");
    }
}


public class Lesson_5_Abstraction {
    public static void main(String[] args) {

        // 1. Declaración usando el tipo abstracto (Vehiculo).
        // Esto es Abstracción y Polimorfismo. Solo vemos el contrato de Vehiculo.
        Vehiculo miAuto = new Automovil("Rojo", 220);

        // 2. Se llama al metodo concreto de la clase abstracta.
        miAuto.encender();

        // 3. Se llama al metodo abstracto. La JVM usa la implementación de Automovil.
        miAuto.acelerar();

        // El compilador oculta los detalles de Automovil, como el metodo 'mostrarVelocidad()'.
        // Si intentamos hacer: miAuto.mostrarVelocidad(); // -> ¡Error de compilación!
    }
}