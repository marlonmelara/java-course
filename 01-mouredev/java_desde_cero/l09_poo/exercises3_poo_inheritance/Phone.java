package mybasic.l09_poo.exercises3_poo_inheritance;

public class Phone extends Device {
    // Constructor
    public Phone (String name){
        super (name);
        System.out.println("Phone ready");
    }

    // Metodo específico de Phone
    @Override
    public void statusInfo (){
        System.out.println("Dispositivo Apple :" + name);
    }
}
