package mybasic.l06_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Exercises06_Structures {
    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] students = {"Potter","Ron","Hermione","Ginny","Cedric"};
        System.out.println(students.length); // 5

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes
        // y después de modificarlo.
        System.out.println(students[4]); // Cedric
        students[4] = "Neville";
        System.out.println(students[4]); // Neville

        // 3. Crea un ArrayList vacío.
        ArrayList<String> phoenixOrder = new ArrayList<String>();
        System.out.println(phoenixOrder);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        phoenixOrder.add("Alastor");
        phoenixOrder.add("Remus");
        phoenixOrder.add("Sirius");
        phoenixOrder.add("Tonks");
        System.out.println(phoenixOrder);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> potterFamily = new HashSet<>(Set.of("Lily", "James"));
        System.out.println(potterFamily);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        potterFamily.add("James");
        potterFamily.add("Harry");
        System.out.println(potterFamily);

        // 7. Elimina uno de los elementos del HashSet.
        potterFamily.remove("Harry");
        System.out.println(potterFamily);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de
        // teléfono. Añade tres contactos.
        HashMap<String, Integer> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Hagrid", 55590001);
        phoneNumbers.put("Sirius", 55589002);
        phoneNumbers.put("Luna", 55577710);

        System.out.println(phoneNumbers);

        // 9. Modifica uno de los contactos y elimina otro.
        phoneNumbers.put("Luna", 55577990);
        phoneNumbers.remove("Hagrid");

        System.out.println(phoneNumbers);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.

        // Array original
        String[] names = {"Harry", "Ron", "Hermione", "Harry"}; // incluye duplicado para mostrar comportamiento del Set

        // 10.1 Transformar el array en un ArrayList
        ArrayList<String> namesList = new ArrayList<>();
        for (String name: names){
           namesList.add(name);
       }
        System.out.println("ArrayList: " + namesList);

        // 10.2 Transformar el ArrayList en un HashSet (elimina duplicados)
        HashSet<String> namesSet = new HashSet<>(namesList);
        System.out.println("HashSet (sin duplicados:" + namesSet);

        // 10.3 Transformar el HashSet en un HashMap donde clave = valor
        HashMap<String, String> namesMap = new HashMap<>();
        for (String name: namesSet){
            namesMap.put(name, name);
        }
        System.out.println("HashMap (clave = valor):" + namesMap);

    }
}
