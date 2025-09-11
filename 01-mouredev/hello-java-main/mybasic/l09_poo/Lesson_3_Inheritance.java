package mybasic.l09_poo;

public class Lesson_Inheritance {
    public static void main(String[] args) {

        // Creación de instancias y demostración de herencia
        var animal = new Animal("Mi animal");
        animal.eat();

        var dog = new Dog("Snoopy", 5);
        dog.eat(); // Llama al método sobrescrito en Dog

        var cat = new Cat("Silvestre");
        cat.eat(); // Hereda el método eat() de Animal

        var bird = new Bird("Woodstock");
        bird.eat(); // Hereda el método eat() de Animal
        bird.fly(); // Método propio de Bird
    }

    // Clase padre - define comportamiento común
    public static class Animal {
        String name;

        public Animal (String name) {
            this.name = name;
        }

        // Método que pueden heredar o sobrescribir las subclases
        public void eat(){
            System.out.println("El animal con nombre " + name + " esta comiendo");
        }
    }

    // Hereda de Animal y sobrescribe eat()
    public static class Dog extends Animal {
        int age; // Atributo adicional específico de Dog

        public Dog(String name, int age) {
            super(name); // Llama al constructor de la clase padre
            this.age = age;
        }

        // Sobrescribe el método eat() con comportamiento específico
        @Override
        public void eat(){
            System.out.println("El perro con nombre " + this.name + " esta comiendo");
        }
    }

    // Hereda de Animal sin modificaciones
    public static class Cat extends Animal {
        public Cat(String name) {
            super(name); // Llama al constructor padre
        }
        // Usa el método eat() heredado sin cambios
    }

    // Hereda de Animal y agrega funcionalidad propia
    public static class Bird extends Animal {
        public Bird(String name) {
            super(name); // Llama al constructor padre
        }

        // Método especifico de Bird
        public void fly(){
            System.out.println(name + " está volando!");
        }
    }
}