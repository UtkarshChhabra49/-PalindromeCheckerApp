import java.util.Deque;
import java.util.LinkedList;
    public class PalindromeCheckerApp
    {
    public static void main(String[] args)
    {

                String str = "radar";
                Deque<Character> deque = new LinkedList<>();

                // Insert characters into deque
                for (int i = 0; i < str.length(); i++) {
                    deque.addLast(str.charAt(i));
                }

                boolean isPalindrome = true;

                // Compare front and rear characters
                while (deque.size() > 1) {
                    if (deque.removeFirst() != deque.removeLast()) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Print result
                if (isPalindrome) {
                    System.out.println(str + " is a Palindrome");
                } else {
                    System.out.println(str + " is not a Palindrome");
                }
            }
        }



