import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        //initial input
        System.out.print("Type a word: ");
        String inputString = reader.nextLine();

        while (!inputString.isEmpty()) {
            words.add(inputString);
            //new input
            System.out.print("Type a word: ");
            inputString = reader.nextLine();
        }

        for (String word:words) {
            System.out.println(word);
        }

    }
}
