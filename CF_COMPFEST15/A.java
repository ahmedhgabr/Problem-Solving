import java.io.PrintWriter;
import java.util.Scanner;

/**
 * A
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            input = Math.abs(input);
            min = Math.min(min, input);
        }

        pw.println(min);
        pw.flush();
    }

    // O(log(min(a,b))
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // O(log(min(a,b))
    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

}