
import java.util.Scanner;

class D3T31 {

    String productName;
    String quantity;
    double[] productPrices = {45000, 55000, 65000};

    void processOrder() {

        Scanner sc = new Scanner(System.in);

        productName = "Laptop";
        quantity = "2";

        try {
            System.out.println("Product Name: " + productName);

            int qty = Integer.parseInt(quantity);

            System.out.println("Quantity: " + qty);

            System.out.print("Enter product position: ");
            int position = sc.nextInt();

            double productPrice = productPrices[position];

            System.out.println("Product Price: " + productPrice);

            double totalPrice = qty * productPrice;

            System.out.println("Total Price: " + totalPrice);

        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid quantity");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid product position");
        }
        finally {
            System.out.println("Order Processing Completed");
        }
    }

    public static void main(String[] args) {

        D3T31 order = new D3T31();

        order.processOrder();
    }
}
