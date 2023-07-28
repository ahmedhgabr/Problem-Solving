package Sheet3;

import java.io.PrintWriter;
import java.util.Scanner;


public class H{

    static int f(int n){
        int newN = 1;
        while(n > 0){
            if(n%10 != 0)
                newN *= n%10;
            n /= 10;
        }
        return newN;
    }

    static int g(int n){
        if(n < 10)
            return n;
        return g(f(n));
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        

        int maxN = 1000001;
        int[][] a = new int[10][maxN];
        for(int i=1; i<maxN ;i++){
            int k = g(i);
            a[k][i]++;
        }
        for(int i=0; i<10 ;i++)
            for(int j=1; j<maxN ;j++)
                a[i][j] += a[i][j-1];
        int q = sc.nextInt();
        while(q-->0){
            int l = sc.nextInt() , r = sc.nextInt() , k = sc.nextInt();
            pw.println(a[k][r] - a[k][l-1]);
        }
        pw.flush();
    }
}
