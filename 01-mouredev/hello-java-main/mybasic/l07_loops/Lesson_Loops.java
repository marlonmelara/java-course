package mybasic.l07_loops;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Lesson_Loops {
    public static void main(String[] args) {
        System.out.println("--- Iterar con ciclo for ---");
        // Ciclo For
        for (int i = 0; i < 5; i++){
            System.out.println("¡Hola, Java!");
        }

        System.out.println("--- Iterar con Array con ciclo For ---");
        String[] names = {"Snoopy", "Woodstock", "Charlie"};

        // Recorrer Array con ciclo For
        for (int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("--- Ciclo for con variables de control adicionales ---");
        // Convertido a ciclo for con nuevas variables
        int pointer = 0;
        boolean located = false;

        for (pointer = 0; pointer < names.length && !located; pointer++) {
            System.out.println(names[pointer]);
            if (names[pointer].equals("Woodstock")) {
                located = true;
            }
        }

        System.out.println(located);

        System.out.println("--- Recorrer Array con For Each ---");
        // Recorrer Array con For each
        for (String name: names){
            System.out.println(name);
        }

        System.out.println("--- Recorrer Set con For Each ---");
        // Recorrer Set con For each
        // IMPORTANTE: HashSet NO garantiza orden. Es una estructura basada en tabla hash
        // que prioriza velocidad de búsqueda sobre el orden de inserción.
        // Los elementos pueden aparecer en cualquier orden al iterar.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer num: numbers){
            System.out.println(num);
        }

        System.out.println("--- Recorrer Map con For Each ---");
        // Recorrer Map con For each
        HashMap<String, String> namesPeanuts = new HashMap<>();
        namesPeanuts.put("perro", "Snoopy");
        namesPeanuts.put("pajaro", "Woodstock");
        namesPeanuts.put("niño", "Charlie");
        System.out.println(namesPeanuts);

        System.out.println("--- Recorrer solo las claves del Map ---");
        // Recorre solo las claves
        for (String key : namesPeanuts.keySet()) {  // "key" es más descriptivo
            System.out.println(key); // Muestra: perro, pajaro, niño
        }

        System.out.println("--- Recorrer solo los valores del Map ---");
        // Recorre solo los valores
        for (String value : namesPeanuts.values()) {
            System.out.println(value); // Muestra: Snoopy, Woodstock, Charlie
        }

        System.out.println("--- Recorrer clave y valor con keySet ---");
        // Recorre clave y valor juntos
        for (String key : namesPeanuts.keySet()) {
            System.out.println(key + " = " + namesPeanuts.get(key));
        }

        System.out.println("--- Recorrer clave y valor con entrySet (más eficiente) ---");
        // Más eficiente que keySet() + get()
        for (Map.Entry<String, String> entry : namesPeanuts.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("--- Bucle While básico ---");
        // Bucle While
        int index = 0;
        while (index < 5) {
            System.out.println("¡Hola, Java!");
            index++;
        }

        System.out.println("--- Bucle While con búsqueda ---");
        index = 0;
        boolean find = false;
        while (!find){
            System.out.println(names[index]);
            if (names[index].equals("Woodstock")){
                find = true;
            }
            index++;
        }

        System.out.println(find);

        System.out.println("--- Bucle Do-While ---");
        // Con while (find)
        index = 0;
        find = false;
        do {
            System.out.println(names[index]); // Imprime "Snoopy"
            if (names[index].equals("Woodstock")){
                find = true; // No se ejecuta (no es "Woodstock")
            }
            if (!find) {
                index++; // Se ejecuta, index = 1
            }
        } while (find); // while(false) → TERMINA inmediatamente

        // Control de bucles
        System.out.println("--- Control de bucles con break ---");
        // Break
        for (String name: names){
            if (name.equals("Woodstock")){
                break;
            }
            System.out.println(name);
        }

        for (int i = 0; i < 5 ; i++){
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("--- Control de bucles con continue ---");
        // Continue
        for (String name: names){
            if (name.equals("Woodstock")){
                continue;
            }
            System.out.println(name);
        }

        for (int i = 0; i < 5 ; i++){
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

    }
}