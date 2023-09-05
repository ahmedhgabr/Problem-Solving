import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] arrQ1 = new int[n];
        int[] arrQ2 = new int[n];
        for (int i = 0; i < n; i++) { // take the input
            arrQ1[i] = sc.nextInt();
            arrQ2[i] = arrQ1[i];
        }
        Arrays.sort(arrQ2);

        long[] pre1 = new long[n];
        long[] pre2 = new long[n];
        pre1[0] = arrQ1[0];
        pre2[0] = arrQ2[0];
        for (int i = 1; i < n; i++) { // find the prefix sum
            pre1[i] = pre1[i - 1] + arrQ1[i];
            pre2[i] = pre2[i - 1] + arrQ2[i];
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int type = sc.nextInt();
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            // l is inclusive so we subtract 1 
            // if l = 0 then we need to subtract pre[r]-0 = pre[r] 
            if (type == 1) {
                pw.print((l == 0) ? pre1[r]  :pre1[r] - pre1[l-1]);
            }
            else{
                pw.print((l == 0) ? pre2[r]  : pre2[r] - pre2[l-1]);
            }
            pw.println();
        }

        pw.flush();
    }
}
