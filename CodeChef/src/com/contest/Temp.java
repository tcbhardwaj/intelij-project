package com.contest;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String V = sc.nextLine();
        int N = sc.nextInt();
        int m = V.length();
        int i = 0;
        sc.nextLine();
        while(i<N) {
            String B = sc.next();

            int n = B.length();

            boolean res = isSubSequence(B, V, n, m);
            if (res)
                System.out.println("POSITIVE");
            else
                System.out.println("NEGATIVE");
            i++;
        }


    }

    static boolean isSubSequence(String str1, String str2,
                                 int m, int n)
    {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        // If last characters of two strings are matching
        if (str1.charAt(m - 1) == str2.charAt(n - 1))
            return isSubSequence(str1, str2, m - 1, n - 1);

        // If last characters are not matching
        return isSubSequence(str1, str2, m, n - 1);
    }
}
