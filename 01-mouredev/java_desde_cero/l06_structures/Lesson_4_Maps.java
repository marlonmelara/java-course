package mybasic.l06_structures;

import java.util.HashMap;

public class Lesson_4_Maps {
    public static void main(String[] args) {

        // Declaración de HashSet (dos formas)
        HashMap<String, String> names = new HashMap<>();        // Tipo explícito
        var numbers = new HashMap<Integer,String>();            // Inferencia de tipo

        // Ambos mapas están vacíos al crearse
        System.out.println(names);   // {}
        System.out.println(numbers); // {}

        // Tamaño
        System.out.println(names.size()); // 0
        System.out.println(numbers.size()); // 0

        // Añadir elementos al map (clave-valor)
        names.put("perro", "Snoopy");
        names.put("pajaro", "Woodstock");
        names.put("niño", "Charlie");
        System.out.println(names); // {perro=Snoopy, pajaro=Woodstock, niño=Charlie}

        numbers.put(1, "uno");
        numbers.put(2, "dos");
        numbers.put(3, "tres");
        System.out.println(numbers); // {1=uno, 2=dos, 3=tres}

        // Acceder a los elementos por clave
        System.out.println(names.get("perro"));  // Snoopy
        System.out.println(names.get("Snoopy")); // null (clave no existe)
        System.out.println(names.get("gato"));   // null (clave no existe)
        System.out.println(numbers.get(1));      // uno

        // Modificar elemento por clave (o agregar si no existe)
        names.put("pajaro", "Wilson");          // Reemplaza "Woodstock" con "Wilson"
        System.out.println(names);              // {perro=Snoopy, pajaro=Wilson, niño=Charlie}
        names.replace("pajaro", "Woodstock");   // Reemplaza "Wilson" con "Woodstock"
        System.out.println(names);              // {pajaro=Woodstock, perro=Snoopy, niño=Charlie}
        names.putIfAbsent("otro", "Wilson");    // Añade solo si no existe
        System.out.println(names);              // {pajaro=Woodstock, perro=Snoopy, otro=Wilson, niño=Charlie}

        // Eliminar elemento por clave
        names.remove("pajaro");
        System.out.println(names);              // {perro=Snoopy, otro=Wilson, niño=Charlie}

        // Verificar si contiene una clave
        System.out.println(names.containsKey("pajaro")); // false

        // Verificar si contiene un valor
        System.out.println(names.containsValue("Lucy")); // false
        System.out.println(names.containsValue("Snoopy")); // true
    }
}
