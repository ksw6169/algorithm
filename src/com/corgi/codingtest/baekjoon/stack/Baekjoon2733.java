package com.corgi.codingtest.baekjoon.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * [BAEKJOON-2733] Brainf*ck
 * reference: https://www.acmicpc.net/problem/2733
 */
public class Baekjoon2733 {

    private static int pointer;
    private static int[] arr;
    private static StringBuilder result = new StringBuilder();
    private static Map<Integer, Integer> indexMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        for (int i=1; i<=n; i++) {
            pointer = 0;
            arr = new int[32768];
            indexMap.clear();

            result.append(String.format("PROGRAM #%d:\n", i));

            // 명령어 정제
            StringBuilder input = new StringBuilder();

            while (true) {
                String line = br.readLine().replace(" ", "");

                if (line.equals("end"))
                    break;

                line = line.contains("%") ? line.substring(0, line.indexOf("%")) : line;

                input.append(line);
            }

            // 대괄호 처리
            String code = input.toString();
            Stack<Integer> stack = new Stack<>();
            try {
                for (int j = 0; j < code.length(); j++) {
                    char c = code.charAt(j);

                    if (c == '[') {
                        stack.push(j);
                    } else if (c == ']') {
                        int idx = stack.pop();
                        indexMap.put(idx, j);
                        indexMap.put(j, idx);
                    }
                }
            } catch (Exception e) {
                result.append("COMPILE ERROR\n");
                continue;
            }

            if (!stack.isEmpty()) {
                result.append("COMPILE ERROR");
            } else {
                for (int j = 0; j < code.length(); j++) {
                    switch (code.charAt(j)) {
                        case '>':
                            pointer = pointer == 32767 ? 0 : (pointer + 1);
                            break;
                        case '<':
                            pointer = pointer == 0 ? 32767 : (pointer - 1);
                            break;
                        case '+':
                            arr[pointer] = arr[pointer] == 255 ? 0 : (arr[pointer] + 1);
                            break;
                        case '-':
                            arr[pointer] = arr[pointer] == 0 ? 255 : (arr[pointer] - 1);
                            break;
                        case '.':
                            result.append((char)arr[pointer]);
                            break;
                        case '[':
                            j = arr[pointer] == 0 ? indexMap.get(j) : j;
                            break;
                        case ']':
                            j = arr[pointer] != 0 ? indexMap.get(j) - 1 : j;
                            break;
                    }
                }
            }

            result.append("\n");
        }

        System.out.println(result);
        br.close();
    }
}