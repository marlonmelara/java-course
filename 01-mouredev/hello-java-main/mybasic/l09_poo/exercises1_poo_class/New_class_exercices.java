package mybasic.l09_poo.exercises1_poo_class;

import java.util.ArrayList;

public class New_class_exercices {
    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra
        // sus datos.
        var book1 = new Book("La Iliada", "Homero");
        System.out.println(book1.title + " de " + book1.author);

        // 2. Crea una clase Dog con un método_ bark() que imprima su sonido.
        var dog1 = new Dog("Snoopy");
        dog1.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book2 = new Book("El Señor de los anillos", "J.R. Tolkien");
        book2.showInfo();

        // 4. Crea una clase Car con atributos brand y model y un método_ showData().
        var car1 = new Car("Toyota", "Tercel");
        car1.showData();

        // 5. Crea una clase Student con atributo score y un método_ que diga si aprobó.
        var student1 = new Student ();
        student1.score = 61;
        student1.approve();

        // 6. Crea una clase BankAccount con atributo balance y un método_ deposit() que
        // sume el saldo.
        var account1 = new BankAccount();
        account1.balance = 10;
        account1.deposit = 50;
        account1.showBalance();

        // 7. Crea una clase Rectangle con métodos para calcular el Área y el perímetro.
        var rectangle1 = new Rectangle(2, 10);
        rectangle1.area();
        rectangle1.perimeter();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método_ para
        // mostrar su salario.
        var worker1 = new Worker("Juan Pérez", 1500.50);
        worker1.showInfoWorker();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Charlie", 8));
        people.add(new Person("Linus", 7));

        System.out.println("Lista de personas:");
        for (Person person: people){
            person.sayHello();
        }

        // 10. Crea una clase Product y un método_ que aplique un descuento sobre su
        // precio.

    }
}
