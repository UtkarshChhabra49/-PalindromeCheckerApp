    public class PalindromeCheckerApp
    {
    public static void main(String[] args)
    {


                // Original string
                String str = "radar";

                // Convert string to character array
                char[] arr = str.toCharArray();

                int start = 0;
                int end = arr.length - 1;
                boolean isPalindrome = true;

                // Two-pointer comparison
                while (start < end) {
                    if (arr[start] != arr[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                // Display result
                if (isPalindrome) {
                    System.out.println(str + " is a Palindrome");
                } else {
                    System.out.println(str + " is not a Palindrome");
                }
            }
        }

