import java.io.PrintWriter;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            
            String s = sc.next();
            int courpt = 0;
            if(s.charAt(0) != 'a')
                courpt++;   
            if(s.charAt(1) != 'b')
                courpt++;
            if(s.charAt(2) != 'c')
                courpt++;
            
            if(courpt < 3)
                pw.println("YES");
            else
                pw.println("NO");
        }

        pw.flush();
    }
    
}