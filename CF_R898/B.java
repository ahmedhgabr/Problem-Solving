import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class B {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            Arrays.sort(a);
            a[0]++;
            long res = a[0];
            for (int j = 1; j < n; j++) {
                res *= a[j] ;
            }
            pw.println(res);
        }

        pw.flush();
    }


}
