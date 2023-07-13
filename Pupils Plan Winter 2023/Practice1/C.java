package Practice1;

import java.util.Scanner;

public class C { // C. Nour is a young boy

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        String inputStr = input + "";
        int even = 0;
        int odd = 0;
        int prime = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            int curr = Integer.parseInt(inputStr.charAt(i)+"") ;
            if( curr %2 == 0){
                even++;
            }
            else{
                odd++;
            }

            if(isPrime(curr)){
                prime++;
            }
        }

        System.out.print(even + " "+ odd + " "+ prime);

    }

    private static boolean isPrime(int curr) {
        
        if (curr < 2)
            return false ;
        for (int i = 2; i < curr; i++) {
            if(curr % i == 0){
                return false;
            }
        }
        return true;
    }
}
