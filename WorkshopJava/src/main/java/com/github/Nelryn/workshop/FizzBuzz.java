package com.github.Nelryn.workshop;

public class FizzBuzz {
    public static void main(String[] args) {
        doFizzBuzz();
    }

    public static void doFizzBuzz() {
        int nb = 1;

        while (nb <= 200) {
            if (nb % 3 == 0 && nb % 5 == 0)
                System.out.println(nb + " -> FizzBuzz");
            else if ((nb % 3) == 0)
                System.out.println(nb + " -> Fizz");
            else if ((nb % 5) == 0)
                System.out.println(nb + " -> Buzz");
            else
                System.out.println(nb);
            nb++;
        }
    }
}
