package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        long num1 = Long.parseLong(input[0]);
        long num2 = Long.parseLong(input[1]);

        System.out.println(num1 > num2 ? 1 : 0);
    }
}
