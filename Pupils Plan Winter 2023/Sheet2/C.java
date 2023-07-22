package Sheet2;

import java.util.Scanner;

public class C { // C. Wet Shark and Odd and Even

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        long min = Long.MAX_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
            sum += input[i];
            if(input[i]%2 != 0){
                min = Math.min(min, input[i]) ;
            }
        }

        if(sum%2 != 0){
            sum -= min ;
        }

        System.out.println(sum);
        sc.close();
    }

}
