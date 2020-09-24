package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1095 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] calls = br.readLine().split(" ");

        int min = Integer.parseInt(calls[0]);

        for (int i=0; i<calls.length; i++) {
            int call = Integer.parseInt(calls[i]);

            if (min > call) {
                min = call;
            }
        }

        System.out.println(min);
    }
}
