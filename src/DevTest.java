import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String prompt = SafeInput.getNonZeroLenString(in, "Enter ");
        System.out.println("You entered: " + prompt);

        int inputPrompt = SafeInput.getInt(in, "Enter any integer ");
        System.out.println("The integer you entered is: " + inputPrompt);

        double inputPrompt2 = SafeInput.getDouble(in, "Enter any double value ");
        System.out.println("The double value you entered is: " + inputPrompt2);

        int inputPrompt3 = SafeInput.getRangedInt(in, "Enter your favorite number ",1,10);
        System.out.println("The number chosen is: " + inputPrompt3);

        double inputPrompt4 = SafeInput.getRangedDouble(in, "Enter your favorite double number", 1, 10);
        System.out.println("The double number chosen is: " + inputPrompt4);

    }

    {

    }
}

