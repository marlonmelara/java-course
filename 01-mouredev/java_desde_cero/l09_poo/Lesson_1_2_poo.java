package mybasic.l09_poo;

import mybasic.l09_poo.exercises1_poo_class.BasicPerson;

public class Lesson_1_2_poo {
    public static void main(String[] args) {
        System.out.println("Hello");

        var person = new BasicPerson("Charlie", 5);

        person.sayHello();

        // Si usas atributos públicos:
        System.out.println(person.age);
        System.out.println(person.name);

    }
}