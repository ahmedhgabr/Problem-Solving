import java.io.PrintWriter;
import java.util.Scanner;

public class C {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int minW = Integer.MAX_VALUE;
            int output = 0;
            for (int j = 0; j < n; j++) {
                int curr = sc.nextInt();
                if (curr < min) {
                    min = curr;
                    
                }
                if (curr > min && curr < minW) {
                    output++;
                    minW = curr;
                }
            }
            pw.println(output);
        }

        pw.flush();
    }
}
