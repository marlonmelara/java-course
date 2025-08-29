package mybasic.l09_poo.exercises2_poo;

// 2. Crea una clase Product con el atributo privado price. Añade el método_
// setPrice(double price) que solo permita precios mayores a 0.

public class Product {
    // Properties
    private String name;
    private double price;
    // Constructor
    public Product (String name, double price){
        this.name = name;
        this.setPrice(price);
    }
    // Methods
    // Getters
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    // Setters
    public void setPrice(double price){
        if (price > 0 ) {
            this.price = price;
        } else {
            System.out.println("Precio no valido");
        }
    }
}
