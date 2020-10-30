package io.github.devtiagom.hackerrankjava.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaLoopsII {

    public static void solution() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String response = "";

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            response += solve(a, b, n) + "\n";
        }

        System.out.println(response);
        in.close();
    }

    private static String solve(int a, int b, int n) {
        List<Integer> serie = new ArrayList<>();
        String response = "";

        serie.add(a + b);
        for (int i = 1; i < n; i++) serie.add(serie.get(i - 1) + (int)(Math.pow(2, i) * b));
        for (Integer item : serie) response += item + " ";

        return response;
    }
}
