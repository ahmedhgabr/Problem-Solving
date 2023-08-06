package Sheet5;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        HashMap<String, String> names = new HashMap<>();

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String old = sc.next();
            String newN = sc.next();

            if (names.containsKey(old)) {
                names.put(newN, names.remove(old));
            } else {
                names.put(newN, old);
            }

        }

        Set<String> k = names.keySet();
        pw.println(k.size());
        for (String newN : k) {
            pw.println(names.get(newN) + " " + newN);
        }

        pw.flush();

    }

}
