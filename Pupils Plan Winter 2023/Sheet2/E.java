package Sheet2;

import java.io.PrintWriter;
import java.util.Scanner;

public class E { //E - Square String?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < t; i++) {
            String input = sc.next();
            if (input.length() % 2 == 0) {
                String first = input.substring(0, (input.length() / 2));
                String last = input.substring(input.length() / 2, input.length() );

                pw.println(first.equals(last)?"YES":"NO");
            } else {
                pw.println("NO");
            }
        }

        pw.flush();

    }
}
