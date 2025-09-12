package mybasic.l09_poo.exercises3_poo_inheritance;

public class Student extends Person {

    // Atributo específico de Student
    protected String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);  // Llama al constructor del padre
        this.grade = grade;
    }

    // Metodo específico de Student
    public void study() {
        System.out.println(name + " está estudiando para mejorar su calificación.");
    }

    // Metodo para mostrar la calificación
    public void showGrade() {
        System.out.println(name + " tiene una calificación de " + grade);
    }

    // Getter para grade
    public String getGrade() {
        return grade;
    }

    // Opcional: Sobrescribir sayHello para ser más específico
    @Override
    public void sayHello() {
        System.out.println("Hola, soy " + name + ", tengo " + age + " años y soy estudiante.");
    }
}