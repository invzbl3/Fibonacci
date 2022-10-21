package com.fibonacci;

import java.util.Arrays;

/**
 * @author invzbl3 on 10/21/2022
 * @project Finbonacci
 */
class Fibonacci {
    public static int fibonacci_numbers(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci_numbers(n - 2) + fibonacci_numbers(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 21;

        int[] fibo_numbers = new int [number];
        Arrays.fill(fibo_numbers, 1); // [1, 1, 1, 1]

        for (int i = 0; i < number; i++) {
            fibo_numbers[i]=fibonacci_numbers(i);
            System.out.print(fibonacci_numbers(i) + " ");
        }

        System.out.println("\n\nFibonacci series for " + number + " numbers : ");
        System.out.println("\n\nMean " + mean(number));
        System.out.println("\n\nMedian " + median((fibo_numbers)));
    }

    public static float mean(int number) {
        int fibo1 = 1, fibo2 = 1, sum = 0, average = 0, fibonacci;
        for (int i = 1; i <= 2 && i <= number; i++) {
            System.out.print("1 ");
            sum += 1;
        }
        for (int i = 3; i < number; i++) {
            fibonacci = fibo1 + fibo2;
            System.out.print(fibonacci + " ");
            fibo1 = fibo2;
            fibo2 = fibonacci;
            sum += fibonacci;
        }
        return (float)sum/number;
    }

    public static double median(int[] m) {
        int middle = m.length / 2;
        if (m.length % 2 == 1) {
            return m[middle];
        } else {
            return (m[middle - 1] + m[middle]) / 2;
        }
    }
}