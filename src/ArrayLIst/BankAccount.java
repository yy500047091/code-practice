package ArrayLIst;

import java.time.LocalDate;
import java.util.*;

public class BankAccount {
    private int acctNo;
    private String customerName;
    private double balance;
    private LocalDate creationDate;

    public BankAccount(int acctNo, String customerName, double balance, LocalDate creationDate) {
        this.acctNo = acctNo;
        this.customerName = customerName;
        this.balance = balance;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName
            + ", balance=" + balance + ", creationDate=" + creationDate + "]";
    }

    public int getAcctNo() {
        return acctNo;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}

class BankOperations {
    public static void main(String[] args) {
        Map<Integer, BankAccount> accountMap = new HashMap<>();

        // Populating the map
        accountMap.put(101, new BankAccount(101, "Alice", 1500.0, LocalDate.of(2023, 8, 1)));
        accountMap.put(102, new BankAccount(102, "Bob", 2000.0, LocalDate.of(2023, 8, 5)));
        accountMap.put(103, new BankAccount(103, "Carol", 3000.0, LocalDate.of(2023, 7, 15)));

        // Display all entries in the map
        System.out.println("All entries in the map:");
        for (Map.Entry<Integer, BankAccount> entry : accountMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }

        // Get account summary
        int accountId = 102;
        BankAccount account = accountMap.get(accountId);
        if (account != null) {
            System.out.println("Account Summary for Account ID " + accountId + ":");
            System.out.println(account);
        } else {
            System.out.println("Account not found with ID " + accountId);
        }

        // Withdraw from account
        int withdrawAccountId = 101;
        double withdrawAmount = 100.0;
        BankAccount withdrawAccount = accountMap.get(withdrawAccountId);
        if (withdrawAccount != null) {
            if (withdrawAccount.getBalance() >= withdrawAmount) {
                withdrawAccount.withdraw(withdrawAmount);
                System.out.println("Withdraw successful. Updated account details:");
                System.out.println(withdrawAccount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Account not found with ID " + withdrawAccountId);
        }

        // Other operations (funds transfer, remove account, interest calculation, sorting) can be added similarly.
    }
}
