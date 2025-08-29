package mybasic.l07_loops;

import basic.c05_structures.Sets;

import java.util.*;

public class Exercises07_Loops {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while

        int index = 1;

        while (index <= 10){
            System.out.println(index);
            index ++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int i = 0;

        do {
            System.out.println(numbers.get(i));
            i++;
        } while (i < numbers.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for

        for (i = 1; i <= 50; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total

        int[] arrayNums = {0, 1, 2, 3, 4};
        int total = 0;

        for (int contador = 0; contador < arrayNums.length; contador++) {
            total += arrayNums[contador];
        }

        System.out.println("El valor total es " + total); // Muestra 10

        // 5. Usa un for para recorrer un Array y mostrar sus valores

        String[] names = {"Snoopy", "Woodstock", "Charlie"};

        System.out.println("-- Recorrer Array con for");
        for (int j = 0; j < names.length ; j++) {
            System.out.println(names[j]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap

        Set<String> set = new HashSet<>(Arrays.asList("Snoopy", "Woodstock", "Charlie"));
        Map<String, Integer> map = new HashMap<>();
        map.put("Snoopy", 1);
        map.put("Woodstock", 1);
        map.put("Charlie", 1);

        // for-each
        System.out.println("-- Recorrer Set con for each");
        for (String name: set){
            System.out.println(name);
        }

        System.out.println("-- Recorrer Map con for each");
        // forEach propio del Map (clave, valor)
        map.forEach((k, v) -> System.out.println(k + " -> " + v));


        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for

        System.out.println("-- Imprimer en forma descendente del 10 al 1");
        for (int n = 10; n > 0; n--) {
            System.out.println(n);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20

        System.out.println("-- Saltar los multiplos del 3");
        for (int m = 0; m <= 20 ; m++) {
            if (m % 3 == 0){
                continue;
            }
            System.out.println(m);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array

        int[] arrayNums2 = {0, 1, 2, 3, 4, 5, -6, 7, 8, -1, 9};

        System.out.println("-- Deterner blucle si hay un número negativo");
        for (int s = 0; s < arrayNums2.length; s++) {
            if (arrayNums2[s] < 0) {
                break;
            }
            System.out.println(arrayNums2[s]);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.

        System.out.println("-- Calcular el factorial de un número dado");
        int factorial = 1;
        int numberToFactorial = 5;

        for (int c = 1; c <= numberToFactorial; c++) {
            factorial *= c;
        }
        System.out.println("Factorial de " + numberToFactorial + " = " + factorial);


    }
}