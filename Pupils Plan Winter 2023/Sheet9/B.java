package Sheet9;

import java.io.PrintWriter;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = sc.next();
        String t = sc.next();

        int c = 0;
        while (s.contains(t)) {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(0)) {
                    
                        if (s.substring(i, t.length()).equals(t)) {
                            c++;
                            s = s.substring(0, i) + s.substring(i+t.length());
                        }
                    
                }
                
            }
            

        }

        pw.print(c);
        pw.flush();
    }
}
