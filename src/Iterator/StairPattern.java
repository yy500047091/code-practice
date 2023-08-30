package Iterator;

public class StairPattern {

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print '#' symbols
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }
}

