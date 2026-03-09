    import java.util.Stack;
    public class PalindromeCheckerApp
    {
    public static void main(String[] args)
    {

                String str = "madam";
                Stack<Character> stack = new Stack<>();

                // Push characters into stack
                for (int i = 0; i < str.length(); i++) {
                    stack.push(str.charAt(i));
                }

                boolean isPalindrome = true;

                // Pop and compare
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != stack.pop()) {
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


