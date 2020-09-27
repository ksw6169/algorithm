package com.corgi.codingtest.codeup.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1099 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] maze = new int[10][10];

        for (int i=0; i<maze.length; i++) {
            String[] inputs = br.readLine().split(" ");

            for (int j=0; j<maze[i].length; j++) {
                maze[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        boolean result = false;

        int x = 1;

        // 개미는 (1,1) 부터 출발
        for (int i=1; i<maze.length; i++) {
            for (; x<maze[i].length; x++) {
                if (maze[i][x] == 0) {
                    maze[i][x] = 9;
                } else {
                    if (maze[i][x] == 2) {
                        maze[i][x] = 9;
                        result = true;
                    } else {
                        x--;
                    }
                    break;
                }
            }

            if (result) {
                break;
            }
        }

        for (int i=0; i<maze.length; i++) {
            for (int j=0; j<maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
