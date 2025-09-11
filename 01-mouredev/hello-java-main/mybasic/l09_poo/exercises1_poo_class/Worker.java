package mybasic.l09_poo.exercises1_poo_class;
// 8. Crea una clase Worker que reciba nombre y salario, y un método_ para
// mostrar su salario.

public class Worker {
    // Attributes
    String name;
    double salary;
    // Constructor
    public Worker (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    // Methods
    public void showInfoWorker (){
        System.out.println("Nombre del trabajador: " + name + " | " + "Salario: " + salary);
    }
}
