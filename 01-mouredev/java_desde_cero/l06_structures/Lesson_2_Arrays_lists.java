package mybasic.l06_structures;

import java.util.ArrayList;

public class Lesson_2_Arrays_lists {
    public static void main(String[] args) {

        // Declaración y creación (dos formas)
        ArrayList<String> names = new ArrayList<String>(); // Tipo explicito
        var numbers = new ArrayList<Integer>();            // Inferencia de tipo

        // Ambas listas están vacías al crearse
        System.out.println(names);   // []
        System.out.println(numbers); // []

        // Tamaño
        System.out.println(names.size()); // 0

        // Añadir elementos al final de la lista
        names.add("Snoopy");
        names.add("Woodstock");
        names.add("Charlie");
        System.out.println(names); // [Snoopy, Woodstock, Charlie]

        // Acceder a los elementos
        System.out.println(names.getFirst()); // Primer elemento: Snoopy
        System.out.println(names.getLast());  // Último elemento: Charlie

        // Modificar elemento en posición específica
        names.set(1, "Lucy");
        System.out.println(names); // [Snoopy, Lucy, Charlie]

        // Eliminar elemento por índice
        names.remove(1);
        System.out.println(names); // [Snoopy, Charlie]

        // Verificar si contiene un elemento
        System.out.println(names.contains("Lucy")); // false

        // Crear una copia superficial del ArrayList
        var copyArray = (ArrayList<String>) names.clone();
        System.out.println(copyArray); // [Snoopy, Charlie]

        // Constructor de copia (más legible)
        var copyArray2 = new ArrayList<>(names);
        System.out.println(copyArray2); // [Snoopy, Charlie]

        // Vaciar toda la lista
        names.clear();
        System.out.println(names); // []
    }
}
