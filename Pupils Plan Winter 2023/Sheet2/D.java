package Sheet2;

import java.util.Scanner;

public class D { //D - Theatre Square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double a = sc.nextInt();

        long h = ceil(n / a);
        long w = ceil(m / a);

        System.out.println(h * w);

    }

    private static int ceil(double d) {
        if ((int) d < d)
            return ((int) d) + 1;
        else
            return (int) d;
    }

}
