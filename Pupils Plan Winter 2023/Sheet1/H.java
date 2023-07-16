package Sheet1;

import java.util.Scanner;

public class H {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n];
        int[] count = new int[5]; // count of group members can only be 1,2,3 or 4

        for (int i = 0; i < n; i++) {
            input[i]  = sc.nextInt();
            count[ input[i] ]++; 
        }

        int output = count[4] + count[3] + (count[2] ) / 2;
        if(count[2] %2 != 0){
             count[1] = count[1]-2 ;
             output++;
        }

        if (count[1] > count[3]) {
            output += (count[1] - count[3] + 3) / 4;
        }
        System.out.println(output);

    }

}
