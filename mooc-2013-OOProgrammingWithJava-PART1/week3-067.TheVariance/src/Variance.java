import java.util.ArrayList;

import static java.lang.StrictMath.sqrt;

public class Variance {
    //sum from exercise 63
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int item : list) {
            sum+= item;
        }
        return sum;
    }
    
    //average from exercise 64
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {

        // write code here
        double variance = 0;
        int i = 0;
        while (i < list.size()) {
            variance = (sqrt(list.get(i) - average(list)));
            i++;

        }
        return variance / 4-1;


        // ... / n-1 for Bessel's correction
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));

    }

}
