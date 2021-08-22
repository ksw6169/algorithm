package com.corgi.algorithm.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];
        int sum = 0;

        for (int i=0; i<array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
            sum += array[i];
        }

        // sorting
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        int x = 0;
        int y = 0;

        boolean result = false;

        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                x = i;
                y = j;

                if ((sum - (array[x] + array[y])) == 100) {
                    result = true;
                    break;
                }
            }

            if (result) {
                break;
            }
        }

        for (int i=0; i<array.length; i++) {
            if (i != x && i != y) {
                System.out.println(array[i]);
            }
        }
    }
}
