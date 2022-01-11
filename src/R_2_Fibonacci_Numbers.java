//Print Fibonacci numbers up to N

import java.util.Scanner;

public class R_2_Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int f1;
        int f2 = 1;
        int f3 = 1;

        if (N >= 1) {
            System.out.print("0, 1");
            while (f3 <= N) {
                System.out.printf(", %d", f3);
                f1 = f2;
                f2 = f3;
                f3 = f1 + f2;
            }
        } else if (N==0) {
            System.out.println(0);
        }

    }
}