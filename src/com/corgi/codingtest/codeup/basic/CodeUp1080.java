package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1080 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int total = 0;
        int result = 0;

        for (int i=1; total < input; i++) {
            total += i;
            result = i;
        }

        System.out.println(result);
    }
}
