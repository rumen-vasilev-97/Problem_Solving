//Print Fibonacci numbers up to N

import java.util.Scanner;

public class R_2_Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double phi = 1.61803398875;
        int f1;
        int f2 = 1;
        int f3 = 1;

        if (N >= 1) {
            System.out.print(1);
            int n = (int) (Math.floor(Math.log(N) / Math.log(phi)));
            for (int i = 0; i < n; i++) {
                System.out.printf(", %d", f3);
                f1 = f2;
                f2 = f3;
                f3 = f1 + f2;
            }
        }

        while (f3 <= N) {
            System.out.printf(", %d", f3);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
}
