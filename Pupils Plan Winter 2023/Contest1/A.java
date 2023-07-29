package Contest1;

import java.io.PrintWriter;
import java.util.Scanner;

public class A { // A. Sum

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b == c) {
                pw.println("YES");
            } else if (b + c == a) {
                pw.println("YES");
            } else if (c + a == b) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }

        pw.flush();

    }

}
