package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1081 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int num1 = Integer.parseInt(inputs[0]);
        int num2 = Integer.parseInt(inputs[1]);

        for (int i=1; i<=num1; i++) {
            for (int j=1; j<=num2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
