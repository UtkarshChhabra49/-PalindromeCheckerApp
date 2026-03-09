class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
    public class PalindromeCheckerApp
    {
    public static void main(String[] args)
    {


                String str = "level";

                // Convert string to linked list
                Node head = null, tail = null;
                for (int i = 0; i < str.length(); i++) {
                    Node newNode = new Node(str.charAt(i));
                    if (head == null) {
                        head = newNode;
                        tail = newNode;
                    } else {
                        tail.next = newNode;
                        tail = newNode;
                    }
                }

                // Find middle using fast & slow pointers
                Node slow = head;
                Node fast = head;

                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }

                // Reverse second half
                Node prev = null;
                Node current = slow;

                while (current != null) {
                    Node next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }

                // Compare first half and reversed second half
                Node first = head;
                Node second = prev;
                boolean isPalindrome = true;

                while (second != null) {
                    if (first.data != second.data) {
                        isPalindrome = false;
                        break;
                    }
                    first = first.next;
                    second = second.next;
                }

                // Print result
                if (isPalindrome) {
                    System.out.println(str + " is a Palindrome");
                } else {
                    System.out.println(str + " is not a Palindrome");
                }
            }
        }





