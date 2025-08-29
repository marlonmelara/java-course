package mybasic.l01_helloworld;

public class Exercises01_HolaMundo {

    public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!
        System.out.println("Marlon"); // Salida por consola

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo printIn
        System.out.println("Hola"+" "+"Mundo"); // Salida por consola

        // 3. Añade un comentario sobre lo que hace cada línea del programa

        // 4. Crea un comentario en varias líneas

        /*
        * Este es un comentario
        * en varias
        * líneas
        * */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 50," + " " + "Color: azul," + " " + "Ciudad: Santiago");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        /*
        * out, es un objeto de tipo PrintStream
        * */

        // Salida estándar (consola normal)
        System.out.println("Mensaje normal");

        // Salida de error (consola de errores)
        System.err.println("Mensaje de error");

        // System.in es para entrada, no tiene println()
        // pero puedes usarlo para leer datos del usuario

        // 7. Utiliza varios println para imprimir una frase

        System.out.println("Programa iniciado correctamente");
        System.err.println("¡Advertencia: archivo no encontrado!");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos)
        System.out.println(":)");

        // Cara feliz más detallada
        System.out.println("   ☺☺☺☺☺☺☺");
        System.out.println(" ☺         ☺");
        System.out.println("☺   ^   ^   ☺");
        System.out.println("☺     o     ☺");
        System.out.println("☺  \\     /  ☺");
        System.out.println("☺   \\___/   ☺");
        System.out.println(" ☺         ☺");
        System.out.println("   ☺☺☺☺☺☺☺");


    }
}
