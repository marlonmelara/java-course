package mybasic.l02_variables;

public class Exercises02_Variables {

    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre
        String name = "Marlon";

        // 2. Crea una variable de tipo int y asígnale tu edad
        int age = 50;

        // 3. Crea una variable double con tu altura en metros
        double height = 1.59;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar
        boolean likeProgramming = true;
        boolean enjoyCoding = true;

        // 5. Declara una constante con tu email
        final String EMAIL = "marlon@mail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial
        char myInitial = 'M';

        /* 7. Declara una variable de tipo String con tu localidad,
         * y a continuación cambia su valor y vuelve a imprimirla
         */
        String city = "San Salvador";  // Declaración inicial
        city = "Santiago";             // Reasignación
        System.out.println(city);      // Output: Santiago

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas
        int a = 7;
        int b = 3;
        System.out.println(a + b); // Output: 10

        // 9. Imprime el tipo de dos variables creadas anteriormente
        System.out.println(a); // Output: 7
        System.out.println(b); // Output: 3

        /* 10. Intenta declarar una variable sin inicializarla y luego
         * asígnale un valor antes de imprimirla
         */
        String country;
        country = "El Salvador";
        System.out.println(country); // Output: El Salvador
    }
}

