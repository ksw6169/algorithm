package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        switch (num / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 7:
            case 8:
                System.out.println("B");
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
                break;
        }
    }
}
