package Sheet1;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String input = sc.next();

        
        
        System.out.println(size - noDuplicate(input).length());
        
    }

    private static void isDuplicate(String input) {
        
    }

    private static String noDuplicate(String input) {
        String res = input.charAt(0)+"";
        for (int i = 0; i < input.length()-1; i++) {
            if(input.charAt(i) != input.charAt(i+1)){
                
                res += input.charAt(i +1);
            }
            
        }
        return res;
    }


}
