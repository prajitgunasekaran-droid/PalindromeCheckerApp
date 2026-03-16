import java.util.Scanner;

class RecursivePalindrome {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case
        if (start >= end) {
            return true;
        }

        // Compare start and end characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Check palindrome
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}