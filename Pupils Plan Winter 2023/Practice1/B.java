package Practice1;

import java.util.Scanner;

public class B {//B. Can You Count ?
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int target = sc.nextInt();
        int res = 0;

        for (int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            if(temp == target)
                res++;
        }
        
        System.out.println(res);

    }
}
