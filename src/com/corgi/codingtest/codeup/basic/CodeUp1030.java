package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class CodeUp1030 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal input = BigDecimal.valueOf(Long.parseLong(br.readLine()));
        System.out.println(input);
    }
}
