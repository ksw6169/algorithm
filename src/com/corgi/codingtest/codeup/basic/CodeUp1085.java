package com.corgi.codingtest.codeup.basic;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CodeUp1085 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int h = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int s = Integer.parseInt(input[3]);

        long inputs = Long.parseUnsignedLong(String.valueOf((long) h*b*c*s));
        double result = inputs / 1024.0;
        result = result / 1024.0;
        result = result / 8.0;

        System.out.println(String.format("%.1f MB", result));
    }
}
