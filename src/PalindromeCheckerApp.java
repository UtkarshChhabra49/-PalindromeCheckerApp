
    public class PalindromeCheckerApp
    {


            public static void main(String[] args) {

                String str = "Madam In Eden Im Adam";

                // Normalize string: remove spaces and convert to lowercase
                String normalized = str.replaceAll("\\s+", "").toLowerCase();

                boolean isPalindrome = true;
                int start = 0;
                int end = normalized.length() - 1;

                // Compare characters
                while (start < end) {
                    if (normalized.charAt(start) != normalized.charAt(end)) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                // Print result
                if (isPalindrome) {
                    System.out.println("\"" + str + "\" is a Palindrome");
                } else {
                    System.out.println("\"" + str + "\" is not a Palindrome");
                }
            }
        }







