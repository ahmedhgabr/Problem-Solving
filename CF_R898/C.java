import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class C {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                String s = sc.next();
                for(int k = 0; k < 10; k++){
                    if(s.charAt(k) == 'X')
                        sum += getCost(j, k);
                }
            }
            
            pw.println(sum);
        }

        pw.flush();
    }

    private static int getCost(int j, int k) {
        if(j == 0 || k == 0 || j == 9 || k == 9)
            return 1;
        else if(j == 1 || k == 1 || j == 8 || k == 8)
            return 2;
        else if(j == 2 || k == 2 || j == 7 || k == 7)
            return 3;
        else if(j == 3 || k == 3 || j == 6 || k == 6)
            return 4;
        else if(j == 4 || k == 4 || j == 5 || k == 5)
            return 5;
        else
            return 0;
    }

}
