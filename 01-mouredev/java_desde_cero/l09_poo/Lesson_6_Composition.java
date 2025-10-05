package mybasic.l09_poo;

public class Lesson_6_Composition {
    public static void main(String[] args) {
      // Composición ("tiene un")
      var car = new Car();
      car.on();
    }

    public static class Engine {
        public void on(){
            System.out.println("Motor a toda marcha");
        }
    }

    public static class Car  {
        final private Engine engine = new Engine();  // Car "tiene un" Engine
        public void on(){
            engine.on(); // Car delega la acción a su Engine
        }
    }
}
