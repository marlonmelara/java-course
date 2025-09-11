package mybasic.l09_poo.exercices1_poo_class;

// 6. Crea una clase BankAccount con atributo balance y un método_ deposit() que
// sume el saldo.
public class BankAccount {
    // Attributes
    int bankNumber;
    int balance = 0;
    int deposit;

    // Methods
    public void showBalance(){
        balance = balance + deposit;
        System.out.println("Saldo: " + balance);
    }
}
