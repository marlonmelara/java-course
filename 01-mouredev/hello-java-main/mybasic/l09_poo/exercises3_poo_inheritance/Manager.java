package mybasic.l09_poo.exercises3_poo_inheritance;

public class Manager extends Employee{
    protected String department;

    public Manager (String name, double salary, String department){
        super(name,salary);
        this.department = department;
    }

    public void introduce() {
        System.out.println("Hola soy " + name + " y trabajo en el departamento de " + department);
    }

    // Optional Getter
    public String getDepartment() {
        return department;
    }
}

