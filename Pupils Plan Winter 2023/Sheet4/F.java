package Sheet4;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        if (k == 0) {
            pw.println((a[0] - 1 > 0) ? 1 : -1);
        } else
            pw.println((a[k] != a[k - 1]) ? a[k - 1] : -1);
        pw.flush();

    }

}
