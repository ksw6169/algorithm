package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        System.out.println(num1 * (num2 > 0 ? (2 << num2 - 1) : 1));
    }
}
