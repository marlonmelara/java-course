package mybasic.l08_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson_functions {
    public static void main(String[] args) {

        // Ejemplo: función sin parámetros y sin retorno (void)
        for (int i = 0; i < 3; i++){
            sendEmail();
        }

        System.out.println("--- Función sin parámetros ni retorno ---");
        sendEmail();

        System.out.println("--- Funciones con parámetros y sin retorno ---");
        sendEmailToUser("linus@peanuts.com");
        sendEmailToUser("Linus","linus@peanuts.com");

        // Función sobrecargada con ArrayList de correos
        ArrayList<String> correos = new ArrayList<>(Arrays.asList(
                "charlie@peanuts.com",
                "snoopy@peanuts.com",
                "woodstock@peanuts.com"
        ));
        sendEmailToUser(correos);

        System.out.println("--- Funciones con retorno ---");
        boolean enviado = sendEmailToUserAndReturn("lucy@peanuts.com"); // con retorno (boolean)
        System.out.println("¿Se envió? " + enviado);

        int total = sum(2, 3); // con retorno (int)
        System.out.println("Suma: " + total);
    }

    // Función sin parámetros y sin retorno
    public static void sendEmail(){
        System.out.println("Enviar el email");
    }

    // Función con un parámetro (email) y sin retorno
    public static void sendEmailToUser(String email){
        System.out.println("Enviar email a: " + email);
    }

    // Función sobrecargada con dos parámetros (nombre y email) y sin retorno
    public static void sendEmailToUser(String nombre, String email){
        System.out.println("Enviar email a: " + nombre + " (" + email + ")");
    }

    // Función sobrecargada con ArrayList de correos y sin retorno
    public static void sendEmailToUser(ArrayList<String> correos){
        System.out.println("Enviando emails a múltiples usuarios:");
        for (String email : correos) {
            System.out.println("  - Enviando a: " + email);
        }
        System.out.println("Total de emails enviados: " + correos.size());
    }

    // Función con parámetro y con retorno (devuelve estado del envío)
    public static boolean sendEmailToUserAndReturn(String email){
        System.out.println("Enviando email a: " + email);
        return true; // retorno
    }

    // Función con parámetros y con retorno (devuelve la suma)
    public static int sum(int a, int b){
        return a + b;
    }
}