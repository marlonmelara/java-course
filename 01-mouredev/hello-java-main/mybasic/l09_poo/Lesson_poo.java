package mybasic.l09_poo;

public class Lesson_poo {
    public static void main(String[] args) {
        System.out.println("Hello");

        var person = new Person("Charlie", 5);

        // person.name = "Charlie";
        // person.age = 8;
        person.sayHello();

        System.out.println(person.age);
        System.out.println(person.name);
    }
}
