package mybasic.l09_poo.exercises2_poo_modifiers;

// 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
// setters y el método_ calculateArea() que devuelva el resultado de width *
// height.
public class Rectangle {
    // Attributes
    private double width;
    private double height;
    // Constructor
    public Rectangle (double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }
    // Methods
    // Getters
   public double getWidth(){
        return this.width;
   }
   public double getHeight(){
        return this.height;
   }
    // Setters
    public void setWidth (double width){
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Error: El ancho debe ser mayor a cero. Valor actual: " + this.width);
        }
    }
    public void setHeight (double height){
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error: El alto debe ser mayor a cero. Valor actual: " + this.height);
        }
    }

    // Método_ principal: calcular área
    public double calculateArea(){
        return this.width * this.height;
    }
    // Métodos adicionales útiles
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }

    public boolean isSquare() {
        return Double.compare(this.width, this.height) == 0;
    }
}
