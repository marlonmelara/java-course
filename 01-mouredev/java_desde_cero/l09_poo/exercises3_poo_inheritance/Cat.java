package mybasic.l09_poo.exercises3_poo_inheritance;

public class Cat extends Animal {
    // Constructor
    public Cat (String name){
        super (name);
    }
    // Metodo específico de Cat
    @Override
    public void makeSound() {
        System.out.println(name + " dice: Meow");
    }
}
