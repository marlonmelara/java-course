package mybasic.l09_poo.exercises3_poo_inheritance;

public class Eagle extends Bird {
    //Constructor
    public Eagle (String name){
        super (name);
    }
    // Metodo específico de Eagle
    @Override
    public void fly() {
        super.fly();
        System.out.println("La ave " + this.name + " vuela");
    }
}
