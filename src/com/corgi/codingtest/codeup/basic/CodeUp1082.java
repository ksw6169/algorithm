package com.corgi.codingtest.codeup.basic;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(16);

        for (int i=1; i<16; i++) {
            System.out.println(String.format("%X*%X=%X", n, i, n*i));
        }
    }
}
