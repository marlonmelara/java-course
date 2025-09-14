package mybasic.l06_structures;

import java.util.Arrays;

public class Lesson_1_Arrays {
    public static void main(String[] args) {
        // Declaración y creación
        int[] numbers = new int[3];
        System.out.println(numbers); // Imprime la referencia de memoría del array
        System.out.println(numbers.length); // Imprime la longitud definida: 3

        String[] names = {"Snoopy", "Woodstock", "Charlie"};
        System.out.println(names); // Imprime la referencia de memoria del array

        // Acceso al array
        System.out.println(numbers[0]); // Imprime el primer elemento del array: 0 (valor por defecto)
        System.out.println(names[0]); // Imprime el primer elemento del array: "Snoopy"
        System.out.println(Arrays.toString(numbers)); // Imprime el contenido completo del array
        System.out.println(Arrays.toString(names)); // Imprime el contenido completo del array

        String[] randomWords = new String[3];
        System.out.println(randomWords[0]); // Imprime: null (valor por defecto para objetos)

        // Modificación
        numbers[0] = 1;   // Asignación de valores a posiciones específicas del array
        numbers[1] = 10;
        // numbers[3] = 20; Daría un error: Index 3 out of bounds for length 3

        // ⚠️ Regla importante: Para un array de tamaño n, los índices válidos van de 0 a n-1.

        // ----------------
        System.out.println(numbers[0]);  // Imprime el segundo elemento: 1
        System.out.println(numbers[1]);

        // Imprime el tercer elemento original: "Charlie"
        System.out.println(names[2]);

        // Modifica el tercer elemento del array
        names[2] = "Linus";
        
        // Imprime el nuevo valor del tercer elemento: "Linus"
        System.out.println(names[2]);

        // ----------------
        // Imprime la longitud del array: 3
        System.out.println(names.length);

        // Asigna null al tercer elemento
        names[2] = null;
        
        // Imprime el tercer elemento: null
        System.out.println(names[2]);

        // Imprime la longitud del array: 3 (no cambia)
        System.out.println(names.length);

        // numbers[2] = null; // ❌ Error: no se puede asignar null a un array de primitivos

         // ----------------
        // Declaración de array de boolean con 5 posiciones
        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]); // Imprime: false
    }

}
