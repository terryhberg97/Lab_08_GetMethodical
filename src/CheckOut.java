import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price;
        boolean getYNConfirm;
        double totalPrice = 0;

        do {

            price = SafeInput.getRangedDouble(in, "Enter the price of a single item ", 0.5, 10);

            totalPrice += price;
            getYNConfirm = SafeInput.getYNConfirm(in, "Do you have more items to add? [Y/N] ");
            System.out.println("You entered: " + getYNConfirm);
        } while (getYNConfirm);
        System.out.printf("The total cost of your items is: %.2f%n", totalPrice);
    }
}

