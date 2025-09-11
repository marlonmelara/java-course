package mybasic.l09_poo.exercises1_poo_class;

// 4. Crea una clase Car con atributos brand y model y un método_ showData().
public class Car {
    // Attributes
    String brand;
    String model;
    // Constructor
    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    // Methods
    public void showData(){
        System.out.println("Marca: " + brand + " Modelo: " + model);
    }

}
