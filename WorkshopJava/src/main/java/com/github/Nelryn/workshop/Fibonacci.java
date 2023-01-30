package com.github.Nelryn.workshop;

public class Fibonacci {
    public static int nb1 = 10;
    public static int nb2 = 10;
    public static void main(String[] args) {
        if (args.length == 1) {
            nb1 = Integer.parseInt(args[0]);
            nb2 = nb1;
        }
    }

    public static void computeIt() {
        
    }
}
