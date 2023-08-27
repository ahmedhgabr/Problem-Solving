
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B { // B. Olya and Game with Arrays

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt(); // number of arrays
            ArrayList<Long> arrMin = new ArrayList<>(); // min
            ArrayList<Long> arrMin2 = new ArrayList<>(); // 2nd min
            int min2i = 0;
            for (int j = 0; j < n; j++) {
                int m = sc.nextInt(); // size of array
                ArrayList<Long> arr = new ArrayList<>();

                for (int k = 0; k < m; k++) {
                    arr.add(sc.nextLong());
                }
                Collections.sort(arr);
                arrMin.add(arr.get(0));
                arrMin2.add(arr.get(1));
                if (Math.min(arrMin2.get(min2i), arr.get(1)) == arr.get(1)) {
                    min2i = j;
                }
            }
            arrMin2.remove(min2i);
            Collections.sort(arrMin);

            arrMin2.add(arrMin.get(0));
            long sum =0 ;
            for(int j = 0; j < arrMin2.size(); j++){
                sum += arrMin2.get(j);
            }
            pw.println(sum );
        }
        pw.flush();
    }
}