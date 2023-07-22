package bank;

public class BankAccount {
    private String accountName;
    private double balance;
    private final String accountNumber;

    public BankAccount(String accountName, double balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Deposit amount must be greater than zero.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Deposit amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
    }

    public void transfer(double amount, BankAccount destination) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Deposit amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        destination.deposit(amount);
    }

    public static boolean isValidAccountNumber(String accountNumber) {
        if(accountNumber == null || accountNumber.isEmpty()){
            return false;
        }
        if (accountNumber.length() < 2 || accountNumber.length() > 9) {
            return false;
        }
         int sumOfDigits = 0;
        for (int i = 0; i <accountNumber.length() ; i++) {
            char digitChar = accountNumber.charAt(i);
            if(!Character.isDigit(digitChar)){
                return false;
            }
            sumOfDigits += Integer.parseInt(String.valueOf(digitChar));

        }
        int firstDigit = accountNumber.charAt(0);
        int lastDigit = accountNumber.charAt(accountNumber.length() - 1);
        return sumOfDigits >= 20 && firstDigit % 2 == lastDigit % 2;

    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
