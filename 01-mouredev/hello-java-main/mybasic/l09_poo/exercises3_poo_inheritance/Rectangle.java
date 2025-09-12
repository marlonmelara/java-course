package mybasic.l09_poo.exercises3_poo_inheritance;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea(){
        return width * length;
    }
}
