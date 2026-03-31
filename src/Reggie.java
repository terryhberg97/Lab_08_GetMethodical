import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn;
        String ucMNumber;
        String menuChoice;

        ssn = SafeInput.getRegExString(in, "Enter your Social Security Number ", "^\\d{3}-\\d{2}-\\d{4}$");
        ucMNumber = SafeInput.getRegExString(in, "Enter your UC M number ", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Enter a menu choice [O,S,V, or Q] ", "^[OoSsVvQq]$");
    }
}
