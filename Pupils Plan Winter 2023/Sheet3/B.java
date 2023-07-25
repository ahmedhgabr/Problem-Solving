package Sheet3;

import java.io.PrintWriter;
import java.util.Scanner;

public class B { // B. Vitya in the Countryside

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        if (input[n - 1] == 0) {
            pw.print("UP");
        } else if (input[n - 1] == 15) {
            pw.print("DOWN");
        } else if (n < 2) {
            pw.print(-1);
        } else if (input[n - 2] < input[n - 1]) { // 0 1
            pw.print("UP");
        } else if (input[n - 2] > input[n - 1]) { // 0 1
            pw.print("DOWN");
        } else {
            pw.print(-1);
        }

        pw.flush();

    }
}
