package Practice2;

import java.util.Scanner;

public class E { // E. I love AAAB
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            String input = sc.next();
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'A') {
                    count++;
                } else  { //input.charAt(j) == 'B' && count > 0
                    count--;
                    if(count < 0){
                        break;
                    }
                }
                
            }

            if ( count >= 0 && input.length()>=2 && input.charAt(0)== 'A' && input.charAt(input.length()-1)== 'B') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

        sc.close();
    }

}
