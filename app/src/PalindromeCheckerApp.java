import java.util.Scanner;
import java.util.Stack;

// Palindrome service class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        if (str == null || str.length() == 0)
            return false;

        // Normalize string: remove spaces, lowercase
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // Using Stack internally
        Stack<Character> stack = new Stack<>();
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main program (no public class)
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create service instance
        PalindromeChecker checker = new PalindromeChecker();

        // Check palindrome
        if (checker.checkPalindrome(input)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}