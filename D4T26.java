import java.util.HashMap;
import java.util.Map;

public class D4T26 {
    public static void main(String[] args) {

        HashMap<Integer, Double> accounts = new HashMap<>();

        accounts.put(101, 5000.0);
        accounts.put(102, 10000.0);
        accounts.put(103, 8000.0);

        System.out.println("Bank Accounts: " + accounts);

        int depositAccount = 101;
        double deposit = 2000;

        if (accounts.containsKey(depositAccount)) {
            accounts.put(depositAccount,
                    accounts.get(depositAccount) + deposit);
            System.out.println("\nMoney deposited successfully.");
        } else {
            System.out.println("Account not found.");
        }

        int withdrawAccount = 102;
        double withdraw = 3000;

        if (accounts.containsKey(withdrawAccount)) {
            if (accounts.get(withdrawAccount) >= withdraw) {
                accounts.put(withdrawAccount,
                        accounts.get(withdrawAccount) - withdraw);
                System.out.println("Money withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }

        int accountNo = 101;

        if (accounts.containsKey(accountNo)) {
            System.out.println("\nAccount Balance: "
                    + accounts.get(accountNo));
        } else {
            System.out.println("Account not found.");
        }

        System.out.println("\nAccount 104 Balance: "
                + accounts.getOrDefault(104, 0.0));

        System.out.println("\nAll Bank Accounts:");

        for (Map.Entry<Integer, Double> e : accounts.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        double total = 0;

        for (double balance : accounts.values()) {
            total = total + balance;
        }

        System.out.println("\nTotal Bank Balance: " + total);
    }
}