package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1089 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int d = Integer.parseInt(inputs[1]);
        int n = Integer.parseInt(inputs[2]);

        for (int i=0; i<n-1; i++) {
            a += d;
        }

        System.out.println(a);
    }
}
