import java.util.ArrayList;

public class Variance {
    //sum from exercise 63
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int item : list) {
            sum += item;
        }
        return sum;
    }

    //average from exercise 64
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {

        // write code here
        double average = average(list);
        double variance = 0;
        int i = 0;
        while (i <= list.size()-1) {
            System.out.println("execution list pos:" + i);

            variance += Math.pow(list.get(i) - average, 2);
            i++;

        }
        System.out.println("above loop calculation is: " + variance);
        return variance / (list.size() - 1);


        // ... / n-1 for Bessel's correction
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("The variance is: " + variance(list));
    }

}
