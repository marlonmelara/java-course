package mybasic.l09_poo.exercises3_poo_inheritance;

public class Lesson_6_Composition {
    public static void main(String[] args) {
        // Composición ("tiene un")
        var car = new Car();
        car.on();
    }

    public static class Engine {
        public void on() {
            System.out.println("Motor encendido");
        }
    }

    public static class Car {
        final private Engine engine = new Engine();
        public void on() {
            engine.on();
        }
    }
}
