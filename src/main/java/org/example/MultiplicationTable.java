package org.example;

public class MultiplicationTable {

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        int i = 2;
        while (i <= 9) {
            System.out.printf("%n");
            printMultiplicationTable(i);
            i++;
        }
    }
}
