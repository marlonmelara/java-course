package mybasic.l09_poo.exercises3_poo_inheritance;

public class InheritanceExercisesCode {
    public static void main(String[] args) {

        // Crear una instancia de Car
        var car = new Car("Toyota", "Tercel");

        // Usar metodo heredado de Vehicle
        car.move();

        // Usar metodo específico de Car
        car.honk();

        // Acceder a atributos heredados (si tienes getters)
        System.out.println("Marca: " + car.getBrand());
        System.out.println("Modelo: " + car.getModel());
    }
}