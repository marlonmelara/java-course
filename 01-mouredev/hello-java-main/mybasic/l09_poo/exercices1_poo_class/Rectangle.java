package mybasic.l09_poo.exercices1_poo_class;

// 7. Crea una clase Rectangle con métodos para calcular el Área y el perímetro.
public class Rectangle {
    // Attributes
    int height;
    int width;
    // Constructor
    public Rectangle (int height, int width){
        this.height = height;
        this.width = width;
    }
    // Methods
    public void area (){
        int totalArea = height * width;
        System.out.println("Área total del rectángulo: " + totalArea);
    }
    public void perimeter(){
        int totalPerimeter = 2 * (height * width);
        System.out.println("Perímetro del rectángulo: " + totalPerimeter);
    }

}
