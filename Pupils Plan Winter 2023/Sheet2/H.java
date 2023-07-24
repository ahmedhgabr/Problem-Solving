package Sheet2;

import java.io.PrintWriter;
import java.util.Scanner;

public class H { //H - Andryusha and Socks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();

        boolean[] socks = new boolean[n+1];
        int onTable = 0;
        int max = 0 ;

        for (int i = 0; i < n * 2; i++) {
            Integer curr = sc.nextInt();
            if (socks[curr]) {
                onTable-- ;
            } else {
                socks[curr] = true;
                onTable++;
            }

            if (max < onTable)
                max = onTable;

        }
        pw.print(max);
        pw.flush();
        sc.close();
    }

}
