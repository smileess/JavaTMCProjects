public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
/*  LOOP USAGE
        for (int i = 0; i < amount; i++) {
            System.out.print("*");

        }
        System.out.println();
    RECURSION USAGE */
        if (amount == 0) {
            System.out.println();
        } else {
            System.out.print("*");
            printStars(amount - 1);
        }
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        if (amount == 0) {

        } else {
            System.out.print(" ");
            printWhitespaces(amount - 1);
        }
    }

    //    public static void printTriangle(int size) {
//        // 40.2
//        int spaces = size - 1;
//        for (int i = 0; i <= size; i++) {
//
//            printWhitespaces(spaces--);
//            printStars(i+1);
//
//        }
//
//    }
//  OR WHILE:
    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        int spaces = size - 1;

        while (i <= size) {
            printWhitespaces(spaces);
            spaces--;
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int spaces = height - 1;
        for (int i = 0; i < height; i++) {
            printWhitespaces(spaces--);
            printStars(2 * i + 1);
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printTriangle(4);

    }
}