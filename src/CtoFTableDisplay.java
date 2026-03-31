import java.util.Scanner;
public class CtoFTableDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        for ( double Celsius = -100; Celsius <= 100; Celsius++ ) {
            double Fahrenheit = CtoF(Celsius);
            System.out.printf("%.2f %.2f\n", Celsius, Fahrenheit);
        }
    }

    public static double CtoF(double Celsius) {

        return (9.0/5.0 * Celsius) + 32.0;
    }
}
