package Exercise5;

public class Main {
    public static void main(String[] args) {
        String account = "BA1234";
        String sac = "SA1234";
        String sac2 = "SA1000";
        BankAccount bac = new BankAccount(account, 500);

        System.out.println("Create a BankAccount object (A/c No. 'BA1234') with initial balance of $500.");
        System.out.println("Deposit $1000 into account BA1234.");
        double amount = 1000;
        bac.deposit(amount);
        System.out.println("New balance after depositing " + amount + ": " + bac.getBalance());
        double withdraw = 600;
        System.out.println("Withdraw $" + withdraw + " from account " + account);
        bac.withdraw(withdraw);
        System.out.println("New balance after withdrawing $" + withdraw + ": $" + bac.getBalance());

        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
        double initialBalance = 450;
        SavingsAccount sAccount = new SavingsAccount(sac, initialBalance);
        withdraw = 300;
        sAccount.withdraw(withdraw);
        System.out.println("Balance after trying to withdraw $" + withdraw + ": $" + sAccount.getBalance());

        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        initialBalance = 300;
        SavingsAccount sAccount2 = new SavingsAccount(sac2, initialBalance);
        System.out.println("Try to withdraw $250 from " + sac2 + "!");
        withdraw = 250;
        sAccount2.withdraw(withdraw);
        System.out.println("Balance after trying to withdraw $" + withdraw +": $" + sAccount2.getBalance());
    }   
}
