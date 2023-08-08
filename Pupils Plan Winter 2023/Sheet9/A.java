package Sheet9;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            HashMap<Integer, Integer> h = new HashMap<>();

            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int j = 0; j < m; j++) {

                int u = sc.nextInt();
                int v = sc.nextInt();
                if (h.keySet().contains(u)) {
                    h.replace(u, h.get(u) + 1);
                } else {

                    h.put(u, 1);
                }

                if (h.keySet().contains(v)) {
                    h.replace(v, h.get(v) + 1);
                } else {
                    h.put(v, 1);
                }

            }

            int x = 0;
            int y = 0;

            for (int k : h.keySet()) {
                if (h.get(k) == 1) {
                    y++;
                } else {
                    x++;
                }
            }

            x--;
            y /= x;
            pw.println(x + " " + y);

        }

        pw.flush();

    }

}
