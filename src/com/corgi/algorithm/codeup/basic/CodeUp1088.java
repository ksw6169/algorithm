package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1088 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        for (int i=1; i<=input; i++) {
            System.out.print(i%3 != 0 ? i+" " : "");
        }
    }
}
