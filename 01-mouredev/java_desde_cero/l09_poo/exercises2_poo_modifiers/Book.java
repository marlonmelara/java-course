package mybasic.l09_poo.exercises2_poo_modifiers;

// 4. Crea una clase Book con el atributo privado title. Permite leerlo con el
// método_ getTitle() pero no modificarlo (sin setTitle()). El título debe
// asignarse solo por el constructor.
public class Book {
    // Attributes
    private String title;
    private String author;
    // Constructor
    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }
    // Methods
    // Getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
