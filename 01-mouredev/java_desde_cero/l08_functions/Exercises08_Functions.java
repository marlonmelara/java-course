package mybasic.l08_functions;

public class Exercises08_Functions {

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!"
    public static void greet() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona
    public static void sayHello(String name){
       System.out.println("Hola, " + name);
   }

    // 3. Haz una función que reciba dos números enteros y devuelva su resta
    public static void minus (int a, int b){
        int result = a - b;
        System.out.println(result);
    }

    // 4. Crea una función que calcule el cuadrado de un número (n * n)
    public static int calculateSquare (int number){
        int resultExp =number * number;
        return resultExp;
    }

    public static void main(String[] args) {
        greet();
        sayHello("Snoopy");
        minus(10, 7);
        calculateSquare (3);
    }
}
