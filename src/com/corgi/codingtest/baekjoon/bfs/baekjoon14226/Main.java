package com.corgi.codingtest.baekjoon.bfs.baekjoon14226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [BAEKJOON-14226] 이모티콘
 * reference: https://www.acmicpc.net/problem/14226
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int S = Integer.valueOf(br.readLine());

        // 방문 여부를 확인할 배열로 [Clipboard][Screen]의 형식으로 데이터 체크
        int[][] check = new int[S+1][S+1];

        // 방문 노드를 순차적으로 담아 처리하는 큐
        // 여기서는 가독성을 위해 Entry를 사용했음(오토박싱/오토언박싱으로 인해 성능 저하가 발생할 수 있음)
        Queue<Map.Entry<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleEntry<>(0, 1));

        while (!queue.isEmpty()) {
            Map.Entry<Integer, Integer> entry = queue.remove();

            int clipboard = entry.getKey();
            int screen = entry.getValue();

            if (screen == S)
                break;

            // Case 1. screen에 있는 내용을 clipboard에 담을 때
            if (check[screen][screen] == 0) {
                check[screen][screen] = check[clipboard][screen] + 1;
                queue.add(new AbstractMap.SimpleEntry<>(screen, screen));
            }

            // Case 2. clipboard에 있는 내용을 screen에 담을 때
            if (screen+clipboard <= S && check[clipboard][screen + clipboard] == 0) {
                check[clipboard][screen+clipboard] = check[clipboard][screen] + 1;
                queue.add(new AbstractMap.SimpleEntry<>(clipboard, screen+clipboard));
            }

            // Case 3. screen의 이모티콘 하나 삭제
            if (screen-1 > 0 && check[clipboard][screen-1] == 0) {
                check[clipboard][screen-1] = check[clipboard][screen] + 1;
                queue.add(new AbstractMap.SimpleEntry<>(clipboard, screen-1));
            }
        }

        /**
         * [소요시간 계산]
         * 이미 방문한 노드일 경우
         * 기존 소요시간보다 시간이 단축되었을 경우 소요시간을 갱신함
         */
        int seconds = 0;

        for (int i=0; i<=S; i++) {
            if (check[i][S] > 0) {
                if (seconds == 0 || seconds > check[i][S]) {
                    seconds = check[i][S];
                }
            }
        }

        System.out.println(seconds);
    }
}
