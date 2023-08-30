package ArrayLIst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Account implements Comparable<Account> {
    private int accountId;
    private double balance;

    public Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    // Getters and setters

    @Override
    public int compareTo(Account other) {
        return Integer.compare(this.accountId, other.accountId);
    }

    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", balance=" + balance + "]";
    }
}

public class AccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accountList = new ArrayList<>();

        System.out.println("1.2 Accept account info from user (Type 'stop' to finish)");

        while (true) {
            System.out.print("Enter account ID (or 'stop'): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            int accountId = Integer.parseInt(input);
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            accountList.add(new Account(accountId, balance));
        }

        System.out.println("\n1.2.1 Display AL content using for-each");
        for (Account account : accountList) {
            System.out.println(account);
        }

        System.out.print("\n1.3 Enter account ID to display summary: ");
        int accountId = sc.nextInt();
        boolean found = false;

        for (Account account : accountList) {
            if (account.getAccountId() == accountId) {
                System.out.println("Account Summary: " + account);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }

        System.out.print("\n1.4 Enter source account ID: ");
        int srcAccountId = sc.nextInt();

        System.out.print("Enter destination account ID: ");
        int destAccountId = sc.nextInt();

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        Account srcAccount = null;
        Account destAccount = null;

        for (Account account : accountList) {
            if (account.getAccountId() == srcAccountId) {
                srcAccount = account;
            } else if (account.getAccountId() == destAccountId) {
                destAccount = account;
            }

            if (srcAccount != null && destAccount != null) {
                break;
            }
        }

        if (srcAccount == null || destAccount == null) {
            System.out.println("Invalid account IDs.");
        } else if (srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            System.out.println("Funds transferred successfully.");
        } else {
            System.out.println("Insufficient balance in the source account.");
        }

        // ... Other objectives (1.5 to 2.0) can be implemented here

        sc.close();
    }
}
