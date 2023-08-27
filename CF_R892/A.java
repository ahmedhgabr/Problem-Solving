import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A { // A. United We Stand
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();

            long[] arr = new long[a];

            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextLong();
            }

            ArrayList<Long> b = new ArrayList<>();
            ArrayList<Long> c = new ArrayList<>();

            Arrays.sort(arr);

            int index = 0;
            if (arr[0] == arr[arr.length - 1]) {
                pw.println(-1);
                continue;
            }
            for (int j = 1; j < a; j++) {
                if (arr[j] != arr[j - 1]) {
                    index = j;
                    break;
                }
            }

            for (int j = 0; j < index; j++) {
                b.add(arr[j]);
            }

            for (int j = index; j < a; j++) {
                c.add(arr[j]);
            }

            if (c.size() == 0 || b.size() == 0) {
                pw.println(-1);
            } else {
                pw.println(b.size() + " " + c.size());
                for (int j = 0; j < b.size(); j++) {
                    pw.print(b.get(j) + " ");
                }
                pw.println();
                for (int j = 0; j < c.size(); j++) {
                    pw.print(c.get(j) + " ");
                }
                pw.println();
            }

        }

        pw.close();
    }
}
