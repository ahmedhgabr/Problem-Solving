import java.io.PrintWriter;
import java.util.Scanner;

/**
 * A
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t= sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();

            pw.println((s.indexOf("1")< s.indexOf("3"))? "13" : "31");
        }

        pw.flush();
    }
}