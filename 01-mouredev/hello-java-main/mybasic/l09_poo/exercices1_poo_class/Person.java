package mybasic.l09_poo.exercices1_poo_class;

// 9. Crea varios objetos Person y guárdalos en un ArrayList.
public class Person {
    // Attributes
    private String name;
    private int age;
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Methods
    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }
}



