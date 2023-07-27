package Sheet3;

import java.io.PrintWriter;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long first = sc.nextLong();
        long fav = sc.nextLong();
        long diff = sc.nextLong();

        try {
            if (Math.abs(fav - first) % diff == 0)
                pw.println("YES");
            else
                pw.println("NO");
        } catch (Exception e) {
            if (first == fav)
                pw.println("YES");
            else
                pw.println("NO");
        }

        pw.flush();
        sc.close();
    }
}
