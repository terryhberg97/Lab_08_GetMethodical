import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String prompt = SafeInput.getNonZeroLenString(in, "Enter any string ");
        System.out.println("You entered: " + prompt);

        int inputPrompt = SafeInput.getInt(in, "Enter any integer ");
        System.out.println("The integer you entered is: " + inputPrompt);

        double inputPrompt2 = SafeInput.getDouble(in, "Enter any double value ");
        System.out.println("The double value you entered is: " + inputPrompt2);

        int inputPrompt3 = SafeInput.getRangedInt(in, "Enter an inclusive integer ",1,10);
        System.out.println("The number chosen is: " + inputPrompt3);

        double inputPrompt4 = SafeInput.getRangedDouble(in, "Enter an inclusive double number", 1, 10);
        System.out.println("The double number chosen is: " + inputPrompt4);

        boolean inputPrompt5 = SafeInput.getYNConfirm(in, "Enter a yes or no [Y/N] ");
        System.out.println("You chose: " + inputPrompt5);

        String inputPrompt6 = SafeInput.getRegExString(in, "Enter a string that matches the Positive Integers regex pattern ","^\\d+$");
        System.out.println("Your string matches the pattern: ^\\d+$" );

        String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

    }
    {
    }
}