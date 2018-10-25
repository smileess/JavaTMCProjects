import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number.: ");
        int n = Integer.parseInt(reader.nextLine());

        int sum = 1; //defining 0! = 1
        int i = 0;

        while (i < n) {

            i++;
            sum*= i; // another way of saying sum = sum * i
        }
        System.out.println("Factorial is.: "+sum);
    }
}
