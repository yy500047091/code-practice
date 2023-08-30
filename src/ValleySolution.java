import java.util.Scanner;

class Result {

    public static int countingValleys(int steps, String path) {
        int level = 0; // Current altitude level
        int valleyCount = 0; // Count of valleys entered

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                level++; // Step up
            } else if (step == 'D') {
                level--; // Step down
            }

            // Check if the hiker enters a valley
            if (level == 0 && step == 'U') {
                valleyCount++;
            }
        }

        return valleyCount;
    }
}

public class ValleySolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        String path = scanner.nextLine();

        int result = Result.countingValleys(steps, path);
        System.out.println(result);

        scanner.close();
    }
}
