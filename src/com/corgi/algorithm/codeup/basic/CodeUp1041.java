package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = (int) br.readLine().charAt(0) + 1;
        System.out.println((char) a);
    }
}
