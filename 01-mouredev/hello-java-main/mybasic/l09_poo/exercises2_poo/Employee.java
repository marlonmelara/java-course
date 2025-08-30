package mybasic.l09_poo.exercises2_poo;

// 7. Crea una clase Employee con el atributo privado salary. Agrega el método_
// raiseSalary(double percent) que solo permita aumentos positivos.
public class Employee {
    // Attributes
    private String employeeName;
    private double salary;
    // Constructor
    public Employee (String employeeName, double salary){
        this.setEmployeeName(employeeName);
        this.setSalary(salary);
    }
    // Methods
    // Getters
    public String getEmployeeName(){
        return employeeName;
    }
    public double getSalary(){
        return salary;
    }
    // Setters
    public void setEmployeeName(String employeeName) {
        if (employeeName != null && !employeeName.trim().isEmpty()) {
            this.employeeName = employeeName;
            System.out.println("Nombre de empleado: " + this.employeeName);
        } else {
            System.out.println("El usuario no puede estar vacío");
        }
    }
    public void setSalary(double salary) {
        if (salary > 0){
            this.salary = salary;
            System.out.println("Salario actual: " + this.salary);
        } else {
            System.out.println("El salario tiene que ser mayor a cero");
        }
    }
    // Método_ para aumentar el salario (modifica el salario directamente)
    public void raiseSalary(double percent) {
        if (percent > 0) {
            this.salary = this.salary * (1 + percent / 100);
            System.out.println("Salario actualizado a: " + this.salary);
        } else {
            System.out.println("El porcentaje tiene que ser mayor a cero");
        }
    }

}
