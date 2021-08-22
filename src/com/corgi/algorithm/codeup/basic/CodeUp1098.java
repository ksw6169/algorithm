package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1098 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int h = Integer.parseInt(inputs[0]);    // 격자판 세로 길이
        int w = Integer.parseInt(inputs[1]);    // 격자판 가로 길이

        int[][] checkerBoard = new int[h][w];

        inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);    // 막대의 개수

        for (int i=0; i<n; i++) {
            inputs = br.readLine().split(" ");

            int l = Integer.parseInt(inputs[0]);    // 막대의 길이
            int d = Integer.parseInt(inputs[1]);    // 막대의 방향(가로는 0, 세로는 1)
            int x = Integer.parseInt(inputs[2]);    // 막대의 좌표(x)
            int y = Integer.parseInt(inputs[3]);    // 막대의 좌표(y)

            for (int j=0; j<l; j++) {
                if (d == 0) {
                    checkerBoard[x-1][y-1+j] = 1;
                } else {
                    checkerBoard[x-1+j][y-1] = 1;
                }
            }
        }

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                System.out.print((checkerBoard[i][j] == 1 ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}
