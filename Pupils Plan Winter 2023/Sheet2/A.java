package Sheet2;

import java.io.PrintWriter;
import java.util.Scanner;

public class A { //A. Hulk

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (i > 0) {
                    pw.print("that ");
                }
                pw.print("I hate ");

            } else {
                pw.print("that I love ");
            }
        }
        pw.print("it");

        pw.flush();
    }

}
