package Contest1;

import java.io.PrintWriter;
import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long s = sc.nextLong();

        long curr = b;
        long output = a ^ b;

        if (s%3 == 0) {
            pw.println(a);
        } else if (s%3 == 1) {
            pw.println(b);
        } else {
            pw.println(output);
        }

        pw.flush();
    }

}
