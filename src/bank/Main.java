package bank;

public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
        BankAccount account = new BankAccount("John Doe", 1000.0, "123456789");
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account name: " + account.getAccountName());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("New balance after deposit: " + account.getBalance());

        account.withdraw(300.58);
        System.out.println("New balance after withdraw : " + account.getBalance());

        String accountNumber1 = "123456789";
        String accountNumber2 = "987654321";
        String accountNumber3 = "12345";
        String accountNumber4 = "9876543210";

        System.out.println("Is " + accountNumber1 + " valid? " + BankAccount.isValidAccountNumber(accountNumber1));
        System.out.println("Is " + accountNumber2 + " valid? " + BankAccount.isValidAccountNumber(accountNumber2));
        System.out.println("Is " + accountNumber3 + " valid? " + BankAccount.isValidAccountNumber(accountNumber3));
        System.out.println("Is " + accountNumber4 + " valid? " + BankAccount.isValidAccountNumber(accountNumber4));

        account.transfer(154, new BankAccount("Mary",1875.36,accountNumber2));
        System.out.println("New balance after transfer : " + account.getBalance());
    }
}
