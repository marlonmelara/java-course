package mybasic.l09_poo.exercises3_poo_inheritance;

public class InheritanceExercisesCode {
    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 1: Car ===");

        // Crear una instancia de Car
        var car = new Car("Toyota", "Tercel");
        // Usar metodo heredado de Vehicle
        car.move();
        // Usar metodo específico de Car
        car.honk();
        // Acceder a atributos heredados
        System.out.println("Marca: " + car.getBrand());
        System.out.println("Modelo: " + car.getModel());

        System.out.println("\n=== EJERCICIO 2: Student ===");

        // Crear una instancia de Student
        var student = new Student("Charlie", 16, "A+");

        // Usar metodo heredado de Person (pero personalizado en Student)
        student.sayHello();

        // Usar métodos específicos de Student
        student.study();
        student.showGrade();

        // Usar getters
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad: " + student.getAge());
        System.out.println("Calificación: " + student.getGrade());

        System.out.println("\n=== EJERCICIO 3: Dog & Cat ===");

        var dog = new Dog("Snoopy");
        var cat = new Cat("Garfield");

        // Usar getters de la clase padre Animal
        dog.animalName();
        cat.animalName();

        // Usar metodos específicos de dog y cat
        dog.makeSound();
        cat.makeSound();

        System.out.println("\n=== EJERCICIO 4: Manager ===");

        var manager = new Manager("John", 2500.00, "Marketing");

        manager.infoSalary();
        manager.introduce();
        System.out.println("Departamento: " + manager.getDepartment());

        System.out.println("\n=== EJERCICIO 5: Circle & Rectangle ===");

        Circle circle = new Circle(5.0);
        System.out.println("Área del cálculo: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
    }
}