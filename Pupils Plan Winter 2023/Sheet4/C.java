package Sheet4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int[] wall = new int[n];
        for (int i = 0; i < n; i++) {
            wall[i] = sc.nextInt();
        }

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < wall.length; i++) {
            if (!s.isEmpty() && s.peek() % 2 == wall[i] % 2) {
                s.pop();
            } else {
                s.push(wall[i]);

            }

        }

        pw.println((s.size() <= 1) ? "YES" : "NO");
        pw.flush();
    }

}
