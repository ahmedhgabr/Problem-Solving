import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            if (n % 2 == 0 ) {
                pw.println(2);
                pw.println(1 + " " + n);
                pw.println(1 + " " + n);
            } else {
                pw.println(4);
                pw.println(1 + " " + (n - 1));
                pw.println(1 + " " + (n - 1));
                pw.println(n - 1 + " " + n);
                pw.println(n - 1 + " " + n);
            }

        }
        pw.close();
    }
}
