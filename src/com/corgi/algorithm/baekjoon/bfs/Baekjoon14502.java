package com.corgi.algorithm.baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * [BAEKJOON-14502] 연구소
 * reference: https://www.acmicpc.net/problem/14502
 */
public class Baekjoon14502 {

    private static final int EMPTY = 0;
    private static final int WALL = 1;
    private static final int VIRUS = 2;
    private static final int MAX_WALL_COUNT = 3;

    private static final int[] dx = { -1, 1, 0, 0 };
    private static final int[] dy = { 0, 0, -1, 1 };

    private static int N;
    private static int M;
    private static int[][] map;

    private static int result = 0;

    private static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }
        public int getY() { return y; }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = String.valueOf(br.readLine()).split(" ");
        N = Integer.valueOf(inputs[0]);
        M = Integer.valueOf(inputs[1]);

        map = new int[N][M];

        for (int i=0; i<N; i++) {
            inputs = String.valueOf(br.readLine()).split(" ");

            for (int j=0; j<M; j++) {
                map[i][j] = Integer.valueOf(inputs[j]);
            }
        }

        dfs(0);

        System.out.println(result);
    }

    private static void dfs(int depth) {
        if (depth == MAX_WALL_COUNT) {
            bfs();
            return;
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (map[i][j] == EMPTY) {
                    map[i][j] = WALL;
                    dfs(depth + 1);
                    map[i][j] = EMPTY;
                }
            }
        }
    }

    private static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        int[][] copiedMap = new int[N][M];

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                copiedMap[i][j] = map[i][j];

                if (map[i][j] == VIRUS) {
                    queue.add(new Point(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Point point = queue.remove();

            for (int i=0; i<4; i++) {
                int tx = point.getX() + dx[i];
                int ty = point.getY() + dy[i];

                if (tx >= 0 && ty >= 0 && tx < N && ty < M) {
                    if (copiedMap[tx][ty] == EMPTY) {
                        copiedMap[tx][ty] = VIRUS;
                        queue.add(new Point(tx, ty));
                    }
                }
            }
        }

        count(copiedMap);
    }

    private static void count(int[][] copiedMap) {
        int count = 0;

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (copiedMap[i][j] == EMPTY)
                    count++;
            }
        }

        result = Math.max(result, count);
    }
}
