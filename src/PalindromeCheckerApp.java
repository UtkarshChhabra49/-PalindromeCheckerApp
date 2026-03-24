public class PalindromeCheckerApp {

    // Public method exposed to user
    public boolean checkPalindrome(String str) {

        // Convert string to char array (internal data structure)
        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Two-pointer comparison
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "level";

        // Create object
        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        // Call method
        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}