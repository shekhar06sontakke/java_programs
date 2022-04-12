package com.codejargon;

/**
 * https://www.javatpoint.com/java-program-to-ind-all-the-permutations-of-a-string
 */
public class Program_FindAllCombinationsOfABC {
    public static void main(String[] args) {
        String str = "abc";
        char[] charArray = str.toCharArray();
        int len = charArray.length;
        int start = 0;

        generatePermutation(str, 0, len);


    }

    public static String swapString(String str, int i, int j) {
        char[] b = str.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void generatePermutation(String str, int start, int end) {
        if (start == end - 1) {
            System.out.println(str);
        } else {
            for (int i = start; i < end; i++) {
                str = swapString(str, start, i);
                generatePermutation(str, start + 1, end);

                str = swapString(str, start, i);

            }
        }
    }

}
