import java.util.Scanner;

public class D3T25 {
    String paymentAmount = "2500";

    void convertAmount(String amount) {
        paymentAmount = amount;

        try {
            double convertedAmount = Double.parseDouble(paymentAmount);

            System.out.println("Payment Amount: " + convertedAmount);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid payment amount");
        }
    }

    public static void main(String[] args) {
        D3T25 payment = new D3T25();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter payment amount: ");
        String amount = sc.nextLine();

        payment.convertAmount(amount);

        sc.close();
    }
}
