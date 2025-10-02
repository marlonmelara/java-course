package mybasic.l09_poo;

public class Lesson_4_Polymorphism {
    public static void main(String[] args) {
        // --- 1. Polimorfismo por herencia (Sobrescritura - Overriding) ---
        var animal = new Animal ();
        animal.sound(); // Output: Algún sonido
        // Se llama al metodo sobrescrito de la clase derivada
        var dog = new Dog();
        dog.sound();  // Output: Guau

        // --- 2. Polimorfismo Dinámico (o Polimorfismo de Subtipo) ---
        var otroAnimal = new Dog();
        otroAnimal.sound(); // Output: Guau

        // 3. --- 3. Polimorfismo por Sobrecarga (Overloading) ---
        var calculator = new Calculator();
        System.out.println(calculator.sum(1, 2)); // Output: 3
        System.out.println(calculator.sum(1,2,7)); // Output: 10
        System.out.println(calculator.sum(6.1, 3.9)); // Output: 10.0
    }

    public static class Animal {
        public void sound () {
            System.out.println("Algún sonido"); // Comportamiento por defecto
        }
    }

    public static class Dog extends Animal {
        @Override
        // Sobrescribe el metodo 'sound' para un comportamiento especializado
        // Esto es polimorfismo por sobrescritura
        public void sound() {
            //super.sound();
            System.out.println("Guau");  // Comportamiento especializado
        }
    }

    public static class Calculator {
        // Sobrecarga del metodo 'sum' (misma función, diferente firma)
        public int sum (int a, int b){
            return a + b;
        }
        public int sum (int a, int b, int c){
            return a + b +c;
        }
        public double sum (double a, double b){
            return a + b;
        }
    }
}
