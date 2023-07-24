package Sheet2;

import java.io.PrintWriter;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String input = sc.next();
            int count0 = 0;
            int count1 = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '0')
                    count0++;
                if (input.charAt(j) == '1')
                    count1++;
            }

            if(count0 == count1)
                pw.println(count0-1);
            else if(count0 < count1)
                pw.println(count0);
            else
                pw.println(count1);

        }

        pw.flush();
    }
}
