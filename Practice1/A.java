package Practice1;

import java.util.Scanner;

public class A { // A. Exrema

    public static void main(String[] args) {
        int t = 3; // count of inputs 
        long[] numbers = new long[t];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
           numbers[i]= sc.nextLong();
        }
        
        System.out.println(min(numbers));
        System.out.println(max(numbers));
        sc.close();

        // could use sort O(nlogn) and find max and min in O(1)  
    }

    static long max(long[] numbers){
        long max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max)
                max= numbers[i];
        }
        return max ;
    }

    static long min(long[] numbers){
        long min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min)
                min= numbers[i];
        }
        return min ;
    }
}