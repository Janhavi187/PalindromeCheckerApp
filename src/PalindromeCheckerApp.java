import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String word) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : word.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App - UC12");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        PalindromeStrategy strategy = new StackStrategy(); // can change to DequeStrategy

        if (strategy.check(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}