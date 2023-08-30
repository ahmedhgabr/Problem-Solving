import java.io.PrintWriter;
import java.util.Scanner;


public class A { //Channel

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int q = sc.nextInt();
            boolean all = false;
            boolean maybe = false;
            int gone = 0;
            int come = a;
            String s = sc.next();

            if (a == n) {
                maybe = true;
                if (gone >= 0) {
                    all = true;
                }
            } else {

                for (int j = 0; j < q; j++) {
                    if (s.charAt(j) == '+') {
                        a = a + 1;
                        gone += 1;
                        come += 1;
                    } else if (s.charAt(j) == '-') {
                        a = a - 1;
                        gone -= 1;
                    }

                    if (a == n) {
                        maybe = true;
                        if (gone >= 0) {
                            all = true;
                            break;
                        }
                    }
                    if (come >= n) {
                        maybe = true;
                    }
                }
            }

            if (all) {
                pw.println("YES");
            } else if (maybe) {
                pw.println("MAYBE");
            } else {
                pw.println("NO");
            }
        }

        pw.flush();
    }
}