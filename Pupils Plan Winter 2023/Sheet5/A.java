package Sheet5;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class A { // A. Registration system

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();

        HashMap<String, Integer> promptTracker = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            if (promptTracker.get(input) == null) {
                promptTracker.put(input, 1);
                pw.println("OK");
            } else {
                int temp = promptTracker.replace(input, promptTracker.get(input) + 1);
                String prompt = input + temp;

                pw.println(prompt);
            }

        }
        pw.flush();
    }

}
