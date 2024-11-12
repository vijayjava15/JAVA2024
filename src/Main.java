import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Current date in milliseconds
        long currentMillis = System.currentTimeMillis();
        System.out.println("Current Date in milliseconds: " + currentMillis);

        // Add 429,900,000 milliseconds (which is 119.25 hours)
        long additionalMillis = (long) (194 * 60 * 60 * 1000);
        System.out.println(additionalMillis);
        long resultingMillis = currentMillis + additionalMillis;

        // Convert back to a Date object
        Date resultingDate = new Date(resultingMillis);
        System.out.println("Resulting Date: " + resultingDate);

        String input = "4,23,15";

        // Split the input string
        String[] timeParts = input.split(",");

        // Parse days, hours, and minutes
        int days = Integer.parseInt(timeParts[0]);
        int hours = Integer.parseInt(timeParts[1]);
        int minutes = Integer.parseInt(timeParts[2]);

        // Convert to milliseconds
        long totalMilliseconds = (days * 24 * 60 * 60 * 1000) +
                (hours * 60 * 60 * 1000) +
                (minutes * 60 * 1000);

        // Output the result
        System.out.println("Total milliseconds: " + totalMilliseconds);


        int registerDate = 1;
        int daysdd= 2;
        int currentDate = 3;

        if(registerDate>=currentDate-daysdd){
            System.out.println("hkbdckj,bf");
        }

    }
}
