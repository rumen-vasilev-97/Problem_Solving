// Find all Kaprekar Numbers between 1 and 1 000 000.

import java.lang.Math;

public class R_1_Kaprekar_Numbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000000; i++) {
            int n = String.valueOf(i).length();
            if (Math.floor((i*i) % (Math.pow(10, n)) + (i*i) / (Math.pow(10, n))) == i) {
                System.out.println(i);
            }
        }
    }
}
