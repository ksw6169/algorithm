package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1094 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] calls = br.readLine().split(" ");

        for (int i=calls.length-1; i>=0; i--) {
            System.out.println(calls[i]);
        }
    }
}
