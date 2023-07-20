package Practice2;

import java.util.*;
import java.io.*;

public class D { // D - Tired of Studying DSD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int input = sc.nextInt();
        sc.close();

        if (input % 2 == 1) {
            pw.print("7");
            input -= 3;
        }

        while (input > 1) {
            pw.print("1");
            input -= 2;
        }
        
        pw.flush();

    }
}
