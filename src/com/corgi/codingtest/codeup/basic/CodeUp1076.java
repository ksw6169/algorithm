package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class CodeUp1076 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char input = br.readLine().charAt(0);

        char start = 97;

        while (input != start) {
            System.out.print(start++);
            System.out.print(" ");
        }

        System.out.println(input);
    }
}
