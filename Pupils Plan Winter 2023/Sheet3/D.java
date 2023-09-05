

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        Integer n = sc.nextInt();
        Integer m = sc.nextInt();
        int z = sc.nextInt();

        sc.close();

        ArrayList<Integer> calls = new ArrayList<Integer>();
        int output = 0;

        for (int i = 1; i * n <= z; i++) {
            calls.add(i * n);
        }
        output = calls.size();
        for (int i = 1; i * m <= z; i++) {
            Integer p = i * m;
            calls.remove(p);
        }
        
        output -= calls.size();

        pw.print(output);
        pw.flush();
    }

}
