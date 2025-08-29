package mybasic.l05_conditionals;

public class Lesson_Conditionals {
    public static void main(String[] args) {

        // Condicionales if - else
        var age = 18;
        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir la mayoría de edad");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        // Switch
        var day = "Thursday";

        switch (day){
            case "Monday":
                System.out.println("Start of work week");
                break;
            case "Friday":
                System.out.println("TGIF!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Regular day");
        }

    }
}
