import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance=10;


    void deposit() {}
    void withdraw() {}

}





class SavingsAccount extends BankAccount {
    void deposit(double deposit_amount) {
        balance=balance+deposit_amount;
        System.out.println("Current Balance: " + balance);
    }

  void withdraw(double withdraw_amount) {

        if(balance < 100){
            System.out.println("Withdrawal not allowed. Minimum balance should be 100.");
        }

        else if (balance<withdraw_amount){
          System.out.println("Insufficient Balance");
        }

        else  {
            balance=balance-withdraw_amount;
            System.out.println("Current Balance: " + balance);
        }

    }


}

class Main_bank {
    public static void main(String[] args) {
        SavingsAccount Account = new SavingsAccount();

        Account.deposit(200);
        Account.withdraw(50);
        Account.withdraw(400);
        Account.withdraw(120);
        Account.withdraw(50);
    }
}
