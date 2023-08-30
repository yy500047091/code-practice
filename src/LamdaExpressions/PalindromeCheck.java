package LamdaExpressions;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class PalindromeCheck {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        List<String> checklist = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String input = scanner.nextLine();
            checklist.add(input);
        }

        Predicate<String> isPalindrome = str -> {
            str = str.replaceAll("\\s+", "").toLowerCase();
            int left = 0;
            int right = str.length() - 1;
            
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            
            return true;
        };

        checklist.forEach(str -> {
            System.out.println("\"" + str + "\" is" + (isPalindrome.test(str) ? " " : " not ") + "a palindrome.");
        });

        scanner.close();
    }
}
