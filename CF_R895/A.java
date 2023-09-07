import java.io.PrintWriter;
import java.util.Scanner;

/**
 * A
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            double res = (Math.abs(a-b))*1.0 / 2 ;
            res = Math.ceil(res/c);
            pw.println((int)res);
        }
        pw.close();
    }
}