package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alpha = br.readLine();

        if (alpha.equals("A")) {
            System.out.println("best!!!");
        } else if (alpha.equals("B")) {
            System.out.println("good!!");
        } else if (alpha.equals("C")) {
            System.out.println("run!");
        } else if (alpha.equals("D")) {
            System.out.println("slowly~");
        } else {
            System.out.println("what?");
        }
    }
}
