package Sheet4;

import java.io.PrintWriter;
import java.util.Scanner;

public class A { //A - Regular Bracket Sequence
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String input = sc.nextLine();

        int count = 0;
        int output = 0;
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr == '(') {
                count++;
            } else if (curr == ')' && count > 0) {
                count--;
                output += 2;
            }

        }

        pw.println(output);
        pw.flush();

    }

}
