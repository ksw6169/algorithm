package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        boolean bool1 = Integer.parseInt(inputs[0]) == 1 ? true : false;
        boolean bool2 = Integer.parseInt(inputs[1]) == 1 ? true : false;

        System.out.println(bool1 && bool2 ? 1 : 0);
    }
}
