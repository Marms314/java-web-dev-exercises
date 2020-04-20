package exercises;
import java.util.Scanner;

public class RemoveFromAlice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a phrase to remove from the sentence:");
        String searchTerm = input.nextLine().toLowerCase();
        input.close();

        boolean isInAlice = alice.toLowerCase().contains(searchTerm);

        if (isInAlice) {
            int index = alice.indexOf(searchTerm);
            int length = searchTerm.length();
            String updatedAlice = alice.substring(0, index) + alice.substring(index + length);
            System.out.println("The phrase starts at character " + index + " of the sentence and is " + length +
                    " characters long.");
            System.out.println("Here is the updated sentence without the phrase: " + updatedAlice);
        } else {
            System.out.println("Please enter a term in the sentence next time.");
        }
    }
}
