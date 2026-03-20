import java.util.Scanner;

public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {

        String original = "";
        String reverse = "";

        Node temp = head;

        while (temp != null) {
            original += temp.data;
            reverse = temp.data + reverse;
            temp = temp.next;
        }

        return original.equals(reverse);
    }

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC8");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Node head = null, tail = null;

        for (char c : word.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}