import java.util.Scanner;
public class WriteInTheSecondBranch {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("\nThis program checks if a word is a palindrome.\n");

        System.out.print("Enter the word to analyze: ");
        String word = scanner.next();

        StringBuilder stringbuilder = new StringBuilder(word);

        stringbuilder.reverse();

        String wordReversed = stringbuilder.toString();

        if (word.equals(wordReversed)) {
            System.out.println("The word '"+ word + "' it's a palindrome.");
        } else {
            System.out.println("The word it's not a palindrome.");
        }
    }
}
