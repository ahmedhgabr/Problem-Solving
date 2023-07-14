package Sheet1;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int problems = sc.nextInt();
        int[] views = new int[problems];
        for (int i = 0; i < problems*3; i++) {
            views[i/3] += sc.nextInt();
        }
        
        int res =0;
        for (int i = 0; i < views.length; i++) {
            if(views[i] >= 2 ){
                res++;
            }
        }

        System.out.println(res);
    }
}
