import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        System.out.print("Type your name: ");
        String name = reader.nextLine();


        while (i != 3) {
            if (name.length() < 3) {
                return;
            }
            System.out.println(i+1 + ". character: " + (name.charAt(i)));
            i++;

        }
    }
}
