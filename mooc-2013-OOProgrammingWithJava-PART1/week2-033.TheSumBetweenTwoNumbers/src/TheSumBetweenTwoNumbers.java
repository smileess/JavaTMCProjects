
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {



        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Last: ");
        int lastNumber = Integer.parseInt(reader.nextLine());

        int sum = firstNumber;
        int i = firstNumber;
        while (lastNumber>i) {

            i++;
            sum+= i;
        }

        System.out.println("The sum is: "+sum);

    }
}
