package mybasic.l09_poo.exercises1_poo_class;

// 9. Crea varios objetos Person y guárdalos en un ArrayList.
public class BasicPerson {
    // Attributes - PÚBLICOS para acceso desde otros paquetes
    public String name;
    public int age;

    // Constructor
    public BasicPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }
}