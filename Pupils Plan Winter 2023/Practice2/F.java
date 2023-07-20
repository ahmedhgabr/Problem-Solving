package Practice2;

import java.util.Scanner;

public class F { // F. Where's the Bishop?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String output = "";
        for (int i = 0; i < t; i++) {
            int row = 0;
            int col = 0;
            String input = "";
            for (int j = 0; j < 8; j++) {
                input += sc.next();
            }
            for (int j = 9; j < input.length(); j++) {
                if (input.charAt(j) == '#' && input.charAt(j - 9) == '#' && input.charAt(j - 7) == '#' &&
                        input.charAt(j + 9) == '#' && input.charAt(j + 7) == '#') {
                    row = ceil(j/8);
                    col = j +1 - ((row-1)*8) ;
                }
            }

            output += row + " " + col+ "\n";

        }
        System.out.println(output);
        sc.close();
    }


    private static int ceil(double d){
        return ((int)d ) +1 ;
    }
}
