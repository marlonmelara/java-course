package mybasic.l09_poo.exercices1_poo_class;

// 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra
// sus datos.
// 3. Añade un constructor a la clase Book que reciba title y author.
public class Book {
    // Attributes
    String title;
    String author;
    // Constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    // Methods
    public void showInfo(){
        System.out.println(title + " de " + author);
    }


}
