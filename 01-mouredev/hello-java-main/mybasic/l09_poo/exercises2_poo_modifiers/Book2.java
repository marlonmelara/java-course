package mybasic.l09_poo.exercises2_poo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Book2 {
    //Attributes
    private String title;
    private String author;
    private boolean published;
    // Constructor
    public Book2 (String title, String author){
        this.title = title.trim();
        this.author = author.trim().toUpperCase();
        this.published = false;
    }
    // Methods
    public void changePublished() {
        this.published = true;
    }
    // Getters
    public Map<String, Object> getProperties(){
        Map<String, Object> properties = new HashMap<>();
        properties.put("title", this.title);
        properties.put("author", this.author);
        properties.put("published", this.published);
        return properties;
    }

    public String getTitle(){
        return "Titulo: " + this.title;
    }

    public String getState(){
        if (this.published){
            return "El libro " + this.title + " de " + this.author + " esta publicado.";
        } else {
            return "El libro " + this.title + " de " + this.author + " no esta publicado.";

        }
    }

}
