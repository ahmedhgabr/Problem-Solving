package Practice2;

import java.util.Arrays;
import java.util.Scanner;

public class A { // A. Increasing

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int[] input = new int[a];
            boolean isIncreasing = true;

            for (int j = 0; j < a; j++) {
                input[j] = sc.nextInt();
            }
            Arrays.sort(input);
            for (int j = 1; j < input.length; j++) {
                isIncreasing = input[j - 1] < input[j];
                if (!isIncreasing) {
                    System.out.println("NO");
                    break;
                }
            }

            if (isIncreasing) {

                System.out.println("YES");
            }

        }

        sc.close();

    }
}
