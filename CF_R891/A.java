import java.io.PrintWriter;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int odd = 0;
            for (int j = 0; j < n; j++) {
                int curr = sc.nextInt();
                if (curr % 2 != 0) {
                    odd++;
                }
            }
            pw.println((odd % 2 == 0) ? "YES" : "NO");
        }

        pw.flush();
    }

}