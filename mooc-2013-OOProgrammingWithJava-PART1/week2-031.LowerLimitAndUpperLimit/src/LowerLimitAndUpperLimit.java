
import java.util.Scanner;

public class
LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Provide first no.:");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Provide second no.:");
        int lastNumber = Integer.parseInt(reader.nextLine());

        while (lastNumber >= firstNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }


        // write your code here

    }
}
