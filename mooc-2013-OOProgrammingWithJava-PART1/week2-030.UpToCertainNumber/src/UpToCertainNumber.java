
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 1;

        int userNumber = Integer.parseInt(reader.nextLine());

        while(number <= userNumber) {
            System.out.println(number);
            number++;
        }
        // Write your code here
        
    }
}
