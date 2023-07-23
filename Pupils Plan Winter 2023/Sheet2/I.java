package Sheet2;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] take = new int[n];
            int[] give = new int[n];

            Pair[] pairs = new Pair[n];

            for (int j = 0; j < n; j++) {
                take[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                give[j] = sc.nextInt();
            }

            for (int j = 0; j < give.length; j++) {
                pairs[j]=new Pair(take[j], give[j]) ;
            }

            Arrays.sort(pairs);

            for (int j = 0; j < n; j++) {
                if (pairs[j].x <= k) {
                    k += pairs[j].y;
                } else {
                    break;
                }

            }

            pw.println(k);
        }

        pw.flush();

    }

    static class Pair implements Comparable {

        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Object o) {
            Pair p = (Pair) o;
            if (this.x == p.x) {
                return ((Integer) this.y).compareTo(p.y);
            }
            return ((Integer) this.x).compareTo(p.x);

        }

    }

}
