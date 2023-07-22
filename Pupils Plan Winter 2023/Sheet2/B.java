package Sheet2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = sc.next().toLowerCase();
        boolean[] check = new boolean[26];
        if (n < 26) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < n; i++) {
                check[input.charAt(i) - 'a'] = true;
            }
            boolean output = true;
            for (int i = 0; i < check.length; i++) {
                output &= check[i];
            }

            System.out.println(output ? "YES" : "NO");
        }
    }
}
