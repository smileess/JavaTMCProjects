import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {

        int i = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();

        System.out.printf("In reverse order: ");
        while (i != name.length()) {
            i++;
            System.out.print(name.charAt(name.length()-i));

        }

    }
}
