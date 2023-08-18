import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int n = s.length();

            String right = "(".repeat(n);
            String left = ")".repeat(n);

            String ans1 = right + left;

            String ans2 = "()".repeat(n);

            if(!ans1.contains(s)){
                pw.println("YES\n"+ans1);
            }
            else if(!ans2.contains(s)){
                pw.println("YES\n"+ans2);
            }
            else{
                pw.println("NO");
            }
            
        }

        pw.close();
    }
}
