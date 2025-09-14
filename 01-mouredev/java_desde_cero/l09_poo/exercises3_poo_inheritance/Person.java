package mybasic.l09_poo.exercises3_poo_inheritance;

// 2. Define una clase Person con los atributos name y age. Luego crea una clase
// Student que agregue el atributo grade y un metodo study().
public class Person {
    // Attributes
    protected String name;
    protected int age;
    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Methods
    public void sayHello(){
        System.out.println("Hola, mi nombre es " + name);
    }
    // Optional Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
