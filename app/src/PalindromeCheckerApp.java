import java.util.Scanner;

class CaseInsensitivePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Normalize string: remove spaces & convert to lowercase
        String normalized = str.toLowerCase().replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome (case-insensitive, space-ignored).");
        } else {
            System.out.println("The string is NOT a Palindrome (case-insensitive, space-ignored).");
        }

        sc.close();
    }
}
