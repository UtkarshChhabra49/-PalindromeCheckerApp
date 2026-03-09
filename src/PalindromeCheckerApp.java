import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
    public class PalindromeCheckerApp
    {
    public static void main(String[] args)
    {


                String str = "level";

                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                // Insert characters into queue and stack
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    queue.add(ch);   // Enqueue
                    stack.push(ch);  // Push
                }

                boolean isPalindrome = true;

                // Compare dequeue (FIFO) with pop (LIFO)
                while (!queue.isEmpty()) {
                    if (queue.remove() != stack.pop()) {
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


