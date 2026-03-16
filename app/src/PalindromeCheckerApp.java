import java.util.*;

class PalindromePerformance {

    // Stack Method
    public static boolean stackPalindrome(String text) {

        Stack<Character> stack = new Stack<>();

        for(char c : text.toCharArray()) {
            stack.push(c);
        }

        for(char c : text.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Method
    public static boolean dequePalindrome(String text) {

        Deque<Character> deque = new LinkedList<>();

        for(char c : text.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    // Two Pointer Method
    public static boolean twoPointerPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while(left < right) {
            if(text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        // Stack Timing
        long start = System.nanoTime();
        boolean stackResult = stackPalindrome(word);
        long end = System.nanoTime();
        long stackTime = end - start;

        // Deque Timing
        start = System.nanoTime();
        boolean dequeResult = dequePalindrome(word);
        end = System.nanoTime();
        long dequeTime = end - start;

        // Two Pointer Timing
        start = System.nanoTime();
        boolean pointerResult = twoPointerPalindrome(word);
        end = System.nanoTime();
        long pointerTime = end - start;

        // Display results
        System.out.println("Palindrome Check for: " + word);
        System.out.println();

        System.out.println("Stack Result: " + stackResult);
        System.out.println("Execution Time: " + stackTime + " ns");

        System.out.println();

        System.out.println("Deque Result: " + dequeResult);
        System.out.println("Execution Time: " + dequeTime + " ns");

        System.out.println();

        System.out.println("Two Pointer Result: " + pointerResult);
        System.out.println("Execution Time: " + pointerTime + " ns");
    }
}