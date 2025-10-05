package mybasic.l10_exceptions;

public class Lesson_1_exceptions {
    public static void main(String[] args) throws CustomException {
        // Manejo de excepciones
        // Ejemplo 1
        int result1 = 0;
        try {
            result1 = 10 / 0; // Causa ArithmeticException
            System.out.println(result1);
        } catch (ArithmeticException e) {
            System.err.println("Error aritmético: " + e);
            //System.err.println("Error toString: " + e.toString());
            //System.err.println("Error getMessage: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error desconocido y no esperado: " + e.getMessage());
        }

        // Ejemplo 2
        var name1 = "Snoopy";
        var name2 = "Charlie";
        name1 = null;

        // Operación 1
        try {
            System.out.println("Nombre: " + name1.toUpperCase()); // Causa NullPointerException
        } catch (Exception e){
            System.err.println("Error null pointer: " +e);
        }

        // Operación 2
        try {
            System.out.println("Nombre: " + name2.toUpperCase()); // Se ejecuta correctamente
        } catch (Exception e){
            System.out.println("Error null pointer: " +e);
        }

        // Ejemplo 3: Inclusión del bloque finally
        int result2 = 0;

        try {
            result2 = 10 / 0; // 🛑 Aquí se lanza la ArithmeticException
            System.out.println("Resultado exitoso: " + result2); // ❌ Esta línea no se ejecuta
        } catch (ArithmeticException e) {
            System.err.println("-> Dentro del bloque catch. Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("-> Error desconocido: " + e.getMessage());
        } finally {
            System.out.println("-> Dentro del bloque finally. Liberando recursos.");
        }

        // Throw
        var throwExample = new ThrowExample();
        try {
            throwExample.checkAge(16);
        } catch (IllegalArgumentException e) {
            System.err.println("-> Error: " + e.getMessage());
        }

        System.out.println(throwExample);

        // Excepción personalizada
        try {
            throwExample.checkScore(80);
        } catch (CustomException e) {
            System.out.println("-> Error de puntuación: " + e.getMessage());
        }


        System.out.println("--- Fin de programa ---");
    }



}
