package Contest1;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

             for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
                max = Math.max(sum - (entry.getKey() * entry.getValue()) + (x * entry.getValue()), max);
            }

            pw.println(max);
        }
        pw.flush();
    }

}
