package mybasic.l06_structures;

import java.util.HashSet;

public class Lesson_3_Sets {
    public static void main(String[] args) {

        // Declaración de HashSet (dos formas)
        HashSet<String> names = new HashSet<>();        // Tipo explícito
        var numbers = new HashSet<Integer>();           // Inferencia de tipo

        // Ambos conjuntos están vacíos al crearse
        System.out.println(names);    // []
        System.out.println(numbers);  // []

        // Obtener tamaño del conjunto
        System.out.println(names.size()); // 0

        // Añadir elementos al conjunto - orden no garantizado
        names.add("Snoopy");
        names.add("Woodstock");
        names.add("Charlie");
        System.out.println(names); // [Snoopy, Charlie, Woodstock]

        // Recorrer todos los elementos con for-each
        for (String name : names) {
            System.out.println(name);
        }

        // Verificar si existe un elemento específico
        System.out.println(names.contains("Snoopy")); // true

        // Añadir elementos individuales
        names.add("Lucy");
        names.add("Linus");
        names.add("Linus");  // Solo lo agrega una vez - no permite duplicados
        names.add("Snoopy"); // No lo agrega porque ya existía
        System.out.println(names); // [Snoopy, Charlie, Lucy, Woodstock, Linus]

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers); // [1, 2, 3]

        // Eliminar elemento específico
        names.remove("Lucy");
        System.out.println(names); // [Snoopy, Charlie, Woodstock, Linus]

        // Crear otro conjunto para operaciones
        var otherNames = new HashSet<String>();
        otherNames.add("Lucy");
        otherNames.add("Patty");
        otherNames.add("Sally");
        System.out.println(otherNames); // [Sally, Lucy, Patty]

        // Unir conjuntos (añade elementos únicos)
        names.addAll(otherNames);
        System.out.println(names); // [Snoopy, Sally, Charlie, Lucy, Patty, Woodstock, Linus]

        // Eliminar todos los elementos que están en otherNames
        names.removeAll(otherNames);
        System.out.println(names); // [Snoopy, Charlie, Woodstock, Linus]

    }
}
