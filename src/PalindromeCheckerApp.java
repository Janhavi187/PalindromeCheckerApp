import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray())
        {
            stack.push(c);
        }

        String reverse = "";

        while(!stack.isEmpty())
        {
            reverse = reverse + stack.pop();
        }

        if(word.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        scanner.close();
    }
}