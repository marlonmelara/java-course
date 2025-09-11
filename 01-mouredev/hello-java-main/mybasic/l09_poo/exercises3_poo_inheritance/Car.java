package mybasic.l09_poo.exercises3_poo_inheritance;

// Hereda de Vehicle - SIN static
public class Car extends Vehicle {

    public Car(String brand, String model) {
        super(brand, model);  // Llama al constructor del padre
    }

    // Método específico de Car
    public void honk() {
        System.out.println("Beep, beep");
    }

    // Opcional: Override del metodo move para ser más específico
    @Override
    public void move() {
        System.out.println("El auto " + brand + " " + model + " está rodando");
    }
}