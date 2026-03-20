import java.util.*;

public class PalindromeCheckerApp {

    public static boolean reverseMethod(String word) {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        return word.equals(rev);
    }

    public static boolean twoPointer(String word) {
        int i = 0, j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        long start = System.nanoTime();
        reverseMethod(word);
        long end = System.nanoTime();

        System.out.println("Reverse Method Time: " + (end - start));

        start = System.nanoTime();
        twoPointer(word);
        end = System.nanoTime();

        System.out.println("Two Pointer Time: " + (end - start));

        sc.close();
    }
}