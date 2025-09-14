package mybasic.l02_variables;

public class Lesson_VariablesAndConstants {

    public static void main(String[] args) {
        // Variables - pueden cambiar de valor
        String name = "Snoopy";
        System.out.println(name);

        name = "Charlie"; // Reasignación permitida
        System.out.println(name);

        var email = "charlie@mail.com"; // Inferencia de tipo
        System.out.println(email);

        // name = 5; Error: no se puede cambiar el tipo

        int age = 5;
        System.out.println(age);

        // Constantes - valor inmutable
        final String EMAIL = "charlie@peanuts.com";
        // EMAIL = "otro@mail.com"; Error: constante no modificable
        System.out.println(EMAIL);
    }
}