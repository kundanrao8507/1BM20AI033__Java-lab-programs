import java.util.Scanner;

public class WordCount {
  public static void main(String[] args) {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a statement
    System.out.print("Enter a statement: ");
    String statement = scanner.nextLine();

    // Split the statement into words using the "\\s+" regular expression,
    // which matches one or more consecutive whitespace characters
    String[] words = statement.split("\\s+");

    // Print the number of words
    System.out.println("Number of words: " + words.length);
  }
}
