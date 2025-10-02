package mybasic.l09_poo.exercises3_poo_inheritance;

// 6. Crea una clase Bird con el metodo fly(). Luego crea Eagle que sobrescriba
// fly() pero también llame al metodo original con super.fly().
public class Bird {
    // Attributes
    protected String name;
    // Constructor
    public Bird (String name) {
        this.name = name;
    }
    // Methods
    public void fly(){
        System.out.println("El ave vuela");
    }
    // Getters
    public String getName(){
        return name;
    }
}
