package com.corgi.algorithm.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1097 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] checkerBoard = new int[20][20];

        for (int i=1; i<checkerBoard.length; i++) {
            String[] inputs = br.readLine().split(" ");

            for (int j=1; j<checkerBoard[i].length; j++) {
                checkerBoard[i][j] = Integer.parseInt(inputs[j-1]);
            }
        }

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String[] inputs = br.readLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);

            // 가로줄 뒤집기
            for (int j=1; j<20; j++) {
                checkerBoard[x][j] = (checkerBoard[x][j] == 0) ? 1 : 0;
            }

            // 세로줄 뒤집기
            for (int j=1; j<20; j++) {
                checkerBoard[j][y] = (checkerBoard[j][y] == 0) ? 1 : 0;
            }
        }

        for (int i=1; i<checkerBoard.length; i++) {
            for (int j=1; j<checkerBoard[i].length; j++) {
                System.out.print(checkerBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
