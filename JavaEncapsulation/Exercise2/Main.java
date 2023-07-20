package JavaEncapsulation.Exercise2;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();

        bankAcc.setAccountNumber("SB-09876");
        bankAcc.setBalance(2000.0);

        String accountNumber = bankAcc.getAccountNumber();
        double balance = bankAcc.getBalance();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    
}
