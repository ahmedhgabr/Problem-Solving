package Sheet4;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class G {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();

        ArrayList<String> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(sc.next());
        }

        Collections.sort(input, (a, b) -> (a.length() - b.length()));

        boolean flag = true;
        for (int i = 1; i < n; i++) {
            if (!input.get(i).contains(input.get(i - 1))) {
                flag = false;
                break;
            }

        }

        if (flag) {
            pw.println("YES");
            for (int i = 0; i < n; i++) {
                pw.println(input.get(i));
            }
        } else {
            pw.println("NO");
        }

        pw.flush();
    }

}
