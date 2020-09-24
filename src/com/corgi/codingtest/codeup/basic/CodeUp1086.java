package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        long w = Long.parseLong(inputs[0]);
        long h = Long.parseLong(inputs[1]);
        long b = Long.parseLong(inputs[2]);

        long input = Long.parseUnsignedLong(String.valueOf(w*h*b));
        double result = input / 1024.0;
        result = result / 1024.0;
        result = result / 8.0;

        System.out.println(String.format("%.2f MB", result));
    }
}
