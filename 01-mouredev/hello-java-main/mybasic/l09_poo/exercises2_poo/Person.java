package mybasic.l09_poo.exercises2_poo;

// 1. Crea una clase Person con atributos privados name y age. Usa los métodos
// getName(), setName(), getAge() y setAge() para asignar y mostrar valores
// desde otra clase.
public class Person {
    // Attributes
    private String name;
    private int age;
    // Constructor
    public Person (String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    // Methods
    // Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // Setters
    public void setName (String name){
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("El nombre tiene que ser un texto");
        }
    }
    public void setAge (int age){
        if (age > 0 ) {
            this.age = age;
        } else {
            System.out.println("Edad no valida");
        }
    }
}
