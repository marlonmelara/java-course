package mybasic.l04_strings;

public class Exercises04_Strings {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto
        String greeting = "Hello" + ", Java!";
        System.out.println(greeting);

        // 2. Muestra la longitud de una cadena de texto
        String myFavoriteLanguage = "Java";
        System.out.println(myFavoriteLanguage.length()); // ✓ Imprime: 4

        // 3. Muestra el primer y último carácter de un string
        System.out.println(myFavoriteLanguage.charAt(0)); // ✓ 'J'
        System.out.println(myFavoriteLanguage.charAt(3)); // ✓ 'a' (último)

        // 4. Convierte a mayúsculas y minúsculas un string
        System.out.println(myFavoriteLanguage.toUpperCase()); // JAVA
        System.out.println(myFavoriteLanguage.toLowerCase()); // java

        // 5. Comprueba si una cadena de texto contiene una palabra concreta
        System.out.println(greeting.contains("Java"));        // ✓ true

        // 6. Formatea un string con un entero
        int version = 17;
        String formatted = String.format("Java version: %d", version);
        System.out.println(formatted); // "Java version: 17"

        // 7. Elimina los espacios en blanco al principio y final de un string
        String randomWord = "   Knowledge ";
        System.out.println(randomWord.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guion (-)
        System.out.println("- " + randomWord.trim() + " -"); // - Knowledge -

        // 9. Comprueba si dos strings son iguales
        String word1 = "lane";
        String word2 = "stop";

        // 10. Comprueba si dos strings tienen la misma longitud
        System.out.println(word1.length() == word2.length());
    }
}


