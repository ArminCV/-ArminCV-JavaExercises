package JavaAbstract.Exercise3;

public class Main {

    public static void main(String[] args) {
        double ibal, damt, wamt;
        String acc1, acc2, acc3;
        acc1 = "SA001";
        ibal = 1000.00;
        SavingsAccount savingsAccount = new SavingsAccount(acc1, ibal);
        System.out.println("Savings A/c: Initial Balance: $" + ibal);
        damt = 500.00;
        savingsAccount.deposit(damt);
        wamt = 250.00;
        savingsAccount.withdraw(wamt);
        wamt = 1600.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);
        System.out.println();
        ibal = 5000.00;
        acc2 = "CA001";
        CurrentAccount currentAccount = new CurrentAccount(acc2, ibal);
        System.out.println("Current A/c: Initial Balance: $" + ibal);
        damt = 1000.00;
        currentAccount.deposit(damt);
        wamt = 3000.00;
        currentAccount.withdraw(wamt);
        wamt = 6000.00;
        System.out.println("\nTry to withdraw: $" + wamt);
        savingsAccount.withdraw(wamt);
    }
    
}
