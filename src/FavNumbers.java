import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favNumber;
        double favDouble;
        favNumber = SafeInput.getInt(in, "Enter your favorite number ");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double number ");
        System.out.println("\n Your favorite number is " + favNumber  + " and your favorite double number is " + favDouble);
    }
}


