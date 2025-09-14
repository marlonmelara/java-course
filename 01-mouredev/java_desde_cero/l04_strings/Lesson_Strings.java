package mybasic.l04_strings;

public class Lesson_Strings {

    public static void main(String[] args) {
        // Cadenas de texto
        String name = "Charlie";
        var lastname = new String("Brown"); // Redundante: mejor usar literal

        // Forma recomendada
        String betterLastname= "Brown";

        // Concatenación
        String fullName = name + " " + betterLastname;
        System.out.println(fullName); // Charlie arBrown

        // Length
        System.out.println(name.length()); // Longitud del string: 7

        // Obtener carácter
        System.out.println(name.charAt(0)); // Primer carácter: C
        System.out.println(name.charAt(6)); // Último carácter: e

        // Comparar strings
        System.out.println(name.equals("Charlie")); // Igual: true
        System.out.println(name.equalsIgnoreCase("CHARLIE")); // Igual ignorando mayúsculas: true

        // Extraer substring
        System.out.println(name.substring(2)); // Desde posición 2: arlie
        System.out.println(name.substring(1, 4)); // Desde 1 hasta 4: har

        // Dividir string
        String[] parts = fullName.split(" ");
        System.out.println(parts[0]); // Charlie
        System.out.println(parts[1]); // Brown

        // Minúsculas y mayúsculas
        System.out.println(name.toUpperCase()); // CHARLIE
        System.out.println(name.toLowerCase()); // charlie

        // Buscar texto
        System.out.println(name.indexOf("ar")); // Posición de "ar": 2
        System.out.println(name.contains("lie")); // Contiene "lie": true

        // Limpiar espacios y reemplazar texto
        String textWithSpaces = "   Hello World   ";
        System.out.println("'" + textWithSpaces + "'"); // '   Hello World   '
        System.out.println("'" + textWithSpaces.trim() + "'"); // 'Hello World'  '

        // Diferentes tipos de replace
        String sentence = "Java is great. Java is powerful.";
        System.out.println(sentence.replace("Java", "Python")); // Reemplaza todas las ocurrencias
        System.out.println(sentence.replaceFirst("Java", "C++")); // Solo la primera ocurrencia
        System.out.println(sentence.replaceAll("Java", "Kotlin")); // Todas (acepta regex)

        // Replace con caracteres
        String text = "Hello-World-Example";
        System.out.println(text.replace('-', '_')); // Hello_World_Example
        System.out.println(text.replace("World", "Java")); // Hello-Java-Example

        // Casos prácticos
        String userInput = "  user@email.com  ";
        String cleanEmail = userInput.trim().toLowerCase();
        System.out.println(cleanEmail); // user@email.com

        String phoneNumber = "(555) 123-4567";
        String cleanPhone = phoneNumber.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
        System.out.println(cleanPhone); // 5551234567

        // Formateo de strings con placeholders
        var age = 37;
        System.out.println(String.format("Hola, %s. Tengo %d años.", name, age));
        // %s = placeholder para String
        // %d = placeholder para enteros (decimal)
        // Resultado: "Hola, Charlie. Tengo 37 años."
    }

}
