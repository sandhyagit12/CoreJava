package Practice;
import java.util.Scanner;

public class Reverse_Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");
        String word = scanner.next(); // Reads the first word
        System.out.println("Using next(): " + word);
        scanner.nextLine(); // Consume the remaining newline character
        System.out.println("Enter some text:");

        String line = scanner.nextLine(); // Reads the entire line
        System.out.println("Using nextLine(): " + line);
        for (int i= line.length()-1;i>=0;i--)
        {
            System.out.print(line.charAt(i));
        }

    }
}
