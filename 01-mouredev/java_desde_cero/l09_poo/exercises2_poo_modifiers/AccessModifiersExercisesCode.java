package mybasic.l09_poo.exercises2_poo_modifiers;

public class AccessModifiersExercisesCode {
    public static void main(String[] args) {

        System.out.println("=== EJERCICIO 1: PERSON ===");
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos
        // getName(), setName(), getAge() y setAge() para asignar y mostrar valores
        // desde otra clase.
        var person1 = new Person("Snoopy", 6);
        System.out.println("Nombre: " + person1.getName());
        System.out.println("Edad: " + person1.getAge());
        person1.setName("  Charlie");
        System.out.println("Nuevo nombre: " + person1.getName());

        System.out.println("\n=== EJERCICIO 2: PRODUCT ===");
        // 2. Crea una clase Product con el atributo privado price. Añade el método
        // setPrice(double price) que solo permita precios mayores a 0.
        var product1 = new Product("Linterna", -30);
        System.out.println("Producto: " + product1.getName() + " | Precio: $" + product1.getPrice());
        product1.setPrice(25.99);
        System.out.println("Precio actualizado: $" + product1.getPrice());

        System.out.println("\n=== EJERCICIO 3: BANK ACCOUNT ===");
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
        // métodos deposit(double amount) y withdraw(double amount) que validen las
        // cantidades correctamente.
        var account1 = new BankAccount("1234AB");
        account1.deposit(2000);
        account1.withdraw(500);
        account1.withdraw(1500);
        account1.deposit(5000);
        System.out.println("Saldo actual de cuenta " + account1.getAccountNumb() + ": $" + account1.getBalance());

        System.out.println("\n=== EJERCICIO 4: BOOK ===");
        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el
        // método getTitle() pero no modificarlo (sin setTitle()). El título debe
        // asignarse solo por el constructor.
        var book1 = new Book("Elementos de Euclides", "Euclides");
        System.out.println("Título: " + book1.getTitle() + " | Autor: " + book1.getAuthor());

        System.out.println("\n=== EJERCICIO 5: TEMPERATURE ===");
        // 5. Crea una clase Temperature con el atributo privado celsius. El método
        // setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperature1 = new Temperature();
        temperature1.setCelsius(20.1);
        System.out.println("Temperatura: " + temperature1.getCelsius() + " °C");
        double fahrenheitValue = temperature1.celsiusToFahrenheit();
        System.out.println("Temperatura en Fahrenheit: " + fahrenheitValue + " °F");

        // Probar valores fuera del rango
        temperature1.setCelsius(150); // Debería fallar
        temperature1.setCelsius(-150); // Debería fallar

        System.out.println("\n=== EJERCICIO EXTRA: BOOK2 ===");
        var book2 = new Book2("Crónica de una muerte anunciada   ", "Gabriel García Márquez");
        System.out.println("Título: " + book2.getTitle());
        System.out.println("Estado: " + book2.getState());
        book2.changePublished();
        System.out.println("Nuevo estado: " + book2.getState());
        System.out.println("Propiedades: " + book2.getProperties());

        System.out.println("\n=== EJERCICIO 6: USER ===");
        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los métodos setUsername(String username), setPassword(String
        // password) y checkPassword(String inputPassword) que compare contraseñas.

        System.out.println("--- Creando usuario ---");
        User user = new User("juan123", "MiPassword123@");

        System.out.println("\n--- Probando checkPassword ---");
        // Probar contraseña correcta
        boolean resultado1 = user.checkPassword("MiPassword123@");
        System.out.println("Contraseña correcta - Resultado: " + resultado1);

        // Probar contraseña incorrecta
        boolean resultado2 = user.checkPassword("password123");
        System.out.println("Contraseña incorrecta - Resultado: " + resultado2);

        // Probar con null
        boolean resultado3 = user.checkPassword(null);
        System.out.println("Contraseña null - Resultado: " + resultado3);

        System.out.println("\n--- Cambiando contraseña ---");
        // Cambiar la contraseña
        user.setPassword("NuevaPass456#");

        // Probar con la nueva contraseña
        boolean resultado4 = user.checkPassword("NuevaPass456#");
        System.out.println("Nueva contraseña - Resultado: " + resultado4);

        // Probar con la contraseña anterior (debería fallar)
        boolean resultado5 = user.checkPassword("MiPassword123@");
        System.out.println("Contraseña anterior - Resultado: " + resultado5);

        System.out.println("\n--- Probando validaciones adicionales ---");
        // Probar contraseña muy corta
        user.setPassword("Ab1@");

        // Probar contraseña sin símbolos especiales
        user.setPassword("Password123");

        // Probar contraseña igual al username
        user.setPassword("juan123");

        // Probar contraseña null
        user.setPassword(null);

        System.out.println("\n=== EJERCICIO 7: EMPLOYEE ===");
        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método_
        // raiseSalary(double percent) que solo permita aumentos positivos.

        System.out.println("--- Creando empleado ---");
        var employee1 = new Employee("Jhon", 1200);

        employee1.getEmployeeName();
        employee1.getSalary();
        System.out.println("--- Actualizando salario ---");
        employee1.raiseSalary(10);

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
        // setters y el método_ calculateArea() que devuelva el resultado de width *
        // height.

        System.out.println("\n=== EJERCICIO 8: Rectangle ===");
        var rectangle1 = new Rectangle(5.0,3.0);
        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle1.calculateDiagonal());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos
        // setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual
        // a 60.

        System.out.println("\n=== EJERCICIO 9: Student ===");



        System.out.println("\n=== FIN DE PRUEBAS ===");
    }
}