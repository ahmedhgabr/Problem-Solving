import java.io.PrintWriter;
import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int sum = 0;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'B') {
                    j += k - 1;
                    sum++;
                }

            }

            pw.println(sum);
        }

        pw.flush();
    }
}
