package mybasic.l09_poo.exercices1_poo_class;

// 2. Crea una clase Dog con un método_  bark() que imprima su sonido.
public class Dog {
    // Attributes
    String name;
    // Constructor
    public Dog(String name){
     this.name = name;
    }
    // Methods
    public void bark(){
        System.out.println("¡Guao, guao!");
    }
}
