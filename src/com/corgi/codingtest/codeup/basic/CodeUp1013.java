package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputText = br.readLine().split(" ");
        System.out.println(Integer.parseInt(inputText[0]) + " " + Integer.parseInt(inputText[1]));
    }
}
