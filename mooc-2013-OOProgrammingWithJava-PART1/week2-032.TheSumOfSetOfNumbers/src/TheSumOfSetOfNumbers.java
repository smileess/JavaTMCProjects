
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {

        int i= 0;
        int sum= 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int number = Integer.parseInt(reader.nextLine());

        while (number > i) {

            i++;
            sum = sum+ i;

        }
        System.out.println("Sum is: "+sum);
    }
}
