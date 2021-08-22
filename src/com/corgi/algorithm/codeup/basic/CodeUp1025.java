package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i=0; i<input.length(); i++) {
            int num = input.charAt(i) - '0';
            System.out.println("[" + num * (int) (Math.pow(10, input.length()-i-1)) + "]");
        }
    }
}
