package mybasic.l03_operators;

public class Lesson_Operators {

    public static void main(String[] args) {

        // Operadores aritméticos básicos
        var a = 5;
        var b = 2;

        System.out.println(a + b); // Suma: 7
        System.out.println(a - b); // Resta: 3
        System.out.println(a * b); // Multiplicación: 10
        System.out.println(a / b); // División entera: 2
        System.out.println(a % b); // Módulo (resto): 1

        // Asignación
        a = b;
        System.out.println(a); // a = 2

        a= b * 2;
        System.out.println(a); // a = 4

        a = 5; // Asignamos el valor original de 5

        // Operadores de incremento/decremento
        System.out.println(++a); // Pre-incremento: 6
        System.out.println(a++); // Post-incremento: 6 (luego a=7)
        System.out.println(--b); // Pre-decremento: 1
        System.out.println(b--); // Post-decremento: 1 (luego b=0)

        // Operadores de asignación compuesta
        int c = 10;
        c += 5; // c = c + 5
        System.out.println(c); // 15
        c -= 3; // c = c - 3
        System.out.println(c); // 12
        c *= 2; // c = c * 2
        System.out.println(c); // 24
        c /= 4; // c = c / 4
        System.out.println(c); // 6
        c %= 4; // c = c % 4
        System.out.println(c); // 2

        // Operadores de comparación (relacionales)
        int x = 5, y = 3;
        System.out.println(x == y); // Igual a: false
        System.out.println(x != y); // Diferente de: true
        System.out.println(x > y);  // Mayor que: true
        System.out.println(x < y);  // Menor que: false
        System.out.println(x >= y); // Mayor o igual: true
        System.out.println(x <= y); // Menor o igual: false

        // Operadores lógicos
        boolean p = true;
        boolean q = false;

        System.out.println(p && q); // AND lógico: false
        System.out.println(p || q); // OR lógico: true
        System.out.println(!p);     // NOT lógico: false
        System.out.println(!q);     // NOT lógico: true

        // Ejemplos con expresiones
        int age = 18;
        boolean hasLicense = true;

        System.out.println(age >= 18 && hasLicense); // Puede conducir: true
        System.out.println(age < 16 || !hasLicense); // No puede conducir: false
    }
}