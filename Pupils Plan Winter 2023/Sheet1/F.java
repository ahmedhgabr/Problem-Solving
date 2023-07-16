package Sheet1;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        for (int i = 0; i < tests; i++) {
            String input = sc.next();
            if (input.length() > 10) {
                System.out.println(input.charAt(0)+"" + (input.length() - 2) +""+ input.charAt(input.length() - 1) );
            } else {
                System.out.println(input);
            }
        }
    }
}
