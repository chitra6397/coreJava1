package forLoopStudy;

import java.util.Scanner;

public class SimpleForLoop {
    public static void main(String[] args) {
        int n = 4;
        int m=5;
        //Scanner myObj = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=m;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
