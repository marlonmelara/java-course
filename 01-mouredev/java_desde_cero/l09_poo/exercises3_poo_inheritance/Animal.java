package mybasic.l09_poo.exercises3_poo_inheritance;

// 3. Crea una clase Animal con el metodo makeSound(). Haz que Dog diga "Woof" y
// Cat diga "Meow" sobrescribiendo ese metodo.
public class Animal {
    // Attributes
    protected String name;
    // Constructor
    public Animal(String name){
        this.name = name;
    }
    // Methods
    public void animalName(){
        System.out.println("La mascota se llama " + name);
    }
    public void makeSound(){
        System.out.println(name + " dice: algo");
    }
    // Getters
    public String getName(){
        return name;
    }
}
