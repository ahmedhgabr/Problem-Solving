import java.io.PrintWriter;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int safe = Integer.MAX_VALUE;
            for (int j = 0; j < a; j++) {
                int d = sc.nextInt();
                int s = sc.nextInt();

                if (d > safe) {
                    continue;
                }
                safe = Math.min(safe, ((s - 1) / 2) + d);
            }
            pw.println(safe);
        }
        pw.close();
    }

}
