package com.bridgelab.program;

import java.util.Arrays;

public class PrimeAnagramRange2DArray {
	public static void main(String[] args) {

        PrimeNumber2DArray p = new PrimeNumber2DArray();
        PrimeAnagramRange2DArray pa = new PrimeAnagramRange2DArray();

        int start = 0;
        int end = 100;
        int[][] primeAnagramNumbers = new int[10][];

        int j1 = 0, j2 = 0;

        // declaring array
        for (int i = 0; i < 10; i++) {
            for (int j = start; j <= end; j++) {
                if (p.isPrime(j)) {
                    for (int k = j + 1; k < end; k++) {
                        if (p.isPrime(k)) {
                            if (pa.isAnagram(String.valueOf(j), String.valueOf(k))) {
                                j1 += 2;
                            }
                        }
                    }
                }
            }
            primeAnagramNumbers[i] = new int[j1];
            start = end + 1;
            end += 100;
            j1 = 0;
        }

        start = 0;
        end = 100;

        // putting values inside array
        for (int i = 0; i < 10; i++) {
            for (int j = start; j <= end; j++) {
                if (p.isPrime(j)) {
                    for (int k = j + 1; k < end; k++) {
                        if (p.isPrime(k)) {
                            if (pa.isAnagram(String.valueOf(j), String.valueOf(k))) {
                                primeAnagramNumbers[i][j2] = j;
                                primeAnagramNumbers[i][j2 + 1] = k;
                                j2 += 2;
                            }
                        }
                    }
                }
            }
            start = end + 1;
            end += 100;
            j2 = 0;
        }

        //printing array
        for (int i = 0; i < primeAnagramNumbers.length; i++) {
            for (int j = 0; j < primeAnagramNumbers[i].length; j++) {
                System.out.print(primeAnagramNumbers[i][j] + " ");
            }
            if (primeAnagramNumbers[i].length != 0)
                System.out.println();
        }

    }

    
    public boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (str1.length() != str2.length())
            return false;
        else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2))
                return true;
        }
        return false;
    }


}
