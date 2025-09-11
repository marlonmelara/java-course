package mybasic.l09_poo.exercises2_poo;

// 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
// métodos deposit(double amount) y withdraw(double amount) que validen las
// cantidades correctamente.
public class BankAccount {
    // Attributes
    private String accountNumb;
    private double balance;

    // Constructor
    public BankAccount (String accountNumb){
        this.accountNumb = accountNumb;
        this.balance = 0.0;
    }
    // Methods
    public void deposit (double amount) {
        System.out.println("Cuenta #: " + accountNumb);
        if (amount <= 0) {
            System.out.println("El monto del abono debe de ser mayor a cero");
        } else {
            balance += amount;
            System.out.println("Depósito de $:" + amount + " realizado. Saldo actual $: " + balance);
        }
    }
    public void withdraw (double amount) {
        System.out.println("Cuenta #: " + accountNumb);
        if (amount <= 0) {
            System.out.println("El monto del retiro debe de ser positivo");
        } else if (amount > balance){
            System.out.println("Fondos insuficientes. Saldo actual $:" + balance);
        } else {
            balance -= amount;
            System.out.println("Retiro de $: " + amount + " realizado. Saldo actual $: " + balance);
        }
    }
    // Getters
    public double getBalance(){
        return balance;
    }
    public String getAccountNumb(){
        return accountNumb;
    }
}
