

import java.io.PrintWriter;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
          PrintWriter pw = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        int count =0 ;
        for(int i=1;i<=n;i++){
            if(x%i==0 && x/i<=n)
                count++;
        }
        pw.print(count);
        pw.flush();
        pw.close();
    }
}
