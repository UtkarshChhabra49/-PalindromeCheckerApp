import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Main Class (everything starts here)
class Main {

    public static void main(String[] args) {

        String word = "racecar";
        int iterations = 100000;

        // Stack timing
        PalindromeStrategy stack = new StackStrategy();
        long start = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stack.checkPalindrome(word);
        }

        long end = System.nanoTime();
        long stackTime = end - start;

        // Deque timing
        PalindromeStrategy deque = new DequeStrategy();
        start = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            deque.checkPalindrome(word);
        }

        end = System.nanoTime();
        long dequeTime = end - start;

        // Output
        System.out.println("Iterations: " + iterations);
        System.out.println("Stack Time: " + stackTime + " ns");
        System.out.println("Deque Time: " + dequeTime + " ns");
    }
}