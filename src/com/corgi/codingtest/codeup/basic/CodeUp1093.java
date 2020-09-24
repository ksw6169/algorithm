package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CodeUp1093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] calls = br.readLine().split(" ");

        int[] results = new int[24];

        for (int i=0; i<calls.length; i++) {
            results[Integer.parseInt(calls[i])]++;
        }

        for (int i=1; i<results.length; i++) {
            System.out.print(results[i]+" ");
        }
    }
}
