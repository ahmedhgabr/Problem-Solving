package Sheet4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class E {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int l = sc.nextInt();
        sc.nextLine();

        Stack<Long> s = new Stack<>();
        long output = 0;
        s.push(1L);

        for (int i = 0; i < l; i++) {

            String curr = sc.nextLine();
            String curr0 = curr.split(" ")[0];
            if (curr0.equals("for")) {
                int loop = Integer.parseInt(curr.split(" ")[1]);
                s.push(loop * s.peek());
            } else if (curr0.equals("add")) {
                output += s.peek();
                if (output > Math.pow(2, 32) - 1)
                    break;
            } else { // end
                s.pop();
            }

        }

        pw.println((output < Math.pow(2, 32) - 1) ? output : "OVERFLOW!!!");

        pw.flush();
    }

}
