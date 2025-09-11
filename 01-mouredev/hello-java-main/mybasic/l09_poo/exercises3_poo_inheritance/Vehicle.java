package mybasic.l09_poo.exercises3_poo_inheritance;

// Clase padre
public class Vehicle {
    // Attributes
    protected String brand;  // protected para que las subclases puedan acceder
    protected String model;

    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Methods
    public void move() {
        System.out.println("El vehículo se mueve");
    }

    // Getters opcionales
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}