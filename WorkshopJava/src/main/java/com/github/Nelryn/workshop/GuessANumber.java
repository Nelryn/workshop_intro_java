package com.github.Nelryn.workshop;
import java.lang.Math;
import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static int max = 100;
    public static int min = 1;
    public static void main(String[] args) {
        if (args.length == 2) {
            min = Integer.parseInt(args[0]);
            max = Integer.parseInt(args[1]);
        }
        guessIt();
    }

    private static void guessIt() {
        Scanner myObj = new Scanner(System.in);
        int randomNb = (int)(Math.random() * (max - min + 1) + min);
        int count = 0;
        int guess = 0;

        while (guess != randomNb) {
            System.out.print("Your guess? ");
            guess = Integer.parseInt(myObj.nextLine());
            if (guess < randomNb)
                System.out.println("Too low!");
            if (guess > randomNb)
                System.out.println("Too high!");
            if (guess == randomNb)
                System.out.println("You win!");
            count++;
        }
        System.out.println("It took you " + count + " tries.");
    }
}
