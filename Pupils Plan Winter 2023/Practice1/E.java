package Practice1;

import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int size = 8;
        String res = "";
        for (int i = 0; i < count; i++) {

            String[] board = new String[size];
            for (int j = 0; j < size; j++) {
                board[j] = sc.next();
            }

            res += ((isRed(board)) ? "R" : "B") + "\n";

        }
        System.out.println(res.trim());
        sc.close();
    }

    private static boolean isRed(String[] board) {

        for (int i = 0; i < board.length; i++) {
            if (!board[i].contains("B")) {
                return true;
            }
        }

        return false;
    }

}
