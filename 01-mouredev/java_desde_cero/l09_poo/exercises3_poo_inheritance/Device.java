package mybasic.l09_poo.exercises3_poo_inheritance;

// 7. Haz una clase Device con un constructor que imprima "Device created".
// Luego crea Phone que herede de Device y en su constructor imprima "Phone
// ready".
public class Device {
    // Attributes
    protected String name;
    // Constructor
    public Device (String name){
        this.name = name;
        System.out.println("Device created");
    }
    // Methods
    public void statusInfo (){
        System.out.println("Dispositivo :" + name);
    }
}
