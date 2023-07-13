package Practice1;

import java.util.Scanner;

public class D {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String first = input.substring(0, input.length()/2);
        String last = input.substring(input.length()- (input.length()/2)  , input.length());

        

        if( check(first , last) ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }

    private static boolean check(String first , String last) {
        
        for (int i = 0 ; i < first.length(); i++) {
            if(first.charAt(i) != last.charAt(last.length()-i-1))
                return false ;
        }
        
        return true ;
    }
}