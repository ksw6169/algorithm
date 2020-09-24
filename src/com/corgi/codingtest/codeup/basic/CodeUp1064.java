package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int num1 = Integer.parseInt(inputs[0]);
        int num2 = Integer.parseInt(inputs[1]);
        int num3 = Integer.parseInt(inputs[2]);

        System.out.println((num2 > num1 && num3 > num1) ? num1 :
                (num1 > num2 && num3 > num2) ? num2 :
                        (num1 > num3 && num2 > num3) ? num3 : num1);
    }
}
