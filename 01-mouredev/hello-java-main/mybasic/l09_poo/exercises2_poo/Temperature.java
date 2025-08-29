package mybasic.l09_poo.exercises2_poo;

// 5. Crea una clase Temperature con el atributo privado celsius. El método_
// setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

public class Temperature {
    // Attribute
    private double celsius;
    private double fahrenheit;
    // Methods
    public double celsiusToFahrenheit (){
        this.fahrenheit = (celsius * 9/5) + 32;
        return this.fahrenheit;
    }
    // Setters
    public void setCelsius (double celsius){
        if (celsius >= -100 && celsius <= 100){
            this.celsius = celsius;
            System.out.println("Temperatura establecida a " + celsius + " °C");
        } else {
            System.out.println("La temperatura debe de estar entre -100 °C y 100 °C");
        }
    }
    // Getters
    public double getCelsius(){
        return celsius;
    }
}
