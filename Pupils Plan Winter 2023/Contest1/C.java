package Contest1;

import java.io.PrintWriter;
import java.util.Scanner;

public class C {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        String s = "";
        for(int i=0;i<n;i++)
            s+=sc.next();
        if(n<4)
            pw.println(":(");
        else if(s.contains("n") && s.contains("o") && s.contains("u") && s.contains("r"))
            pw.println(":)");
        else
            pw.println(":(");

        pw.flush();
    }
}
