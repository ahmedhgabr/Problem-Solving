package Sheet6;

import java.io.PrintWriter;
import java.util.Scanner;

public class M {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            if (n == m) {
                pw.println("YES");
            } else {
                pw.println(check(n, m) ? "YES" : "NO");
            }

        }

        pw.flush();
    }

    private static boolean check(long n, long m) {

        if (n == m) {
            return true;
        }
        if (n < m) {
            return false;
        }
        if (n % 3 != 0) {
            return false;
        }

        long small = n / 3;
        long big = small * 2;

        return check(big, m) || check(small, m);

    }
}
