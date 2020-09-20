package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\.");
        System.out.println(String.format("%04d.%02d.%02d", Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
    }
}
