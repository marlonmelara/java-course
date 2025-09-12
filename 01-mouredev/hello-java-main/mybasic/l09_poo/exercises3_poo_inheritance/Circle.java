package mybasic.l09_poo.exercises3_poo_inheritance;

public class Circle extends Shape {
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
