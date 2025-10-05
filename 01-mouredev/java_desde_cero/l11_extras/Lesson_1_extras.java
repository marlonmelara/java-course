package mybasic.l11_extras;

import mybasic.l09_poo.exercises2_poo_modifiers.Person;

import java.util.Scanner;

public class Lesson_1_extras {
    String globalName = "Linus";

    public static void main(String[] args) {
        // Null
        String name = "Snoopy";
        name = null;
        if (name != null){
            System.out.println(name.toLowerCase());
        }

        // Import
        var charles = new Person("Charles", 6);
        System.out.println(charles.getName());

        // Scanner
        var scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();
        System.out.println("La edad es " + age);

        // Scope
    }
}
