package mybasic.l10_exceptions;

public class Lesson_2_ThrowExample {
    public void checkAge (int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
    }

    // Throw
    public void checkScore (int score) throws CustomException{
        if (score < 0 || score > 100) {
            throw new CustomException("Score invalido");
        } else {
            System.out.println("Puntuación validad: " + score);
        }
    }

    // Excepción personalizada

}
