package Sheet2;

import java.io.PrintWriter;
import java.util.Scanner;

public class F { // F. Linear Keyboard
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String key = sc.next();
            String word = sc.next();

            int old = key.indexOf(word.charAt(0));

            int output = 0;
            for (int j = 1; j < word.length(); j++) {
                int curr = key.indexOf(word.charAt(j));
                output += Math.abs(curr - old);
                old = curr;
            }

            pw.println(output);

        }
        pw.flush();
        sc.close();

    }

}
