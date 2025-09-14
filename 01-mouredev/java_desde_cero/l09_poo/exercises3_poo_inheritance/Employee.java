package mybasic.l09_poo.exercises3_poo_inheritance;

// 4. La clase Employee tiene los atributos name y salary. Manager hereda de
// Employee y agrega el atributo department.
public class Employee {
    // Attributes
    protected String name;
    protected double salary;
    // Constructor
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    // Methods
    public void infoSalary(){
        System.out.println("Nombre: " + name + " | Salario: " + salary);
    }
    // Optional Getters
}
