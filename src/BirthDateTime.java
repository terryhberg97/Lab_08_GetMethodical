import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int minutes;
        int timeofBirth;
        year = SafeInput.getRangedInt(in, "Enter the year you were born ", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month ", 1, 12);
        day = SafeInput.getRangedInt(in, "Enter your the day you were born ", 1, 31);
        hour = SafeInput.getRangedInt(in, "Enter the hour you were born ", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter the minute you were born ", 1, 59);

        switch (month) {
            case 2:
                if (day > 29) {
                    System.out.println("Invalid input");
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day > 30) {
                    System.out.println("Invalid input");
                }
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day > 31) {
                    System.out.println("Invalid input");
                }


        }
        System.out.println("You were born on " + month + "/" + day + "/" + year + " at " + hour + ":" + minutes);
    }
}
