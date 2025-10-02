package mybasic.l09_poo;

public class Lesson_5_Abstraction_1 {
    public static void main(String[] args) {
        // Demostración de Polimorfismo y Abstracción con Dog
        var dog = new Dog();
        dog.sleep(); // Llama a la versión sobrescrita del metodo.
        dog.sound(); // Llama a la implementación específica de Dog.

        // Demostración con Cat
        var cat = new Cat();
        cat.sleep(); // Llama a la versión heredada de Animal.
        cat.sound();

        // Demostración con Bird, que implementa interfaces.
        var bird = new Bird();
        bird.sound();
        bird.fly(); // Llama a la implementación de la interfaz Flying.

        // Demostración con Bat
        var bat = new Bat();
        bat.sound();
        bat.fly();
    }


    // 1. Clase Abstracta: Define el contrato base para todos los animales.
    public static abstract class Animal {
        // Metodo abstracto: Obliga a las subclases a proporcionar su implementación.
        public abstract void sound();

        // Metodo concreto: Comportamiento por defecto heredado por subclases.
        public void sleep() {
            System.out.println("El animal esta durmiendo");
        }
    }

    // 2. Clases Concretas: Extienden la clase abstracta.
    public static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Guau");
        }

        // Sobreescribe el metodo concreto heredado para un comportamiento específico.
        @Override
        public void sleep() {
            System.out.println("El perro esta durmiendo");
        }
    }

    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Miau");
        }
        // Cat hereda el metodo sleep() por defecto de Animal.
    }

    // 3. Interfaces: Definen capacidades o roles (comportamiento no obligatorio para todos).
    public interface Flying {
        // En una interfaz, todos los métodos son implícitamente public abstract.
        void fly();
    }

    // Interfaz duplicada para demostrar la herencia múltiple de interfaces.
    public interface Flying2 {
        void fly();
    }

    // 4. Implementación Múltiple de Interfaces.
    // Bird hereda de Animal e implementa dos interfaces.
    public static class Bird extends Animal implements Flying, Flying2 {
        @Override
        public void sound() {
            System.out.println("Pio pio");
        }

        @Override
        // Implementación única del metodo 'fly' requerido por Flying y Flying2.
        public void fly() {
            System.out.println("El pajaro vuela");
        }
    }

    public static class Bat extends Animal implements Flying {
        @Override
        public void sound() {
            System.out.println("Soy Batman");
        }

        @Override
        public void fly() {
            System.out.println("El murcielago vuela");
        }
    }
}