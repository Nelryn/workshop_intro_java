package com.github.Nelryn.workshop;

public class Fibonacci {
    public static int nb1 = 1;
    public static int nb2 = 1;
    public static int max = 10;

    public static void main(String[] args) {
        if (args.length == 1)
            max = Integer.parseInt(args[0]);
    }

    public static void computeIt() {
        int swap = nb2;
        for (int i = 1; i < max; i++) {
            swap = nb2;+2
            nb2 = nb1 + nb2;
            nb1 = swap;
        }
    }
}
