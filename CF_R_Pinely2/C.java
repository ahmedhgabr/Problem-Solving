import java.io.PrintWriter;
import java.util.Scanner;

public class C { //MEX Repetition
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int a= sc.nextInt();
            long k = sc.nextLong();

            long[] arr = new long[a];
            boolean[] found = new boolean[a+1];

            for(int j=0;j<a;j++){
                arr[j] = sc.nextInt();
                found[(int)arr[j]] = true;
            }

            

            for (int j = 0; j < k; j++) {
                for (int l = 0; l < arr.length; l++) {
                    long temp = arr[l];
                    arr[l] = findMex(found);
                    found[(int)temp] = false;
                }
            }
            
            for (int j = 0; j < arr.length; j++) {
                pw.print(arr[j]+" ");
            }
            pw.println();
        }
        pw.flush();

    }

    private static long findMex(boolean[] found) {
        for(int i=0;i<found.length;i++){
            if(!found[i]){
                found[i] = true;
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }


}
