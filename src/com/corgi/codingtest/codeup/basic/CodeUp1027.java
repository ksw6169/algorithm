package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\.");
        System.out.println(String.format("%02d-%02d-%04d",
                Integer.parseInt(input[2]),
                Integer.parseInt(input[1]),
                Integer.parseInt(input[0])));
    }
}
