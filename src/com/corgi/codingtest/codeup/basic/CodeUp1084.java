package com.corgi.codingtest.codeup.basic;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 0;

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<r; i++) {
            for (int j=0; j<g; j++) {
                for (int k=0; k<b; k++) {
                    writer.write(i + " " + j + " " + k);
                    writer.newLine();

                    count++;
                }
            }
        }

        writer.flush();

        System.out.println(count);
    }
}
