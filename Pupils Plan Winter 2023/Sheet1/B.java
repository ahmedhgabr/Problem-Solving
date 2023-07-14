package Sheet1;

import java.util.Scanner;

public class B { // B. Beautiful Year
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        for (int i = year+1; i <= 2147483647; i++) {
            if (isDistinct(i)) {
                System.out.println(i);
                break;
            }
        }

    }

    private static boolean isDistinct(int year) {
        String yearStr = year + "";
        int firstD = year % 10;
        int secondD = (year / 10) % 10;
        int thirdD = (year / 100) % 10;
        int fourthD = (year / 1000);
        if (firstD != secondD && firstD != thirdD && firstD != fourthD &&
                secondD != thirdD && secondD != fourthD &&
                thirdD != fourthD) {
            return true;
        }
        else{
            return false ;
        }

    }

}
