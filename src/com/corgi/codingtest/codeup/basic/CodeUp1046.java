package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        long num1 = Long.parseLong(input[0]);
        long num2 = Long.parseLong(input[1]);
        long num3 = Long.parseLong(input[2]);

        double sum = num1 + num2 + num3;
        double average = sum / 3;

        System.out.println((long) sum);
        System.out.println(String.format("%.1f", average));
    }
}