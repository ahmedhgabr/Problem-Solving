package Practice2;

import java.util.Arrays;
import java.util.Scanner;

public class C {//C. Heist
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < input.length; i++) {
            input[i]= sc.nextInt();
        }

        Arrays.sort(input);

        System.out.println(input[input.length-1] - input[0]+ 1 - n);

    }
    
}
