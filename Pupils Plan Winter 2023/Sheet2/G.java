package Sheet2;

import java.util.Scanner;

public class G { //G - Rewards
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a1 =sc.nextInt();
        int a2 =sc.nextInt();
        int a3 =sc.nextInt();

        int b1 =sc.nextInt();
        int b2 =sc.nextInt();
        int b3 =sc.nextInt();

        int n =sc.nextInt();


        int cups = a1 + a2 + a3 ;
        int medals = b1 + b2 + b3 ;

        int need = ceil(cups /5.0) + ceil(medals / 10.0) ;

        if (n >= need){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    private static int ceil(double d) {
        if ((int) d < d)
            return ((int) d) + 1;
        else
            return (int) d;
    }

}
