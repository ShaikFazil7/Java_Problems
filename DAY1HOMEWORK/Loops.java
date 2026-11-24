//tables//
package DAY1HOMEWORK;
public class Loops {
    public static void main(String[] args) {
        int n = 5; // You can change this value to generate a different table
        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}