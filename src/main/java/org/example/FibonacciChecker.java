package org.example;

import java.util.Scanner;

public class FibonacciChecker {
    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập 1 số nguyên dương (n) kiểm tra có phải là số Fibonacci hay không: ");
            int n = scanner.nextInt();

            if (isFibonacci(n)) {
                System.out.println(n + " là số Fibonacci");
            } else {
                System.out.println(n + " không phải là số Fibonacci");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Lỗi: n không phải là số nguyên dương");
        }
    }
}
