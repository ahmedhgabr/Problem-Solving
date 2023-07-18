package Practice2;

import java.util.ArrayList;
import java.util.Scanner;

public class A { // A. Increasing

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            ArrayList<Integer> input = new ArrayList<Integer>();
            boolean isEqual = false;

            for (int j = 0; j < a; j++) {
                int test = sc.nextInt();
                if (input.contains(test)) { // check for equal values (not Increasing)
                    System.out.println("NO");
                    isEqual = true;
                    break;
                } else {
                    input.add(test);
                }
            }

            if (!isEqual) { // no equal values means can be rearrange to be Increasing
                System.out.println("YES");
            }

        }

        sc.close();

    }
}
