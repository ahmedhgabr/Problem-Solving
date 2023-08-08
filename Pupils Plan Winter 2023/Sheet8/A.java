package Sheet8;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class A {

    static int[] input;
    static char a = 'a';
    static HashMap<Integer, String> tele;
    static Stack<String> output = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        tele = new HashMap<>();

        for (int i = 2; i <= 9; i++) {
            String temp = "";
            temp += a++;
            temp += a++;
            temp += a++;
            if (i == 7 || i == 9) {
                temp += a++;
            }
            tele.put(i, temp);
        }

        int n = sc.nextInt();
        input = new int[n];

        String in = sc.next();
        for (int i = 0; i < n; i++) {
            input[i] = Integer.valueOf(in.charAt(i) + "");
        }
        gen(0, 0, "");

        while (!output.isEmpty()) {
            pw.println(output.pop());
        }
        pw.flush();

    }

    private static void gen(int i, int c, String s) {

        if (s.length() == input.length) {
            output.push(s);
            return;
        }
        if (i >= input.length) {
            return;
        }

        if (c >= tele.get(input[i]).length()) {
            return;
        }

        gen(i, c + 1, s);
        s += tele.get(input[i]).charAt(c);
        gen(i + 1, 0, s);
    }
}
