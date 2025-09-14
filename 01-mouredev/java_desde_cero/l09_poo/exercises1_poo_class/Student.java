package mybasic.l09_poo.exercises1_poo_class;

// 5. Crea una clase Student con atributo score y un método_ que diga si aprobó.
public class Student {
    // Attributes
    String name;
    int score;
    // Methods
    public void approve (){
        if (score >= 70) {
            System.out.println("Has aprobado");
        } else {
            System.out.println("Has reprobado");
        }
    }
}
