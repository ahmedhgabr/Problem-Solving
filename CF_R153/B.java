import java.io.PrintWriter;
import java.util.Scanner;

/**
 * B
 */
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int k = sc.nextInt();
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            int w = m / k; // needed a2
            int r = (m % k); // needed a1
            // pw.println(w + " " + r + ".................");

            w -= a2;

            if (w > 0 && r < a1) {
                a1 -= r;
                r = 0;
                w -= (a1 / k);
            } else {
                r -= a1;
            }

            if (w < 0) {
                w = 0;
            }

            if (r < 0) {
                r = 0;
            }

            pw.println(w + r);

        }
        pw.close();
    }
}