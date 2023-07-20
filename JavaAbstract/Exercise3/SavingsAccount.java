package JavaAbstract.Exercise3;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumber, double balance)
    {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(amount + getBalance());
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() >= amount)
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of $" + amount + " successful. Current balance: $" + getBalance());
        }else{
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
    
}
