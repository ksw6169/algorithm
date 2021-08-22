package com.corgi.algorithm.codeup.basic;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[19][19];

        int n = scanner.nextInt();

        for (int i=0; i<n; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            array[num1-1][num2-1] = 1;
        }

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
