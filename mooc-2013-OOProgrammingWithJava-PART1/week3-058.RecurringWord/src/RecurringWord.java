
import java.util.ArrayList;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 

        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");
        String inputString = reader.nextLine();

        while (!words.contains(inputString)) {
            words.add(inputString);
            System.out.print("Type a word: ");
            inputString = reader.nextLine();
        }

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Word " + inputString + " was inputted twice");
    }
}
