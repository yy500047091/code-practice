
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Timeformatter {

    public static String timeConversion(String s) {
        // Define a formatter for the input and output time
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Parse the input time using the input formatter
        LocalTime time = LocalTime.parse(s, inputFormatter);

        // Format the parsed time using the output formatter
        return time.format(outputFormatter);
    }

    public static void main(String[] args) {
        String s = "07:05:45PM";
        String result = timeConversion(s);
        System.out.println(result); // Output: "19:05:45"
    }
}
