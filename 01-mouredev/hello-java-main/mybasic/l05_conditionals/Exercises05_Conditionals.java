package mybasic.l05_conditionals;

public class Exercises05_Conditionals {
    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18)

        int age = 15;

        if (age >= 18){
            System.out.println("Tienes " + age + " y puedes votar");
        } else {
            System.out.println("No tienes la edad suficiente para votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales
        int a = 50;
        int b = 55;

        if (a > b) {
            System.out.println(String.format("a: %d es mayor que b: %d", a, b));
        } else if (b > a) {
            System.out.println(String.format("b: %d es mayor que a: %d", b, a));
        } else {
            System.out.println(String.format("a y b tienen el mismo valor de: %d", a));
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero
        int number = -10;

        if (number > 0){
            System.out.println(String.format("%d es un número positivo", number));
        } else if (number < 0) {
            System.out.println(String.format("%d es un número negativo", number));
        } else {
            System.out.println(String.format("El número es %d", number));
        }

        // 4. Crea un programa que diga si un número es par o impar
        int number1 = 41;
        if (number1 % 2 == 0){
            System.out.println(String.format("%d es un número par", number1));
        } else {
            System.out.println(String.format("%d es un número impar", number1));
        }

        // 5. Verifica si un número está en el rango de 1 a 100
        int number2 = 0;
        if (number2 >= 1 && number2 < 100){
            System.out.println(String.format("El número %d esta en el rango entre 1 y 100", number2));
        } else {
            System.out.println(String.format("%d esta fuera del rango entre 1 y 100", number2));
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 2;

        switch (day){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            default:
                System.out.println("Es domingo");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100)
        int grade = 91;

        if (grade >= 90) {
            System.out.println(String.format("%d: Sobresaliente", grade));
        } else if (grade >= 60) {
            System.out.println(String.format("%d: Aprobado", grade));
        } else {
            System.out.println(String.format("%d: Suspenso", grade));
        }

        /* 8. Escribe un programa que determine si puedes entrar al cine:
         * debes tener al menos 15 años o ir acompañado
         */
        int ageUser = 14;

        if (ageUser >= 15) {
            System.out.println("Puede entrar al cine");
        } else {
            System.out.println("No puede entrar (necesita ser mayor de 15 años o ir acompañado)");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante
        char letter = 'k';

        switch (Character.toLowerCase(letter)){
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println(String.format("'%c' es una vocal", letter));
                break;
            default:
                System.out.println(String.format("'%c' es una consonante", letter));
        }

        // 10. Usa tres variables x, y, z y muestra cuál es el mayor de las tres
        int x = 200;
        int y = 52;
        int z = 100;

        if ( x >= y &&  x >= z){
            System.out.println(String.format("x: %d es el mayor", x));
        } else if (y >= x && y >= z) {
            System.out.println(String.format("y: %d es el mayor", y));
        } else {
            System.out.println(String.format("z: %d es el mayor", z));
        }
    }
}
