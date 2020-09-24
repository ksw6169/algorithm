package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1091 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        long a = Integer.parseInt(inputs[0]);
        long m = Integer.parseInt(inputs[1]);
        long d = Integer.parseInt(inputs[2]);
        long n = Integer.parseInt(inputs[3]);

        for (int i=0; i<n-1; i++) {
            a = a * m + d;
        }

        System.out.println(a);
    }
}
