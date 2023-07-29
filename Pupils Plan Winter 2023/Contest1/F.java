package Contest1;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class F {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long x = sc.nextInt();

            HashMap<Integer, Integer> hash = new HashMap<>();

            int sum = 0;

            for (int j = 0; j < n; j++) {
                int input = sc.nextInt();
                if (hash.containsKey(input)) {
                    hash.put(input, hash.get(input) + 1);
                } else {
                    hash.put(input,  1);
                }

                sum += input;
            }
            long max = sum;

            Set<Integer> h = hash.keySet();
            for (Integer j : h) {
                max = Math.max(sum - (j * hash.get(j)) + (x * hash.get(j)), max);
            }

            pw.println(max);
        }
        pw.flush();
    }

}
