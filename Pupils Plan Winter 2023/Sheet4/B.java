package Sheet4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class B { //B - Alternating Current
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String input = sc.nextLine();
        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);

            if (  !s.isEmpty() && curr == s.peek()) {
                s.pop();
            } else {
                s.push(curr);
            }

        }

        if (s.isEmpty()) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }

        pw.flush();
    }
}
