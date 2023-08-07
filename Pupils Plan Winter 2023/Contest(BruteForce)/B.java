import java.io.PrintWriter;
import java.util.Scanner;

public class B {

    static boolean output = false;
    static int n;
    static int x;
    static int[] input;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        n = sc.nextInt();
        x = sc.nextInt();

        input = new int[n];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        evalute(0, input[0]);

        pw.println(output ? "YES" : "NO");
        pw.flush();
    }

    private static void evalute(int i, int c) {
        // System.out.println(c);
        i++;
        if (i == input.length) {
            if (c == x) {
                // System.out.println(i + " xxxxx " + c);
                output = true;
            }
            return;
        }

        // System.out.println("add");
        evalute(i, c + input[i]);

        // System.out.println("sub");
        evalute(i, c - input[i]);

        // System.out.println("mul");
        evalute(i, c * input[i]);

        // System.out.println("------------------");

    }

}
