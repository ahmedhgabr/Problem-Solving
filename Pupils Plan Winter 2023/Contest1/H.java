package Contest1;

import java.io.PrintWriter;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw= new PrintWriter(System.out);
        long n = sc.nextLong();


        
        
        if (n%4 == 0){
            pw.println("Draw");
        }
        else{
            pw.println("Mohamed");
        }

        pw.flush();
        sc.close();
    }
}
