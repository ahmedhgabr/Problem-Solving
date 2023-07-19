package Practice2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();

        if(x %2 == 0 || y %2 == 0){ // x , y can not be even
            System.out.println(":(");
        }
        else{
            System.out.println(1);
        }

    }
}
