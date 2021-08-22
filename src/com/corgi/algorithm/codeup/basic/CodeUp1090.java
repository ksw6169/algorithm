package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1090 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int r = Integer.parseInt(inputs[1]);
        int n = Integer.parseInt(inputs[2]);

        System.out.println(a * (long) Math.pow(r, n-1));
    }
}
