package mybasic.l09_poo.exercises3_poo_inheritance;

public class Dog extends Animal {
    // Constructor
    public Dog (String name){
        super (name);
    }
    // Metodo específico de Dog
    @Override
    public void makeSound(){
        System.out.println(name + " dice: Woof");
    }
}
