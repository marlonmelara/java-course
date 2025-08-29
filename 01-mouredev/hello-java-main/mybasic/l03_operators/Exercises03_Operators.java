package mybasic.l03_operators;

public class Exercises03_Operators {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética
        int totalApples = 9 + 1;           // suma de manzanas
        int remainingLives = 10 - 1;       // vidas restantes
        int rectangleArea = 2 * 5;         // área de rectángulo
        int studentsPerGroup = 20 / 5;     // estudiantes por grupo
        int remainder = 25 % 3;            // resto de la división

        // 2. Crea una variable para cada tipo de operación de asignación
        int finalBalanceYTD = 1500;              // Cierre de año (asignación simple)
        int initialBalanceYTD = finalBalanceYTD; // Apertura año siguiente (asignación simple)
        System.out.println(initialBalanceYTD);

        int workingBalance = 1500;     // = (asignación simple)
        workingBalance += 200;         // += (suma y asigna)
        workingBalance -= 50;          // -= (resta y asigna)
        workingBalance *= 2;           // *= (multiplica y asigna)
        workingBalance /= 3;           // /= (divide y asigna)
        workingBalance %= 10;          // %= (módulo y asigna)
        System.out.println(workingBalance);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación
        int a = 100;
        int b = 150;

        System.out.println(a < 101);    // true
        System.out.println(b > a);      // true
        System.out.println(b >= 150);   // true

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación
        System.out.println(a == 101);    // false
        System.out.println(a > b);      // false
        System.out.println(b < 150);    // false

        // 5. Utiliza el operador lógico and
        boolean isActive = true;
        boolean isAdult = true;

        System.out.println(isActive && isAdult); // AND: true

        // 6. Utiliza el operador lógico or
        System.out.println(isActive || false);    // OR: true

        // 7. Combina ambos operadores lógicos
        System.out.println((isActive && false) || isAdult); // true // true

        // 8. Añade alguna negación
        System.out.println(!isAdult); // false

        // 9. Imprime 3 ejemplos de uso de operadores unarios
        int index = 1;
        index++;           // Incremento postfijo
        ++index;           // Incremento prefijo
        index--;           // Decremento postfijo
        --index;           // Decremento prefijo
        System.out.println(index);

        // 10. Combina operadores aritméticos, de comparación y lógicos
        int initialValue = 10;
        int finalValue;

        finalValue = initialValue + 1;  // finalValue = 11
        finalValue++;                   // finalValue = 12
        System.out.println(finalValue == 12);  // true
        System.out.println(finalValue > 20);   // false
        System.out.println(finalValue == 12 && finalValue > 10);  // true
        System.out.println(finalValue > 20 || finalValue < 15);   // true



    }
}
